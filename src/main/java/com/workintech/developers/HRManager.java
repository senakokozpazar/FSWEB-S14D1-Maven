package com.workintech.developers;

public class HRManager extends Employee{

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, int salary){
        super(id, name, salary);
    }

    @Override
    public void work(){
        setSalary(70000);
        System.out.println("HRManager starts to working with salary: " + getSalary());
    }

    public boolean addEmployee(JuniorDeveloper juniorDeveloper, int index){
        if(index < 0 || index >= juniorDevelopers.length){
            System.out.println("There is not such an index!");
            return false;
        }
        if (juniorDevelopers[index] == null) {
            juniorDevelopers[index] = juniorDeveloper;
            System.out.println("Junior Developer added at index " + index);
            return true;
        } else {
            System.out.println("Index " + index + " is already occupied.");
            return false;
        }
    }

    public boolean addEmployee(MidDeveloper midDeveloper, int index){
        if(index < 0 || index >= midDevelopers.length){
            System.out.println("There is not such an index!");
            return false;
        }
        if (midDevelopers[index] == null) {
            midDevelopers[index] = midDeveloper;
            System.out.println("Mid Developer added at index " + index);
            return true;
        } else {
            System.out.println("Index " + index + " is already occupied.");
            return false;
        }
    }

    public boolean addEmployee(SeniorDeveloper seniorDeveloper, int index){
        if(index < 0 || index >= seniorDevelopers.length){
            System.out.println("There is not such an index!");
            return false;
        }
        if (seniorDevelopers[index] == null) {
            seniorDevelopers[index] = seniorDeveloper;
            System.out.println("Senior Developer added at index " + index);
            return true;
        } else {
            System.out.println("Index " + index + " is already occupied.");
            return false;
        }
    }
}
