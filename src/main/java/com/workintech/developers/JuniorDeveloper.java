package com.workintech.developers;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(int id, String name, int salary){
        super(id, name, salary);
    }
    @Override
    public void work(){
        setSalary(40000);
        System.out.println("Junior developer starts to working with salary: " + getSalary());
    }
}
