package org.oscar.reflection.api;

import org.oscar.reflection.demo.TargetClass;
import org.junit.Test;

public class ShowClassDetailInfoTest {

    @Test
    public void testShowDeclaredMethod() throws Exception {
        ShowClassDetailInfo.showDeclaredMethod(TargetClass.class);
    }

    @Test
    public void testShowField() throws Exception {
        ShowClassDetailInfo.showDeclaredField(TargetClass.class);
    }

    @Test
    public void testShowAllDirectInstanceFieldsValue() throws Exception {
        ShowClassDetailInfo.showAllDirectInstanceFieldsValue(new TargetClass("changed private string value."));

    }

    @Test
    public void testShowClassAllInfo() throws Exception {
        System.out.println(ShowClassDetailInfo.showClassFullInfo(String.class));
    }

    @Test
    public void testShowPackageName() throws Exception {
        ShowClassDetailInfo.showClassPackage(TargetClass.class);

    }

    @Test
    public void testShowSuperClass() throws Exception {
        ShowClassDetailInfo.showSuperClass(TargetClass.class);

    }

    @Test
    public void testShowInterfaces() throws Exception {
        ShowClassDetailInfo.showClassImplInterfaces(TargetClass.class);
    }

    @Test
    public void testShowConstructors() throws Exception {
        ShowClassDetailInfo.showConstructs(TargetClass.class);

    }
}