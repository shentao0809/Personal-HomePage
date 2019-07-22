package com.example.BACKEND.Controller;

import com.example.BACKEND.Entity.PartNo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Part;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @program: BACKEND
 * @description:
 * @author: wavesen.shen
 * @create: 2019-07-01 16:05
 */
@RestController
@CrossOrigin(origins ="*", maxAge = 3600)
public class PartNoSet {
    @RequestMapping(value="getList",method = RequestMethod.GET)

    public List<PartNo> getList(){

        List<PartNo> ls=new ArrayList<PartNo>();
        Random r=new Random();
        int j=(int)r.nextInt(200);
        for(int i=0;i<j;i++){
            PartNo partno=new PartNo();
            partno.setCreateDate(new Date());
            partno.setMemo("MEMO");
            partno.setCreator("creator");
            partno.setEditor("editor");
            partno.setIsEnable(true);
            partno.setPartName("partname1111");
            partno.setPartNo(i);
            partno.setRoute("111");
            partno.setType("11");
            partno.setUpdateDate(new Date());
            ls.add(partno);
        }

        return ls;
    }
}
