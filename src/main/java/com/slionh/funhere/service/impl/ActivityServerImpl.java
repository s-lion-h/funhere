package com.slionh.funhere.service.impl;

import com.slionh.funhere.entity.Activity;
import com.slionh.funhere.entity.ActivityExample;
import com.slionh.funhere.mapper.ActivityMapper;
import com.slionh.funhere.service.ActivityServer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/*
 * Create by s lion h on 2018/8/26
 * 从首页插入activity时，model为1，代表仅添加title type 经纬度
 * 不能对外展示，需要进一步确认信息
 */
@Service
public class ActivityServerImpl implements ActivityServer {
    @Resource
    private ActivityMapper activityMapper;

    @Override
    public int addTitleType(Activity activity) {
//        ActivityExample activityExample=new ActivityExample();
        activity.setModel(1);
        activity.setCreatetime(new Date());
        int i = activityMapper.insert(activity);
        System.out.println("activity id : " +activity.getActivityid());
//        System.out.println(i);
        return activity.getActivityid();
    }

    @Override
    public List<Activity> listAllActivity() {
        ActivityExample activityExample=new ActivityExample();
        List<Activity> list=activityMapper.selectByExample(activityExample);
        System.out.println(list.toString());
        return list;
    }

    @Override
    public Activity getActivityDetail(int activityId) {
//        ActivityExample activityExample=new ActivityExample();
//        activityExample.createCriteria().andActivityidEqualTo(activityId);
        Activity activity= activityMapper.selectByPrimaryKey(activityId);
        System.out.println(activity.toString());
        return activity;
    }

    @Override
    public int insertDetailActivity(Activity activity) {
        activity.setModel(2);
        int i = activityMapper.updateByPrimaryKeySelective(activity);
        System.out.println("activity id : " +activity.getActivityid());

        return activity.getActivityid();
    }
}
