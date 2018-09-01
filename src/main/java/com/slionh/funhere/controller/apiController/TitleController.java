package com.slionh.funhere.controller.apiController;

import com.slionh.funhere.entity.Activity;
import com.slionh.funhere.service.ActivityServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Create by s lion h on 2018/8/26
 */
@Controller
public class TitleController {
    @Autowired
    private ActivityServer activityServer;

    @RequestMapping("/titleType")
    @PostMapping
    @ResponseBody
    public HashMap titleType(HttpServletRequest request,Activity activity){
//        request.
//        String title=request.getParameter("title");
//        String type=request.getParameter("type");
//        System.out.println(title);
//        System.out.println(type);
        System.out.println(activity.toString());
        int activityId=activityServer.addTitleType(activity);
        HashMap message=new HashMap();
        message.put("status","success");
        message.put("activityId",activityId);
        return message;
//        return "success";

    }
}
