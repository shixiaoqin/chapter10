package com.hspedu.static_;
/**
 * @author 石晓琴
 * @date 2023/12/1 - 12 - 01 - 13:46
 * @Description: com.hspedu.static_
 */
public class StaticDetail {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(B.n2);
        //静态变量是类加载的时候,就创建了,所以我们没有创建对象实例
        //也可以通过类名.类变量名来访问
        System.out.println(C.address);
    }
}
class B{
    public int n1 = 100;
    public static int n2 = 200;
}
class C{
    public static String address = "北京";
}