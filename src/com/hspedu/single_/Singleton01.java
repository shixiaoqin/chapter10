package com.hspedu.single_;

/**
 * @author 石晓琴
 * @date 2023/12/2 - 12 - 02 - 01:06
 * @Description: com.hspedu.single_
 */
public class Singleton01 {
    public static void main(String[] args) {
        //通过方法获取对象
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
        GirlFriend instance2 = GirlFriend.getInstance();
        System.out.println(instance2);
    }
}
//有一个类，GirlFriend
//只能有一个女朋友
class GirlFriend{
    private String name;
    //如何保证只能创建GirlFriend对象
    //步骤[单例模式-饿汉式]
    //1.将构造器私有化
    private GirlFriend(String name){
        this.name = name;
    }
    //2.在类的内部直接创建
    //为了能够在静态方法中，返回gf对象，需要将其修饰为static
    //饿汉式可能会造成创建了对象，但是没有使用
    private static GirlFriend gf = new GirlFriend("小红红");
    //3.提供一个公共的static方法，返回 gf对象
    public static GirlFriend getInstance(){
        return gf;
    }
    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
