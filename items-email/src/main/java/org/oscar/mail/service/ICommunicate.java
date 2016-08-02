package org.oscar.mail.service;

import java.util.List;

/**
 * Description :
 * 发送消息接口
 *
 * @author : oscar
 * @version :1.0, 2016/7/9
 */
public interface ICommunicate {

    /**
     * 使用Java Mail发送简单邮件，不支持附件功能
     *
     * @param addressList 邮件地址集合，支持群发
     * @param title       邮件标题
     * @param content     邮件内容，支持html格式，如：<h1>Mail Title</h1>
     * @return 发送结果
     */
    String sendSimpleMail(List<String> addressList, String title, Object content);
}
