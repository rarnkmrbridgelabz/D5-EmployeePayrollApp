package com.bridgelabz.employeepayrollapp.repository;

import com.bridgelabz.employeepayrollapp.models.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData,Integer> {
}
