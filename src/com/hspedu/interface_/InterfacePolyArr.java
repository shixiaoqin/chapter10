package com.hspedu.interface_;

/**
 * @author 石晓琴
 * @date 2023/12/5 - 12 - 05 - 17:02
 * @Description: com.hspedu.interface_
 */
public class InterfacePolyArr {
    public static void main(String[] args) {
        //多态数组 -->接口类型数组
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone_();
        usbs[1] = new Camera_();
        /*
        * 请遍历Usb数组,如果是Phone对象,除了调用Usb 接口定义的方法外
        * ,还需要调用Phone特有方法call
        *  */
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work(); //动态绑定
            if (usbs[i] instanceof  Phone_){
                ((Phone_) usbs[i]).call();
            }
        }
    }
}
interface Usb{
    void work();
}
class Phone_ implements Usb{
    public void call(){
        System.out.println("手机可以打电话...");
    }
    public void work(){
        System.out.println("手机工作中");
    }
}
class Camera_ implements  Usb{
    public void work(){
        System.out.println("相机工作中...");
    }
}