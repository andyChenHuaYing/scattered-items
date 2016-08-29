package org.alien.design.pattern.decorator.demo.component;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public class FileInputStreamComponent extends InputStreamComponent {
    @Override
    public void read() {
        System.out.println("FileInputStreamComponent.read");
    }

    @Override
    public void close() {
        System.out.println("FileInputStreamComponent.close");
    }
}
