package com.example.BACKEND.Service;

import com.example.BACKEND.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: BACKEND
 * @description:
 * @author: wavesen.shen
 * @create: 2019-02-19 15:43
 */

public interface EmployeeService {
    List<Employee> getEmployee();
    List<Employee> getEmployeeByUsername(String username,String password);
}
