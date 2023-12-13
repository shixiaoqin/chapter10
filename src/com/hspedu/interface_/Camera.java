package com.hspedu.interface_;

/**
 * @author 石晓琴
 * @date 2023/12/4 - 12 - 04 - 19:20
 * @Description: com.hspedu.interface_
 */
public class Camera implements UsbInterface{ //实现接口,就是把接口方法实现
    @Override
    public void start() {
        System.out.println("相继开始工作了...");
    }
    @Override
    public void stop() {
        System.out.println("相机停止了工作...");
    }
}
