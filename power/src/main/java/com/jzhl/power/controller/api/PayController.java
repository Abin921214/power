package com.jzhl.power.controller.api;


import com.jzhl.power.bean.BaseResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class PayController {

    @PostMapping("/pay")
    public BaseResult pay(HttpServletRequest re){
        String serialno = re.getParameter("serialno");
        Map<String, Object> map = new HashMap<>();

        if(serialno == null){
            return new BaseResult(0,"设备不存在1", null);
        }else{
            System.out.println(serialno);
        }


        return new BaseResult(1,"查询成功", map);
    }



}
