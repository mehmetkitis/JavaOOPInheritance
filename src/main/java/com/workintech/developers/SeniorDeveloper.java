package com.workintech.developers;

public class SeniorDeveloper extends Employee{

    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }


    public void work(double salary){
        this.setSalary(salary);
        System.out.println("Senior starts to working " + salary);
    }
}
