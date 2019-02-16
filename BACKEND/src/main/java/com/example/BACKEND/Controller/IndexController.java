package com.example.BACKEND.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
    @RequestMapping("/")
    //@ResponseBody
    public String Index(){
        return "1";
    }
}
