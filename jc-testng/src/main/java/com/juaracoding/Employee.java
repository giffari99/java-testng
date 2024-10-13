package com.juaracoding;

public class Employee {

    //name, addres, divisi, salary


    private String name;
    private  String Addres;
    private  Boolean isActive;
    private  double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return Addres;
    }

    public void setAddres(String addres) {
        Addres = addres;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary > 0){
            this.salary = salary;
        }else {
//            throw new IllegalAccessException("sal");
        }
    }
}
