package com.bridgelabz.employeepayrollapp.controllers;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.dto.ResponseDTO;
import com.bridgelabz.employeepayrollapp.services.EmployeePayrollData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @RequestMapping(value = {"", "/", "/get"})
    //UC-1
//    public ResponseEntity<String> getEmployeePayrollData(){
//        return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
//}
    //UC-2
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(){
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1,new EmployeePayrollDTO("Arun",1000));
        ResponseDTO responseDTO = new ResponseDTO("Get Call Sucess",employeePayrollData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    @GetMapping("/get/{empId}")
    //UC-1
//    public ResponseEntity<String> getEmployeePayrollData(@PathVariable("empId")int empId){
//        return new ResponseEntity<String>("Get Call Success for id:"+empId,HttpStatus.OK);
//    }
    //UC-2
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId")int empId){
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(empId,new EmployeePayrollDTO("Arun",1000));
        ResponseDTO responseDTO = new ResponseDTO("Get Call For Id Sucessful",employeePayrollData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    //UC-1
//    public ResponseEntity<String> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
//        return new ResponseEntity<String>("Created Employee Payroll Data for:"+employeePayrollDTO,HttpStatus.OK);
//    }
    //UC-2
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO){
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1,empPayrollDTO);
        ResponseDTO responseDTO = new ResponseDTO("Created Employee Payroll Data Successfully:",employeePayrollData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{empId}")
    //UC-1
//    public ResponseEntity<String> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
//        return new ResponseEntity<String>("Upated Employee Payroll Data for:"+employeePayrollDTO,HttpStatus.OK);
//    }
    //UC-2
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable("empId") int empId,@RequestBody EmployeePayrollDTO empPayrollDTO){
            EmployeePayrollData employeePayrollData = null;
            employeePayrollData = new EmployeePayrollData(empId,empPayrollDTO);
            ResponseDTO responseDTO = new ResponseDTO("Updated Employee Payroll Data Successfully:",employeePayrollData);
            return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{empId}")
    //UC-1
//    public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("empId")int empId){
//        return new ResponseEntity<String>("Delete Call Success for id:"+empId,HttpStatus.OK);
//    }
    //UC-2
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId")int empId){
        ResponseDTO responseDTO = new ResponseDTO("Deleted Successfully:","Delete Id:"+empId);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

}
