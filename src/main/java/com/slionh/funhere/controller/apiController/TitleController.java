package com.slionh.funhere.controller.apiController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/*
 * Create by s lion h on 2018/8/26
 */
@Controller
public class TitleController {

    @RequestMapping("/titleType")
    @PostMapping
    @ResponseBody
    public String titleType(HttpServletRequest request){
//        request.
        String title=request.getParameter("title");
        String type=request.getParameter("type");
        System.out.println(title);
        System.out.println(type);
        return "success";

    }
}
