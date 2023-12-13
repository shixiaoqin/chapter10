package com.hspedu.interface_;

/**
 * @author 石晓琴
 * @date 2023/12/5 - 12 - 05 - 13:43
 * @Description: com.hspedu.interface_
 */
public class InterfaceDetail02 {
    public static void main(String[] args) {
        Bs bs = new Bs();
        System.out.println(bs.a);
        System.out.println(Bs.a);
        System.out.println(As.a);
    }
}
interface IB{
    //接口中的属性。只能是final的，而且是public static final 修饰符
    int n1 = 10; // 等价于 public static final int  n1 = 10;
    void hi();
}
interface IC{
    void say();
}
//5.一个类可以同时实现多个接口
class Pig implements IB,IC{
    @Override
    public void hi() {
    }
    @Override
    public void say() {
    }
}
interface As{
    int a = 23;
}
class Bs implements As{

}