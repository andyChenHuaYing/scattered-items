package org.springframework.samples.ioc.schema.instantiation.constructor;

/**
 * Happy daily, happy life.
 * <p/>
 * Description:
 * <p/>
 * Created by andychen on 2015/1/26.
 * Version 1.0-SNAPSHOT
 */
public class WithInnerStaticBean {
    @Override
    public String toString() {
        return "WithInnerStaticBean{}";
    }

    static class InnerBean {
        private String string;

        public void setString(String string) {
            this.string = string;
        }

        @Override
        public String toString() {
            return "InnerBean{" +
                    "string='" + string + '\'' +
                    '}';
        }
    }
}
