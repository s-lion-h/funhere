package com.slionh.funhere.service;

import com.slionh.funhere.entity.Type;

import java.util.HashMap;
import java.util.List;

/*
 * Create by s lion h on 2018/8/22
 */
public interface FormServer {
    HashMap getForm();
    List<Type> listFormType();
    String getTodayDate();
    String getSuggestTime();
    void resolveFormActivity(HashMap map);
}
