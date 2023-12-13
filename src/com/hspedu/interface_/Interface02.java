package com.hspedu.interface_;

/**
 * @author 石晓琴
 * @date 2023/12/5 - 12 - 05 - 13:05
 * @Description: com.hspedu.interface_
 */
public class Interface02 {
    public static void main(String[] args) {

    }
}
//解读
//1. 如果一个类 implements 实现 接口
//2. 需要将该接口的所有抽象方法都实现
class A implements AInterface{
    public void hi(){
        System.out.println("hi()...");
    }

}