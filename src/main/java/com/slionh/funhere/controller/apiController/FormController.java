package com.slionh.funhere.controller.apiController;

import com.slionh.funhere.service.FormServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/*
 * Create by s lion h on 2018/8/22
 */
@RestController
public class FormController {
    @Autowired
    private FormServer formServer;

    @RequestMapping("/getForm")
    public HashMap getForm(){
        return formServer.getForm();
    }
}
