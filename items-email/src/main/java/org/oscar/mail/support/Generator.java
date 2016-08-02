package org.oscar.mail.support;

import sun.nio.cs.ext.GBK;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Description :
 * 生成器，主要是为了随机生成邮件标题，内容。防止内容重复，使得Java Mail发送的邮件被视为垃圾邮件
 *
 * @author : oscar
 * @version :1.0, 2016/7/10
 */
public abstract class Generator {

    private static final Random random = new Random();

    private static List<Character> characters = new ArrayList<>();

    /**
     * 初始化包含所有汉字的集合
     */
    static {
        int a = (int) (4 * Math.pow(16, 3) + 14 * Math.pow(16, 2)); // 汉字ASCII码最小值
        int b = (int) (9 * Math.pow(16, 3) + 15 * Math.pow(16, 2) + 10 * Math.pow(16, 1)) + 5;  // 汉字ASCII码最大值
        for (int i = a; i <= b; i++) {
            characters.add((char) i);
        }
    }


    /**
     * 汉字字符串生成器,从所有汉字中随机取 number 个字符
     * @param number 汉字个数
     * @return 邮件标题
     */
    public static String generate(int number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number; i++) {
            sb.append(characters.get(random.nextInt(characters.size())));
        }
        return sb.toString();
    }
}
