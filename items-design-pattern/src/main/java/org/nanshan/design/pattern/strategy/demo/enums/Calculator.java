package org.nanshan.design.pattern.strategy.demo.enums;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public enum Calculator {

    ADD("+") {
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },

    DEL("-") {
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    };

    String value = " ";

    private Calculator(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public abstract int exec(int a, int b);

}
