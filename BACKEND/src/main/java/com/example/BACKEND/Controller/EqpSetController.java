package com.example.BACKEND.Controller;

import com.example.BACKEND.Entity.Eqp;
import com.example.BACKEND.Entity.PartNo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @program: BACKEND
 * @description:
 * @author: wavesen.shen
 * @create: 2019-07-08 19:24
 */
@RestController
//@CrossOrigin(origins ="*", maxAge = 3600)
public class EqpSetController {
    @RequestMapping(value="/EqpSetController/getListEqp",method = RequestMethod.GET)
    public List<Eqp> getListEqp(){
        List<Eqp> ls=new ArrayList<Eqp>();
        Random r=new Random();
        int j=r.nextInt(200);
        for(int i=0;i<j;i++){
            Eqp eqp=new Eqp();
            eqp.setEquipmentNo(i);
            eqp.setEquipmentName("EquipmentName");
            eqp.setBrand("2121");
            eqp.setCreateDate(new Date());
            eqp.setMemo("MEMO");
            eqp.setEditor("editor");
            eqp.setUpdateDate(new Date());
            eqp.setEnterDate(new Date());
            eqp.setGroup("1111");
            eqp.setLocation("2222");
            eqp.setModel("2444");
            eqp.setStatus("23444");
            eqp.setSupplier("3333");
            ls.add(eqp);
        }
        return ls;
    }
}
