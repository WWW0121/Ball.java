package edu.xcdq;

/**
 * @author wangwenbo
 * @data 2021/4/22 8:32
 */
public class Phone {
    public double width;
    public double high;
    public int weight;
    public String color;
    // 构造方法，用于在内存中创建对象
    public Phone(){
        System.out.println("我被构造了");
    }
    // 构造方法
    /*public Phone(double kucun,double gao, int zhong,String yanse){
        width = kucun;
        high = gao;
        weight = zhong;
        color = yanse;
    }*/
    public Phone(double width,double high, int weight,String color) {
        this.width = width;
        this.high = high;
        this.weight = weight;
        this.color = color;
    }

    public void startUp(){
        System.out.println("手机在开机");
    }
    public void lockScreen(){
        System.out.println("手机在锁屏");
    }
    //
    public String toString(){
        return "{"+ this.weight+""+this.high+""+this.width+""+this.color+"}";
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof Phone) {
            Phone temp = (Phone) object;
            if (temp.width == this.width && temp.high == this.high && temp.weight == this.weight && temp.color == this.color) {
                return true;
            }
        }else {
            return false;

    }
    return false;
    }
}
