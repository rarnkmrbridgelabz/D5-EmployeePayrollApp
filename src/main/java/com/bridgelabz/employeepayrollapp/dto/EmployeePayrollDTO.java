package com.bridgelabz.employeepayrollapp.dto;

public class EmployeePayrollDTO {
    //VARIABLES
    public String name;
    public  long salary;


   //OVERIDE TOSTRING
    @Override
    public String toString() {
        return "EmployeePayrollDTO{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
