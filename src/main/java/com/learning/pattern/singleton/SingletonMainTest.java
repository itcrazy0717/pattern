package com.learning.pattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

import org.junit.jupiter.api.Test;

import com.learning.pattern.singleton.hunger.HungrySingleton;
import com.learning.pattern.singleton.lazy.IocSingleton;
import com.learning.pattern.singleton.lazy.LazyDoubleCheckSingleton;
import com.learning.pattern.singleton.lazy.LazySingleSerializable;
import com.learning.pattern.singleton.lazy.LazyEnumSingleton;
import com.learning.pattern.singleton.lazy.LazyInnerClassSingleton;
import com.learning.pattern.singleton.lazy.LazyThreadLocalSingleton;

/**
 * @author: dengxin.chen
 * @date: 2019-10-29 18:09
 * @description:单例模式主测试类
 */
public class SingletonMainTest {
    /**
     * 饿汉式单例测试
     */
    @Test
    public void hungrySingetonTest() {
        Thread t1 = new Thread(() -> System.out.println("饿汉式单例测试,hashCode=" + HungrySingleton.getInstance().hashCode()));
        Thread t2 = new Thread(() -> System.out.println("饿汉式单例测试,hashCode=" + HungrySingleton.getInstance().hashCode()));
        t1.start();
        t2.start();
        System.out.println();
    }

    /**
     * 懒汉式单例测试，直接使用synchronized
     */
    @Test
    public void lazySingletonTest() {
        Thread t1 = new Thread(() -> System.out.println("懒汉式单例测试（直接使用synchronized）,hashCode=" + LazySingleSerializable.getInstance().hashCode()));
        Thread t2 = new Thread(() -> System.out.println("懒汉式单例测试（直接使用synchronized）,hashCode=" + LazySingleSerializable.getInstance().hashCode()));
        t1.start();
        t2.start();
    }

    /**
     * 懒汉式单例测试，Double-Check形式
     */
    @Test
    public void lazyDoubleCheckSingletonTest() {
        Thread t1 = new Thread(() -> System.out.println("懒汉式单例测试（Double-Check）,hashCode=" + LazyDoubleCheckSingleton.getInstance().hashCode()));
        Thread t2 = new Thread(() -> System.out.println("懒汉式单例测试（Double-Check）,hashCode=" + LazyDoubleCheckSingleton.getInstance().hashCode()));
        t1.start();
        t2.start();
    }

    /**
     * 懒汉式单例测试，静态内部类形式
     */
    @Test
    public void lazyInnerClassSingletonTest() {
        Thread t1 = new Thread(() -> System.out.println("懒汉式单例测试（静态内部类）,hashCode=" + LazyInnerClassSingleton.getInstance().hashCode()));
        Thread t2 = new Thread(() -> System.out.println("懒汉式单例测试（静态内部类）,hashCode=" + LazyInnerClassSingleton.getInstance().hashCode()));
        t1.start();
        t2.start();
    }

    /**
     * 利用ThreadLocal的方式实现单例
     */
    @Test
    public void lazyThreadLocalSingletonTest() {
        Thread t1 = new Thread(() -> {
            LazyThreadLocalSingleton instance = LazyThreadLocalSingleton.getInstance();
            System.out.println(instance.hashCode());
            System.out.println("懒汉式单例测试（ThreadLocal）,hashCode=" + instance.hashCode());
        });
        Thread t2 = new Thread(() -> System.out.println("懒汉式单例测试（ThreadLocal）,hashCode=" + LazyThreadLocalSingleton.getInstance().hashCode()));
        t1.start();
        t2.start();
    }

    /**
     * 注入式单例，类似spring中的ioc
     */
    @Test
    public void iocSingletonTest() {
        Thread t1 = new Thread(() -> System.out.println("注入式单例测试（ioc）,hashCode=" + IocSingleton.getInstance("com.learning.pattern.factory.simple.VolkswagenCar").hashCode()));
        Thread t2 = new Thread(() -> System.out.println("注入式单例测试（ioc）,hashCode=" + IocSingleton.getInstance("com.learning.pattern.factory.simple.VolkswagenCar").hashCode()));
        t1.start();
        t2.start();
    }


    /**
     * 通过反射破坏单例
     * 通过反射来访问单例模式（饿汉式、懒汉式）会造成new两次对象，从而破坏了单例的原则
     */
    @Test
    public void breakSingletonTestByReflect() throws Exception {
        Class<?> clazz = LazyEnumSingleton.class;
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        // 在newInstance的时候会调用一次构造函数，从而生成两个不一样的对象，破坏单例
        // 枚举形式的单例是不允许进行反射的，从jdk内部进行了阻止
        // 其他形式的单例，可以通过在私有构造函数中判断对象，抛出异常的方式来进行阻止
        Object instance = constructor.newInstance("test", 11);
        LazyEnumSingleton instance1 = LazyEnumSingleton.getInstance();
        System.out.println("反射单例，hashCode=" + instance.hashCode());
        System.out.println("直接使用getInstance方法，hashCode=" + instance1.hashCode());
        System.out.println(instance1 == instance);
    }

    /**
     * 通过序列化破坏单例
     */
    @Test
    public void breakSingletonTestBySerialable() {
        LazyEnumSingleton lazySingeton1 = null;
        LazyEnumSingleton lazySingeton2 = LazyEnumSingleton.getInstance();
        try (FileOutputStream fos = new FileOutputStream("LazySington.dat")) {
            // 写文件
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lazySingeton2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("LazySington.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            // 从流中读取对象进行实例化时，同样会再次生产新的对象，从而破坏单例
            // 枚举除外枚举是通过类和类名进行的初始化，在虚拟机内部只会保证一个对象
            lazySingeton1 = (LazyEnumSingleton) ois.readObject();
            ois.close();
            System.out.println(lazySingeton1);
            System.out.println(lazySingeton2);
            System.out.println(lazySingeton1 == lazySingeton2);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
