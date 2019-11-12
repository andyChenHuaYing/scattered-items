package org.andy.items.thkinjava.generics.generic2016.wildcard;

import org.andy.items.thkinjava.generics.model.Animal;
import org.andy.items.thkinjava.generics.model.Dog;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: oscar
 * Create Data: 09/03/16
 */
public class WildCardExample {

    /**
     * List<? extends Animal> animals;
     * 含义：表示animals集合中所有的元素都是animal或者是animal的子类。
     * 查询：如方法体中所写，因为animals中所有元素都是其子类，所以可以调用其子类从animal中实现的方法。
     * 增加：见方法体
     */
    public static void genericUpperWildcard(List<? extends Animal> animals) {
        animals.forEach(Animal::animalMethod);

        /*
         * 下面两行都是编译错误，如果了解前面文章中提到的擦除，则很好理解。
         * 编译后的方法签名参数List所用的泛型类会被转换成Animal。假如此时向List中添加的是Dog类，那么当我们使用Dog类特有的方法时
         * 肯定是不存在的。所以出于类型安全问题，不允许向含有通配符下界的泛型类中添加元素——null除外，但是添加null没有任何意义。
         */
//        animals.add(new Dog());
//        animals.add(new Animal());

        List list = new ArrayList();
        list.add("1");
        list.add(1);
        list.get(0);
        Integer[] a = new Integer[2];
        a[0] = 1;
        a[1] = Integer.parseInt("s");
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        genericUpperWildcard(dogs);
    }

    /**
     * List<? super Animal> list;
     * 含义：表示list中所有的元素都是Animal类或者是其父类
     * 查询：因为返回的结果并不能保证是那个当初添加的Animal类或则其父类，返回的查询结果的类型只能是Object.
     * 增加：可以向list中添加任何Animal实例或者Animal子类，因为list在编译之后泛型先被擦除然后转换为Animal类，
     * 此时向里添加的任何类型都是Animal类，所以调用Animal中的任何非私有方法都是允许的。
     */

    public static void genericLowerWildcard(List<? super Animal> list) {
        list.add(new Animal());
        list.add(new Dog());

//        Animal animal1 = list.get(0); 编译出错，
        Object animal = list.get(0);
    }
}

