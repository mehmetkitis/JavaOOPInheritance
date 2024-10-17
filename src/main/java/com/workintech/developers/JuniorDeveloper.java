package com.workintech.developers;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }


    public void work(double salary){
        this.setSalary(salary);
        System.out.println("Junior starts to working " + salary);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
