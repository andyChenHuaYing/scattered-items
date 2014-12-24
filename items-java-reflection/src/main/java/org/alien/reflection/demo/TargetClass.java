package org.alien.reflection.demo;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-22 21:30
 */
@ClassLevelAnnotation
@SuppressWarnings("unused")
public class TargetClass extends TargetSuperClass implements TargetInterfaceOne, TargetInterfaceTwo{

/*-----------------------------------Different declared field.--------------------------------------------------------*/
    private String privateString = "privateString";

    protected String protectedString = "protectedString";

    String string = "string";

    @FieldLevelAnnotation
    public String publicString = "publicString";

/*------------------------------------Constructor Method.-------------------------------------------------------------*/

    public TargetClass() { }

    public TargetClass(String privateString) {
        this.privateString = privateString;
    }

    /*------------------------------------Different declared method.------------------------------------------------------*/
    @MethodLevelAnnotationOne
    private void privateMethod() throws MethodException{
        System.out.println("privateMethod");
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }

    void defaultMethod() {
        System.out.println("defaultMethod");
    }

    public String publicMethod(String paramStr, TargetSuperClass targetSuperClass) throws MethodException{
        System.out.println("publicMethod(String s, TargetSuperClass tsc)");
        return "public method return value .";
    }


    @Override
    @MethodLevelAnnotationOne
    @MethodLevelAnnotationTwo
    public void interfaceOne() {
        System.out.println("TargetInterfaceOne");
    }

    @Override
    public void interfaceTwo() {
        System.out.println("TargetInterfaceTwo");
    }
}
