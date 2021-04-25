package edu.xcdq;

/**
 * @author wangwenbo
 * @data 2021/4/22 11:01
 */
public class testDemo02 {
    public static void main(String[] args) {
       Demo02 demo02 = new Demo02();
       Demo02 Inner = new Demo02();
       Demo02.Inner inner = demo02.new Inner();
       inner.fun01();
    }
}
