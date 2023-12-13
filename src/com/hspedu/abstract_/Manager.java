package com.hspedu.abstract_;

/**
 * @author 石晓琴
 * @date 2023/12/4 - 12 - 04 - 17:30
 * @Description: com.hspedu.abstract_
 */
public class Manager extends Employee {
    private double bonus;
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public Manager(String name, int id, double salary,double bonus) {
        super(name,id,salary);
        setBonus(bonus);
    }
    public void work(){
        System.out.println("经理" + getName() + " 工作中...");
    }
}

