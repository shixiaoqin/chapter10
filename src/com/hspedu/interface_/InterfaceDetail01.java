package com.hspedu.interface_;

/**
 * @author 石晓琴
 * @date 2023/12/5 - 12 - 05 - 13:32
 * @Description: com.hspedu.interface_
 */
public class InterfaceDetail01 {
    public static void main(String[] args) {
        // new IA();  ❌
    }
}
//1.接口不能被实例化
//2.接口中所有的方法是 public 方法，接口中抽象方法，可以不用abstract 修饰
//3.一个普通类实现接口，就必须将该接口的所有方法都实现,可以使用shift + option 快捷键快速导入
//4.抽象类实现接口，可以不用实现接口的方法
interface IA{
    public abstract void say();
    void hi();
    // void say(); 等同于 上面的public abstract void say();
}
class Cat implements IA{
    @Override
    public void say() {
    }
    @Override
    public void hi() {
    }
}
abstract class Tiger implements IA{}