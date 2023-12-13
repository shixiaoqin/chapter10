package com.hspedu.interface_;

/**
 * @author 石晓琴
 * @date 2023/12/4 - 12 - 04 - 19:18
 * @Description: com.hspedu.interface_
 */
//phone 类 实现 UsbInterface
//解读1 ： 即 phone类需要实现 UsbInterface接口 规定/生命的方法
public class Phone  implements UsbInterface{
    @Override

    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作");
    }
}
