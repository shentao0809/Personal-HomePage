package com.example.BACKEND.Controller;

import com.example.BACKEND.Entity.DataConfig;
import com.example.BACKEND.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: BACKEND
 * @description: 首页
 * @author: wavesen.shen
 * @create: 2019-02-16 11:30
 */
@RestController
public class IndexController {
    @Autowired
    private DataConfig dc;

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public Object Index(){
        return dc;
    }

    @RequestMapping("/Employee")
    public Object getEmployee(){
        return employeeService.getEmployee();
    }

    @RequestMapping("/EmployeeByName")
    public Object getEmployeeByName(@RequestParam("username") String username,@RequestParam("password") String password){
        return employeeService.getEmployeeByUsername(username,password);
    }
}
