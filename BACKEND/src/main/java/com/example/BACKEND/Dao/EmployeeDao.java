package com.example.BACKEND.Dao;

import com.example.BACKEND.Entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeDao {
    List<Employee> getAllEmployee();
    List<Employee> getEmployeeByUsername(@Param("username") String username,@Param("password") String password);
}
