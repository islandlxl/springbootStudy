package com.mengxuegu.springbootbill.Controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.mengxuegu.springbootbill.utils.RegionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/*
@project:com.mengxuegu.springbootbill.Controller
@Title:MapController
@Auther:lxl
@create:2020/5/10,14:29
*/
@Controller
public class MapController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/maps")
    public String testMap(){

        logger.info("进入百度地图");


        return "map/testMap.html";
    }
    @PostMapping("/sendBankEnd")
    @ResponseBody
    public String sendBankEnd(HttpServletRequest request){
        String[] overlays = request.getParameterValues("overlays[]");
       if (overlays!=null&&overlays.length>0){
           if(overlays.length%2==0){
               logger.info("总共有"+overlays.length/2+"对经纬度");
           }else {
               logger.info("经纬度个数不匹配！");
               return "fail";
           }
           int num=overlays.length/2;
           double x[]=new double[num];
           double y[]=new double[num];


           int i=0,j=0,count=0;
           while (count!=num){
               j=i+1;
               x[count]=Double.parseDouble(overlays[i]);
               y[count]=Double.parseDouble(overlays[j]);
               count++;
               i=i+2;
           }


           boolean flag = RegionUtils.isInpolygon(113.951486,22.56361, x, y);

           if (flag==true){
               return "在范围内";
           }else{
               return "不在范围内";
           }
       }else{
           return "fail";
       }

    }
}
