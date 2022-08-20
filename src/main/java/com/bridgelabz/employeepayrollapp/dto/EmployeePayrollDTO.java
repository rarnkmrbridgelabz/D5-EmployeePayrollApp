package com.bridgelabz.employeepayrollapp.dto;

public class EmployeePayrollDTO {
    //VARIABLES
    public String name;
    public  long salary;


    //CONSTRUCTOR
    public EmployeePayrollDTO(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    //OVERIDE TOSTRING
    @Override
    public String toString() {
        return "EmployeePayrollDTO{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
