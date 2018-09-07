package com.slionh.funhere.controller.apiController;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.slionh.funhere.entity.Activity;
import com.slionh.funhere.service.ActivityServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

/*
 * Create by s lion h on 2018/9/2
 */
@Controller
public class msgController {
    @Autowired
    private ActivityServer activityServer;


    @RequestMapping("/postMsg")
    @ResponseBody
    public String postMsg(@RequestBody @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8") Activity activity){
        System.out.println("postMsg : "+activity.toString());
        int activityId=activityServer.insertDetailActivity(activity);
        if (activityId!=0){
            return "success";
        }else{
            return "false";
        }
//        System.out.println("postMap : "+map);
    }
}
