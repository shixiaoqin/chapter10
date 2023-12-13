package com.hspedu.static_;
/**
 * @author 石晓琴
 * @date 2023/12/1 - 12 - 01 - 14:04
 * @Description: com.hspedu.static_
 */
public class StaticMethod {
    public static void main(String[] args) {
        System.out.println(MyTools.calSum(1,2));
    }
}
//开发自己的工具类时,可以将方法做成静态的，方便调用
class MyTools{
    //求出两个数的和
    public static double calSum(double n1, double n2){
        return n1 + n2;
    }
}