package com.hspedu.abstract_;
/**
 * @author 石晓琴
 * @date 2023/12/4 - 12 - 04 - 17:33
 * @Description: com.hspedu.abstract_
 */
public class CommonEmployee extends Employee{
    public CommonEmployee(String name, int id, double salary){
        super(name,id,salary);
    }
    public void work(){
        System.out.println("员工" + getName() + " 工作中...");
    }
}
