package com.hspedu.interface_;

/**
 * @author 石晓琴
 * @date 2023/12/5 - 12 - 05 - 13:24
 * @Description: com.hspedu.interface_
 */
public class MysqlDB  implements DBInterface{
    @Override
    public void connect() {
        System.out.println("连接Mysql");
    }

    @Override
    public void close() {
        System.out.println("关闭Mysql");
    }
}
