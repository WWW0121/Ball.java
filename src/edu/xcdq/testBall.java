package edu.xcdq;

/**
 * @author wangwenbo
 * @data 2021/4/22 10:12
 */
public class testBall {
    public static void main(String[] args) {
        Ball football = new Ball();
        System.out.println(football.PI);
        System.out.println(Ball.PI);
        // Ball.PI = 6.14;
        System.out.println(Ball.PI);


        football.calczhouchang();
        football.calcArea();

        Ball.calcArea();
        //Ball.calcZhouchang();
    }
}
