package com.example.BACKEND.Controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: BACKEND
 * @description: erureka服务提供者
 * @author: wavesen.shen
 * @create: 2019-05-08 11:25
 */
@RestController
public class EurekaProviderController {
    @RequestMapping(value="/call/{a}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public String call(@PathVariable String a){
        return a;
    }
}
