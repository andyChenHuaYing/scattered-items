package org.oscar.mail.service.impl;

import org.oscar.mail.service.ICommunicate;
import org.oscar.mail.support.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.mail.*;
import javax.mail.internet.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/7/9
 */
public class JavaMailImpl implements ICommunicate {

    private static final Logger LOGGER = LoggerFactory.getLogger(JavaMailImpl.class);

    @Override
    public String sendSimpleMail(List<String> addressList, String title, Object content) {
        LOGGER.debug("|- Start send simple email...");

        Properties props = new Properties();
        //使用的邮件服务器类型
        props.setProperty(Constants.MAIL_HOST_KEY, Constants.MAIL_HOST_VALUE);
        //使用的认证方式
        props.setProperty(Constants.MAIL_AUTH_KEY, Constants.MAIL_AUTH_VALUE);
        //是否支持ssl协议
//        props.setProperty(Constants.MAIL_SMTP_SSL_ENABLE_KEY, Constants.MAIL_SMTP_SSL_ENABLE_VALUE);

        //不再使用下面这种认证用户名密码方式，把简单的问题复杂话了，可以直接在Transport.send方法中传递用户名和密码
        @SuppressWarnings("unused")
        Authenticator authenticator = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(Constants.MAIL_USERNAME, Constants.MAIL_PASSWORD);
            }
        };

        Session session = Session.getInstance(props, authenticator);
        MimeMessage msg = new MimeMessage(session);
        try {
            // 设置邮件的发件人
            msg.setFrom(new InternetAddress(Constants.MAIL_FROM));
            // 设置收件人
            Address[] adds = convertAddress(addressList);
            msg.setRecipients(Message.RecipientType.TO, adds);
            // 设置邮件标题
            msg.setSubject(title);
            // 设置邮件内容
            msg.setContent(content, Constants.MAIL_TYPE);
            //发邮件
//            Transport.send(msg, Constants.MAIL_USERNAME, Constants.MAIL_PASSWORD);
            Transport.send(msg);
        } catch (MessagingException e) {
            e.printStackTrace();
            return "Send failed, the reason:" + e.getMessage();
        }
        return " Send success";
    }

    public String sendEmailWithAttachment(List<String> addressList, String title, String content, List<File> attachments) {
        String result = "Send success";

        LOGGER.debug("|- Start send simple email...");

        Properties props = new Properties();
        //使用的邮件服务器类型
        props.setProperty(Constants.MAIL_HOST_KEY, Constants.MAIL_HOST_VALUE);
        //使用的认证方式
        props.setProperty(Constants.MAIL_AUTH_KEY, Constants.MAIL_AUTH_VALUE);
        //是否支持ssl协议
//        props.setProperty(Constants.MAIL_SMTP_SSL_ENABLE_KEY, Constants.MAIL_SMTP_SSL_ENABLE_VALUE);

        //不再使用下面这种认证用户名密码方式，把简单的问题复杂话了，可以直接在Transport.send方法中传递用户名和密码
        @SuppressWarnings("unused")
        Authenticator authenticator = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(Constants.MAIL_USERNAME, Constants.MAIL_PASSWORD);
            }
        };

//        Session session = Session.getInstance(props, authenticator);
        Session session = Session.getInstance(props);
        MimeMessage msg = new MimeMessage(session);
        try {
            // 设置邮件的发件人
            msg.setFrom(new InternetAddress(Constants.MAIL_FROM));
            // 设置收件人
            Address[] adds = convertAddress(addressList);
            msg.setRecipients(Message.RecipientType.TO, adds);
            // 设置邮件标题
            msg.setSubject(title);
            // 设置邮件内容
            Multipart multipart = new MimeMultipart();
            MimeBodyPart bodyContent = new MimeBodyPart();
            bodyContent.setText(content);
            multipart.addBodyPart(bodyContent);
            for (File file : attachments) {
                MimeBodyPart attachmentBodyPart = new MimeBodyPart();
                attachmentBodyPart.attachFile(file);
                multipart.addBodyPart(attachmentBodyPart);
            }
            msg.setContent(multipart);
            //发邮件
            Transport.send(msg, Constants.MAIL_USERNAME, Constants.MAIL_PASSWORD);
//            Transport.send(msg);
        } catch (MessagingException e) {
            e.printStackTrace();
            result += e.getMessage();
            return result;
        } catch (IOException e) {
            result += e.getMessage();
            return result;
        }
        return result;

    }


    /**
     * 将字符串类型邮箱地址转换为java mail能使用的邮箱地址
     *
     * @param addressList 字符串类型邮箱地址集合
     * @return java mail使用的邮箱地址集合
     */
    private Address[] convertAddress(List<String> addressList) throws AddressException {
        List<Address> addresses = new ArrayList<>();
        for (String addressStr : addressList) {
            //这里没有做邮箱的合法性校验，只是做了非空和null
            if (addressStr != null && addressStr.length() > 0) {
                addresses.add(new InternetAddress(addressStr));
            }
        }
        return addresses.toArray(new Address[addresses.size()]);
    }
}
