package com.workintech.developers;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(int id, String name, int salary){
        super(id, name, salary);
    }
    @Override
    public void work(){
        setSalary(100000);
        System.out.println("Senior Developer starts to working with salary: " + getSalary());
    }
}
