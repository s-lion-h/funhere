package com.slionh.funhere.service;

import com.slionh.funhere.entity.Activity;

import java.util.List;

/*
 * Create by s lion h on 2018/8/26
 */
public interface ActivityServer {
    int addTitleType(Activity activity);
    List<Activity> listAllActivity();
}
