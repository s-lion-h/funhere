package com.slionh.funhere.controller;

import com.slionh.funhere.entity.Type;
import com.slionh.funhere.service.FormServer;
import com.slionh.funhere.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("/11")
    @ResponseBody
    public List<Type> toIndex(HttpServletRequest request){
//        List<Type> types=typeService.listType();
        List<Type> types=formServer.listFormType();
        formServer.getTodayDate();
        return types;
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
