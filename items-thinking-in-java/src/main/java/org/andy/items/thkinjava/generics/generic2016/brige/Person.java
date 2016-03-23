package org.andy.items.thkinjava.generics.generic2016.brige;

/**
 * Author: oscar
 * Create Data: 10/03/16
 */
public class Person implements Comparable<Person> {
    protected int age;


    public Person(int age) {
        this.age = age;
    }


    /**
     * 这个方法是重写了接口Comparable中的compareTo方法，但是我们注意到接口中compareTo方法的参数是一个类型变量，在编译器编译的时候会
     * 转换成 compareTo(Object that)这种，也就是说当实现类实现此方法时，方法名称相同并且方法参数也必须是Object类型的。但很明显下面方
     * 法中的参数不是，其原因是编译器在编译的时候加入了桥方法。
     */
    @Override
    public boolean compareTo(Person that) {
        return this.age > that.age;
    }

    /**
     * 编译器加入的桥方法
     * <p>
     * public boolean compareTo(Object that){
     * return this.compareTo((Person)that);
     * }
     */


    public static void main(String[] args) {
        Person person1 = new Person(18);
        System.out.println(person1.compareTo(new Person(20)));
    }
}

interface Comparable<T> {
    boolean compareTo(T that);


}
