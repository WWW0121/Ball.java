package edu.xcdq;

/**
 * @author wangwenbo
 * @data 2021/4/22 10:36
 */
public class Demo01 {
    // 2 普通的属性或者代码块其次执行，从上往下执行
    int size = 1;
    // 代码块
    {
        size = 10;
    }

    // 1被static最先执行，都被修饰的从上往下执行
    static {
        count = 3;
    }
    static int count =30;

    // 3最后执行构造方法
    public Demo01()  {
        System.out.println(size);
        System.out.println(count);
    }

}
