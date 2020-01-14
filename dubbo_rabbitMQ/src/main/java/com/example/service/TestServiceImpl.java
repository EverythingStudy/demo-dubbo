package com.example.service;

import com.example.constant.RabbitConfig;
import com.example.dao.MsgLogMapper;
import com.example.entity.MsgLog;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.ServerResponse;

/**
 * @Description
 * @Date 2020/1/10 13:56
 * @Author cly
 **/
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private MsgLogMapper msgLogMapper;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public ServerResponse send(Mail mail) {
        String msgId = Random.UUID32();
        mail.setMsgId(msgId);

        MsgLog msgLog = new MsgLog(msgId, mail, RabbitConfig.MAIL_EXCHANGE_NAME, RabbitConfig.MAIL_ROUTING_KEY_NAME);
        msgLogMapper.insert(msgLog);// 消息入库

        CorrelationData correlationData = new CorrelationData(msgId);
        rabbitTemplate.convertAndSend(RabbitConfig.MAIL_EXCHANGE_NAME, RabbitConfig.MAIL_ROUTING_KEY_NAME, MessageHelper.objToMsg(mail), correlationData);// 发送消息

        return ServerResponse.success(ResponseCode.MAIL_SEND_SUCCESS.getMsg());
    }
}
