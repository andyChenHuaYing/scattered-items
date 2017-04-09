package org.oscar.mail.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.oscar.mail.support.Constants;
import org.oscar.mail.support.Generator;

import javax.mail.*;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaMailImplTest {
    private List<String> addressList;
    private JavaMailImpl javaMail;

    @Before
    public void setUp() {
        this.addressList = new ArrayList<>();
        addressList.add("461857202@qq.com");
        addressList.add("a461857202@163.com");
        javaMail = new JavaMailImpl();
    }


    @Test
    public void testSendSimpleMail() throws Exception {
        String title = Generator.generate(10);
        String content = "<h1>" + Generator.generate(20) + "</h1>";

        String result = javaMail.sendSimpleMail(addressList, title, content);
        System.out.println(result);

    }

    @Test
    public void testSendTextAttacheMail() throws Exception {
        // create and fill the first message part
        MimeBodyPart mbp1 = new MimeBodyPart();
        mbp1.setText(Generator.generate(10));

        // create and fill the second message part
        MimeBodyPart mbp2 = new MimeBodyPart();
        // Use setText(text, charset), to show it off !
        mbp2.setText(Generator.generate(100), "utf-8");

        // create the Multipart and its parts to it
        Multipart mp = new MimeMultipart();
        mp.addBodyPart(mbp1);
        mp.addBodyPart(mbp2);
        System.out.println(sendMail(mp));

    }

    @Test
    public void testSendFileAttacheMail() throws Exception {
        MimeBodyPart content = new MimeBodyPart();
        content.setText(Generator.generate(10), "utf-8");

        //添加附件,这种方式只能设置TXT格式
        //MimeBodyPart attachment = new MimeBodyPart(new FileInputStream(new File("D:\\temp\\关于综合服务网络平台的相关建议2016.7.4.docx")));

        MimeBodyPart attachment = new MimeBodyPart();
        attachment.attachFile(new File("D:\\temp\\关于综合服务网络平台的相关建议2016.7.4.docx"), "application/msword", "utf-8");

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(content);
        multipart.addBodyPart(attachment);
        System.out.println(sendMail(multipart));

    }

    @Test
    public void testSendEmailWithAttachment() throws Exception {
        File file = new File("D:\\temp");
        File[] fileArr = file.listFiles();
        String result = this.javaMail.sendEmailWithAttachment(addressList, Generator.generate(10),
                Generator.generate(100), Arrays.asList(fileArr));
        System.out.println(result);
    }

    @Test
    public void testStore() {
        Session session = Session.getInstance(System.getProperties());
        try {
            Store store = session.getStore(new URLName("imap://a461857202:a461857202@imap.163.com"));
            store.connect("imap.163.com", Constants.MAIL_USERNAME, Constants.MAIL_PASSWORD);
            Folder emailFolder = store.getFolder("INBOX");
            emailFolder.open(Folder.READ_ONLY);
            System.out.println(emailFolder.isOpen());
            System.out.println(emailFolder.getFullName());
            Message[] messages = emailFolder.getMessages();
            System.out.println("messages.length---" + messages.length);

            for (int i = 0, n = messages.length; i < n; i++) {
                Message message = messages[i];
                System.out.println("---------------------------------");
                System.out.println("Email Number " + (i + 1));
                System.out.println("Subject: " + message.getSubject());
                System.out.println("From: " + message.getFrom()[0]);
                System.out.println("Text: " + message.getContent().toString());

            }
        } catch (MessagingException | IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetMailAllFolder() throws MessagingException, IOException {
        Session session = Session.getInstance(System.getProperties());
        Store store = session.getStore("imap");
        store.connect("imap.163.com", Constants.MAIL_USERNAME, Constants.MAIL_PASSWORD);
        store.getPersonalNamespaces();
        Folder folder = store.getDefaultFolder();
        System.out.println("|--" + "Root");

        for (Folder folder1 : folder.list()) {
            folder1.open(Folder.READ_ONLY);
            System.out.println("|----" + folder1.getFullName() + "(" + folder1.getMessageCount() + ")");

            Message[] messages = folder1.getMessages();
            for (Message message : messages) {
                int messageNumber = message.getMessageNumber();
                String messageTitle = message.getSubject();

                int attachmentCount = 0;
                Object content = message.getContent();
                if (content instanceof MimeMultipart && messageNumber == 7) {
                    Multipart multipart = (Multipart) message.getContent();
                    attachmentCount = multipart.getCount();
                    if (attachmentCount > 0) {
                        for (int i = 0; i < attachmentCount; i++) {
                            MimeBodyPart mimeBodyPart = (MimeBodyPart) multipart.getBodyPart(i);
                            String fileName = mimeBodyPart.getFileName();
                            mimeBodyPart.saveFile(Constants.MAIL_ATTACHMENT_SAVE_PATH + fileName);
                        }
                    }
                }
                System.out.println("|------" + messageNumber + "(" + attachmentCount + ")" + ":" + messageTitle);


            }
            folder1.close(false);
            store.close();
        }
    }

    @Test
    public void testReadAttachment() throws Exception {
        Session session = Session.getInstance(System.getProperties());
        Store store = session.getStore("imap");
        store.connect("imap.163.com", Constants.MAIL_USERNAME, Constants.MAIL_PASSWORD);
        store.getPersonalNamespaces();
        Folder folder = store.getDefaultFolder();
        System.out.println("|--" + "Root");

        for (Folder folder1 : folder.list()) {
            folder1.open(Folder.READ_ONLY);
            System.out.println("|----" + folder1.getFullName() + "(" + folder1.getMessageCount() + ")");

            Message[] messages = folder1.getMessages();
            for (Message message : messages) {
                int messageNumber = message.getMessageNumber();
                String messageTitle = message.getSubject();
                Multipart multipart = (Multipart) message.getContent();
                multipart.getCount();
            }
        }

    }


    /**
     * 发送邮件
     *
     * @param multipart 邮件内容
     * @return 发送结果
     */
    private String sendMail(Multipart multipart) {
        return javaMail.sendSimpleMail(addressList, Generator.generate(10), multipart);
    }


}