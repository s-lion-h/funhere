package com.slionh.funhere.controller;

import com.slionh.funhere.entity.Type;
import com.slionh.funhere.service.ActivityServer;
import com.slionh.funhere.service.FormServer;
import com.slionh.funhere.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

/*
 * Create by s lion h on 2018/8/22
 */
@Controller
public class indexController {
    @Autowired
//    private TypeService typeService;
    private FormServer formServer;

    @Autowired
    private ActivityServer activityServer;

    @RequestMapping("/11")
    @ResponseBody
    public List<Type> toIndex(HttpServletRequest request){
//        List<Type> types=typeService.listType();
        List<Type> types=formServer.listFormType();
        formServer.getTodayDate();
        return types;
    }

    @RequestMapping("/")
    public ModelAndView index(HttpServletRequest request,ModelAndView modelAndView){
        modelAndView.setViewName("index");
        modelAndView.addObject("types",formServer.listFormType());
        modelAndView.addObject("activity",activityServer.listAllActivity());
        return modelAndView;
    }

    @RequestMapping("/addDetail")
    public ModelAndView addDetail(HttpServletRequest request,ModelAndView modelAndView){
        modelAndView.setViewName("addDetail");

        return modelAndView;
    }
}
