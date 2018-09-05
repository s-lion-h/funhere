package com.slionh.funhere.service.impl;

import com.slionh.funhere.entity.Type;
import com.slionh.funhere.service.FormServer;
import com.slionh.funhere.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/*
 * Create by s lion h on 2018/8/22
 */
@Service
public class FormServerImpl implements FormServer {
    @Autowired
    private TypeService typeService;

    @Override
    public HashMap getForm() {
        HashMap hashMap=new HashMap();
        hashMap.put("todayDate",getTodayDate());
        hashMap.put("suggestTime",getSuggestTime());
        hashMap.put("types",listFormType());
        return hashMap;
    }

//    获取所有type
    @Override
    public List<Type> listFormType() {
        return typeService.listType();
    }

//    获取今天日期
    @Override
    public String getTodayDate() {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(new Date());
    }

//    获取建议时间
    @Override
    public String getSuggestTime() {
        return "12:00";
    }

//    解析提交表单
    @Override
    public void resolveFormActivity(HashMap map) {

    }
}
