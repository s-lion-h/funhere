package com.slionh.funhere.controller.apiController;

import com.slionh.funhere.entity.Activity;
import com.slionh.funhere.service.ActivityServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*
 * Create by s lion h on 2018/8/26
 */
@Controller
public class ActivityController {
    @Autowired
    private ActivityServer activityServer;

    @ResponseBody
    @RequestMapping("/listAllActivity")
    public List<Activity> listAllActivity(){
        return activityServer.listAllActivity();

    }
}
