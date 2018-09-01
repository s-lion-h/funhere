package com.slionh.funhere.controller.apiController;

import com.slionh.funhere.entity.Activity;
import com.slionh.funhere.service.ActivityServer;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
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

    @ResponseBody
    @RequestMapping("/getActivityDetail")
    public Activity getActivityDetail(@RequestBody Activity activity){
        System.out.println("addDetail : "+activity);
        return activityServer.getActivityDetail(activity.getActivityid());
    }
}
