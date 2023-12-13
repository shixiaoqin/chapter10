package com.hspedu.interface_;

/**
 * @author 石晓琴
 * @date 2023/12/4 - 12 - 04 - 19:16
 * @Description: com.hspedu.interface_
 */
public class Interface01 {
    public static void main(String[] args) {
        //创建相机，相机对象
        Camera camera = new Camera();
        Phone phone = new Phone();
        //创建计算机
        Computer computer = new Computer();
        computer.work(phone); //把手机接入到计算机
        System.out.println("===============");
        computer.work(camera);
    }
}
