package com.slionh.funhere.controller.apiController;

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
    public void postMsg(@RequestBody Activity activity){
        System.out.println("postMsg : "+activity.toString());
        activityServer.insertDetailActivity(activity);
//        System.out.println("postMap : "+map);
    }
}
