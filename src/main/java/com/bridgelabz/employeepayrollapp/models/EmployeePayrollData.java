package com.bridgelabz.employeepayrollapp.models;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

public @Data class EmployeePayrollData {

//VARIABLES
    private  int employeeId;
    private String name;
    private long salary;
 //ADDING EXTRA VARIABLES
    private String gender;
    private LocalDate startDate;
    private String note;
    private String profilePic;
    private List<String> departments;
//CONSTRUCTOR
    public EmployeePayrollData() {
    }

    public EmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
        this.employeeId = empId;
        this.updateEmployeePayrollData(empPayrollDTO);
    }

    public void updateEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO){
        this.name = employeePayrollDTO.name;
        this.salary = employeePayrollDTO.salary;
        this.gender = employeePayrollDTO.gender;
        this.note = employeePayrollDTO.note;
        this.startDate = employeePayrollDTO.startDate;
        this.profilePic = employeePayrollDTO.profilePic;
        this.departments = employeePayrollDTO.departments;

    }

}