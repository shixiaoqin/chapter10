package com.hspedu.final_;
/**
 * @author 石晓琴
 * @date 2023/12/4 - 12 - 04 - 12:45
 * @Description: com.hspedu.final_
 */
public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println("面积=" + circle.calArea());
    }
}
class Circle {
    private double radius;
    private final double PI = 3.14; //定义时赋值
    //构造器
    public Circle(double radius){
        this.radius = radius;
      //  PI = 3.14 构造器中赋值，三者只能选一个
    }
    {
       // PI = 3.14;  代码块中赋值,三者只能选一个
    }
    //计算圆的面积
    public double calArea(){
        return PI * radius * radius;
    }
}
