package com.example.util;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Date 2020/1/10 12:59
 * @Author cly
 **/
@Component
public class MailUtil {
    @Value("${spring.mail.from}")
    private String from;
    @Autowired
    private JavaMailSender mailSender;

    /**
     * 发送简单邮件
     *
     * @param
     */
    public boolean send() {
        String to = "";// 目标邮箱
        String title = "";// 邮件标题
        String content = "";// 邮件正文

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject(title);
        message.setText(content);

        try {
            mailSender.send(message);
            //log.info("邮件发送成功");
            return true;
        } catch (MailException e) {
           // log.error("邮件发送失败, to: {}, title: {}", to, title, e);
            return false;
        }
    }
    @Test
public void get(){
    System.out.println(from);
}
}
