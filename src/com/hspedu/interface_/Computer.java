package com.hspedu.interface_;
/**
 * @author 石晓琴
 * @date 2023/12/4 - 12 - 04 - 19:21
 * @Description: com.hspedu.interface_
 */
public class Computer {
    //编写一个方法，计算机工作
    //解读：
    //1.UsbInterface usbInterface 形参是接口类型 UsbInterface
    //2.work()方法 接受了 实现了 UsbInterface 接口的类的对象实例
    public void work(UsbInterface usbInterface){ //接口
        //通过接口，来调用方法
        usbInterface.start();
        usbInterface.stop();
    }
}
