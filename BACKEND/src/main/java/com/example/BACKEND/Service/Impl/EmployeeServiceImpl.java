package com.example.BACKEND.Service.Impl;

import com.example.BACKEND.Dao.EmployeeDao;
import com.example.BACKEND.Entity.Employee;
import com.example.BACKEND.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: BACKEND
 * @description:
 * @author: wavesen.shen
 * @create: 2019-02-19 15:44
 */
@Service("EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public List<Employee> getEmployee() {
        return employeeDao.getAllEmployee();
    }

    @Override
    public List<Employee> getEmployeeByUsername(String username, String password) {

        return employeeDao.getEmployeeByUsername(username,password);
    }
}
