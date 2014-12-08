package org.springframework.samples.annotations.beanAndconfiguration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.samples.utils.ShowReferencesUtil;

public class MyConfigurationTest {
    AnnotationConfigApplicationContext context;
    @Before
    public void before() {
        context = new AnnotationConfigApplicationContext();
        context.register(MyConfiguration.class);
        context.refresh();
    }

    @After
    public void after() {
        context.close();
    }

    @Test
    public void testFooWithInnerBeanAnnotation() {
        FooWithInnerBar fooWithInnerBar = context.getBean(FooWithInnerBar.class);
        ShowReferencesUtil.showReferences(fooWithInnerBar, fooWithInnerBar.getBar());

    }

    @Test
    public void testFooBeanAnnotation() throws Exception {
        Foo foo = (Foo) context.getBean("foo2");
        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = (Foo) context.getBean("myFoo");
        Foo foo3 = (Foo) context.getBean("myFirstFoo");
        ShowReferencesUtil.showReferences(foo, foo1, foo2, foo3);
    }

    @Test
    public void testBarBeanAnnotation() throws Exception {
        Bar bar = (Bar) context.getBean("bar2");
        Bar bar1 = context.getBean(Bar.class);
        Bar bar2 = (Bar) context.getBean("myBar");
        Bar bar3 = (Bar) context.getBean("myFirstBar");
        ShowReferencesUtil.showReferences(bar, bar1, bar2, bar3);
    }
}