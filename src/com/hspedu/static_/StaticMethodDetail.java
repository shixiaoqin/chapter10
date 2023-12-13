package com.hspedu.static_;

/**
 * @author 石晓琴
 * @date 2023/12/1 - 12 - 01 - 14:20
 * @Description: com.hspedu.static_
 */
public class StaticMethodDetail {
    public static void main(String[] args) {
        D.hi(); //类方法可以直接通过类名.类方法名调用
        //非静态方法,不能通过类名调用
        //D.say(); ❌ 需要先创建对象，再调用
        D d = new D();
        d.say();
    }
}
class D{
    private  int n1 = 100;
    public void say(){}//非静态方法，普通方法
    public static void hi(){
        //类方法中不允许使用和对象有关的关键字.比如this和super.
        // 普通方法(成员方法)可以
//        System.out.println(this.n1); //❌
    }//静态方法
}