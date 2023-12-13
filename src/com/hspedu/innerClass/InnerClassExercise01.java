package com.hspedu.innerClass;

import com.hspedu.abstract_.AA;

/**
 * @author 石晓琴
 * @date 2023/12/6 - 12 - 06 - 17:14
 * @Description: com.hspedu.innerClass
 */
public class InnerClassExercise01 {
    public static void main(String[] args) {
        //匿名内部类当作实参直接传递，简洁高效
        f1(new IL(){
            public void show(){
                System.out.println("这是一副名画");
            }
        });
        //传统方法，要专门写一个类来实现
        f1(new Picture());
    }
    //静态方法,形参是接口类型
    public static void f1(IL il){
        il.show();
    }
}
//接口
interface IL{
    void show();
}
//传统方法
//类->实现IL-->硬编码
class Picture implements IL{
    @Override
    public void show() {
        System.out.println("这是一副名画");
    }
}