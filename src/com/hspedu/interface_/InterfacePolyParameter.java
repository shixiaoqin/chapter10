package com.hspedu.interface_;

/**
 * @author 石晓琴
 * @date 2023/12/5 - 12 - 05 - 16:56
 * @Description: com.hspedu.interface_
 */
public class InterfacePolyParameter {
    public static void main(String[] args) {
        //接口的多态体现
        //接口类型的变量 if01 可以指向 实现了IF接口的类的对象实例
        IF if01 = new Monster();
        IF if02 = new Car();
        //继承体现的多态
        //父类类型的变量 a 可以指向 继承AAA的子类对象实例
        AAA a = new BBB();
        a = new CCC();
    }
}
interface IF{}
class Monster implements IF{}
class Car implements  IF{}
class AAA{}
class BBB extends AAA{}
class CCC extends AAA{}