package com.hspedu.innerClass;

/**
 * @author 石晓琴
 * @date 2023/12/6 - 12 - 06 - 17:27
 * @Description: com.hspedu.innerClass
 */
public class InnerClassExercise02 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        //解读
        //1.传递的是一个实现了 Bell接口的匿名内部类
        //2.重写了 ring方法
        //3.bell =  new Bell() {
        //            @Override
        //            public void ring() {
        //                System.out.println("懒猪起床了...");
        //            }
        //        });
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了...");
            }
        });
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了...");
            }
        });
    }
}
interface Bell{//接口
    void ring();//方法
}
class CellPhone{
    public void alarmClock(Bell bell){ //形参是Bell接口类型
        bell.ring();
    }
}