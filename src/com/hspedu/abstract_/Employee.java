package com.hspedu.abstract_;

/**
 * @author 石晓琴
 * @date 2023/12/4 - 12 - 04 - 17:29
 * @Description: com.hspedu.abstract_
 */
public abstract class Employee {
    private String name;
    private int id;
    private double salary;
    public Employee(String name, int id, double salary) {
        setName(name);
        setId(id);
        setSalary(salary);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    //抽象方法work
    public abstract void work();
}
