package com.oscar.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Description
 *
 * @author huaying
 * @version 0.0.1
 * @since 2020/6/24
 */
public class BitOpt {
    @Test
    public void right() {
        int a = 1;
        assertEquals(2, a << 1);

        int b = -1;
        assertEquals(-2, b << 1);

        int c = -1;
        assertEquals(0X7FFFFFFF, c >>> 1);
    }

    /**
     * 按位与：全1为1，其他为0
     */
    @Test
    @SuppressWarnings("all")
    public void and() {
        assertEquals(0, 1 & 0);
        assertEquals(1, 1 & 1);
        assertEquals(0, 0 & 0);
    }

    /**
     * 按位或：有1为1
     */
    @Test
    @SuppressWarnings("all")
    public void or() {
        assertEquals(1, 1 | 1);
        assertEquals(1, 1 | 0);
        assertEquals(0, 0 | 0);
    }

    /**
     * 取反：0 -> 1; 1 -> 0
     * 包括符号位
     */
    @Test
    public void reverse() {
        assertEquals(Integer.MAX_VALUE << 1, ~1);
    }

    /**
     * 交换数组中两个数
     */
    @Test
    public void switchNum() {
        int a = 2;
        int b = -4;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        assertEquals(-4, a);
        assertEquals(2, b);
    }

    /**
     * 一个数组中只有一种数出现了奇数次，找到这数
     */
    @Test
    public void oodTimesNum1() {
        int exOr = 0;
        int[] arr = new int[]{1, 3, 2, 3, 3, 3, 2, 1, 4, 5, 5, 4, 4};
        for (int i : arr) {
            exOr = exOr ^ i;
        }
        assertEquals(4, exOr);
    }

    /**
     * 一个数组中只有两种不同数出现了奇数次，找到这数
     */
    @Test
    public void oodTimesNum2() {

        int[] arr = new int[]{1, 3, 2, 3, 3, 3, 2, 1, 4, 5, 5, 4, 4, 6};
        int eor = 0;
        for (int i : arr) {
            eor ^= i;
        }

        assertEquals(eor, 4 ^ 6);

        // eor = a ^ b
        // eor != 0
        // eor 必然有一个位置上是 1
        int rightOne = eor & ((~eor) + 1);
        int onlyOne = 0;
        for (int i : arr) {
            if ((i & rightOne) != 0) {
                onlyOne ^= i;
            }
        }

        assertEquals(6, onlyOne);
        assertEquals(4, onlyOne ^ eor);
    }

    /**
     * 统计数字中bit位为1的个数
     */
    @Test
    public void bitCount() {
        int a = 7;
        int count = 0;
        while (a != 0) {
            int rightOne = a & ((~a) + 1);
            a ^= rightOne;
            count++;
        }

        assertEquals(3, count);
    }

    @Test
    @SuppressWarnings("all")
    public void special() {
        int a = 1;
        int b = Integer.MAX_VALUE;
        assertEquals(0, a ^ a);
        assertEquals(0, b ^ b);
        assertEquals(a, a ^ b ^ b);
        assertEquals(b, b ^ 0);
    }

    /**
     * 整数最右边的1
     */
    @Test
    public void rightBitOne() {
        assertEquals(1, 7 & ((~7) + 1));
        assertEquals(8, 8 & ((~8) + 1));
    }
}
