package org.alien.reflection.api;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-22 21:48
 */

public class ShowClassDetailInfo {

    private static final String LINE_BREAK = "\r\n";
    private static final String SPACE = " ";
    private static final String SEMICOLON = ";";


    public static String showClassFullInfo(Class clazz) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("package ").append(showClassPackage(clazz)).append(LINE_BREAK);
        String classModifier = Modifier.toString(clazz.getModifiers());
        stringBuilder.append(classModifier).append(SPACE).append(clazz.getSimpleName());
        if (hasSuperClass(clazz)) {
            stringBuilder.append(SPACE).append("extend ").append(clazz.getSimpleName());
        }
        if (hasInterface(clazz)) {
            stringBuilder.append(SPACE).append("implement ").append(showClassImplInterfaces(clazz));
        }
        stringBuilder.append(" {").append(LINE_BREAK);
        stringBuilder.append(showDeclaredField(clazz))
                .append(LINE_BREAK)
                .append(showConstructs(clazz))
                .append(LINE_BREAK)
                .append(showDeclaredMethod(clazz))
                .append(LINE_BREAK)
                .append("}");
        return stringBuilder.toString();
    }

    /**
     * Show target class's package name.
     * @return
     *      Target class package name.
     */
    public static String showClassPackage(Class clazz) {
        return clazz.getPackage().getName();
    }

    /**
     * Validate target class has super class or not.
     * @param clazz
     *        Target class.
     * @return
     *        If target class has super class, return true, otherwise false.
     */
    public static boolean hasSuperClass(Class clazz) {
        Class superclass = clazz.getSuperclass();
        return  superclass != null;
    }

    /**
     * Show target class's super class.
     * @param clazz
     *        Target class.
     * @return
     *        The name of super class.
     */
    public static String showSuperClass(Class clazz) {
        if (hasSuperClass(clazz)) {
            return clazz.getSuperclass().getSimpleName();
        }
        return "Object";
    }

    /**
     * Validate target class has interface or not.
     * @param clazz
     *        Target class.
     * @return
     *        If target class has one or more interface, return true, otherwise false.
     */
    public static boolean hasInterface(Class clazz) {
        return clazz.getInterfaces().length > 0;
    }

    /**
     * Show target class's interfaces.
     * @param clazz
     *        Target class
     * @return
     *        Interfaces info.
     */
    public static String showClassImplInterfaces(Class clazz) {
        StringBuffer stringBuffer = new StringBuffer();
        Class[] classes = clazz.getInterfaces();
        if (hasInterface(clazz)) {
            for (Class face : classes) {

                stringBuffer.append(face.getSimpleName()).append(", ");
            }
            stringBuffer = fixStringBuffer(stringBuffer);
        }
        return stringBuffer.toString();
    }

    /**
     * Show target class's constructors
     * @param clazz
     *        Target class
     * @return
     *        Constructors info.
     */
    public static String showConstructs(Class clazz) {
        StringBuffer stringBuffer = new StringBuffer();
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            Annotation[] annotations = constructor.getDeclaredAnnotations();
            stringBuffer = constructorAnnotation(stringBuffer, annotations);
            String modifierType = Modifier.toString(constructor.getModifiers());
            stringBuffer.append(modifierType).append(SPACE).append(clazz.getSimpleName()).append("(");
            Class[] types = constructor.getParameterTypes();
            if (types.length > 0) {
                for (Class type : types) {
                    String parameterTypeName = type.getName();
                    String parameterTypeReferenceName = type.getClass().getSimpleName().toLowerCase();
                    stringBuffer = injectMethodParametersContent(stringBuffer,
                            parameterTypeName, parameterTypeReferenceName);
                }
                stringBuffer = fixStringBuffer(stringBuffer);
            }
            stringBuffer.append(")").append("{...}").append(LINE_BREAK).append(LINE_BREAK);
        }
        return stringBuffer.toString();
    }



    /**
     * Show class's declared field.
     * @param clazz
     *          Target class.
     * @return
     *          Declared field info.
     */
    public static String showDeclaredField(Class clazz) {
        StringBuffer stringBuffer = new StringBuffer();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Annotation[] annotations = field.getDeclaredAnnotations();
            stringBuffer = constructorAnnotation(stringBuffer, annotations);
            String fieldModifier = Modifier.toString(field.getModifiers());
            String fieldType = field.getType().getSimpleName();
            stringBuffer.append(fieldModifier).append(SPACE).append(fieldType).append(SPACE);
            stringBuffer.append(field.getName()).append(SEMICOLON).append(LINE_BREAK).append(LINE_BREAK);
        }
        return stringBuffer.toString();
    }

    /**
     * Show class's declared method.
     * @param clazz
     *        Target Class type.
     */
    public static String showDeclaredMethod(Class clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        return showMethodsDetail(methods);
    }



    /**
     * Show methods' detail information
     * @param methods
     *      Target class's method.
     * @return
     *      All methods print info .
     */
    private static String showMethodsDetail(Method[] methods) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Method method : methods) {
            //Construct Annotation
            Annotation[] annotations = method.getDeclaredAnnotations();
            stringBuffer = constructorAnnotation(stringBuffer, annotations);

            //Construct method modifier type
            String modifierType = Modifier.toString(method.getModifiers());
            stringBuffer.append(modifierType).append(SPACE);
//            String methodInfo = method.toString();
//            if (methodInfo.startsWith("public")) {
//                stringBuffer.append("public ");
//            }
//            if (methodInfo.startsWith("protected")) {
//                stringBuffer.append("protected ");
//            }
//            if (methodInfo.startsWith("private")) {
//                stringBuffer.append("private ");
//            }

            //Construct method name
            Class<?> returnType = method.getReturnType();
            String methodName = method.getName();
            stringBuffer.append(returnType).append(SPACE).append(methodName).append("(");

            //Construction method parameters
            Class[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length > 0) {
                for (Class parameterTypeClass : parameterTypes) {
                    String parameterTypeName = parameterTypeClass.getName();
                    String parameterTypeReferenceName = parameterTypeClass.getSimpleName().toLowerCase();
                    stringBuffer = injectMethodParametersContent(stringBuffer,
                            parameterTypeName, parameterTypeReferenceName);
                }
                stringBuffer = fixStringBuffer(stringBuffer);
            }
            stringBuffer.append(")");

            //Construct throws Exceptions
            Class<?>[] exceptionTypes = method.getExceptionTypes();
            if (exceptionTypes.length > 0) {
                stringBuffer.append("throws ");
                for (Class exceptionType : exceptionTypes) {
                    String exceptionName = exceptionType.getSimpleName();
                    stringBuffer.append(exceptionName).append(", ");
                }
                stringBuffer = fixStringBuffer(stringBuffer);
            }

            //Construct method body, of course is invisible.
            stringBuffer.append("{...}").append(LINE_BREAK).append(LINE_BREAK);
        }
        return stringBuffer.toString();

    }

    /**
     * Construct target's annotation expression.
     * @param stringBuffer
     *        Result container.
     * @param annotations
     *        Target's all annotations.
     * @return
     *        Final expression.
     */
    private static StringBuffer constructorAnnotation(StringBuffer stringBuffer, Annotation[] annotations) {
        if (annotations.length > 0) {
            for (Annotation annotation : annotations) {
                String annotationName = annotation.annotationType().getSimpleName();
                stringBuffer.append("@").append(annotationName).append("\r\n");
            }
        }
        return stringBuffer;
    }

    /**
     * Cut the last "," in stringBuffer.
     * @param stringBuffer
     *        raw str.
     * @return
     *        Fixed str.
     */
    private static StringBuffer fixStringBuffer(StringBuffer stringBuffer) {
        return stringBuffer.delete(stringBuffer.lastIndexOf(","), stringBuffer.length());
    }

    /**
     * Construct method parameters list.
     * @param stringBuffer
     *        Parameters list container.
     * @param parameterTypeName
     *        Parameter type class name.
     * @param parameterTypeReferenceName
     *        Parameter dummy reference name.
     * @return
     *        Method parameters list info.
     */
    private static StringBuffer injectMethodParametersContent(StringBuffer stringBuffer, String parameterTypeName, String parameterTypeReferenceName) {
        return stringBuffer.append(parameterTypeName).append(SPACE).append(parameterTypeReferenceName).append(", ");
    }
}
