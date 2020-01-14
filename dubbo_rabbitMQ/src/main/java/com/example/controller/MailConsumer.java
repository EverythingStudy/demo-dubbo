package com.example.controller;

import com.example.constant.RabbitConfig;
import com.example.entity.MsgLog;
import com.example.util.MailUtil;
import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @Description
 * @Date 2020/1/10 13:57
 * @Author cly
 **/
@Component
@Slf4j
public class MailConsumer {
    @Autowired
    private MsgLogService msgLogService;

    @Autowired
    private MailUtil mailUtil;

    @RabbitListener(queues = RabbitConfig.MAIL_QUEUE_NAME)
    public void consume(Message message, Channel channel) throws IOException {
        Mail mail = MessageHelper.msgToObj(message, Mail.class);
        log.info("收到消息: {}", mail.toString());

        String msgId = mail.getMsgId();

        MsgLog msgLog = msgLogService.selectByMsgId(msgId);
        if (null == msgLog || msgLog.getStatus().equals(Constant.MsgLogStatus.CONSUMED_SUCCESS)) {// 消费幂等性
            log.info("重复消费, msgId: {}", msgId);
            return;
        }

        MessageProperties properties = message.getMessageProperties();
        long tag = properties.getDeliveryTag();

        boolean success = mailUtil.send(mail);//发送
        if (success) {
            msgLogService.updateStatus(msgId, Constant.MsgLogStatus.CONSUMED_SUCCESS);
            channel.basicAck(tag, false);// 手动消费确认
        } else {
            channel.basicNack(tag, false, true);
        }
    }
}
