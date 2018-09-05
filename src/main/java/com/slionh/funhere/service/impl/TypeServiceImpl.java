package com.slionh.funhere.service.impl;

import com.slionh.funhere.entity.Type;
import com.slionh.funhere.entity.TypeExample;
import com.slionh.funhere.mapper.TypeMapper;
import com.slionh.funhere.service.TypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
 * Create by s lion h on 2018/8/22
 */
@Service
public class TypeServiceImpl implements TypeService {
    @Resource
    private TypeMapper typeMapper;

    @Override
    public List<Type> listType() {
//        HashMap types=new HashMap();
        TypeExample typeExample=new TypeExample();
        List<Type> list=typeMapper.selectByExample(typeExample);
//        System.out.println(list.toString());
        for (Type type:list){
            System.out.println(type.toString());
//            types.put(type.getTypeid(),type.getName());
        }
        return list;
    }
}
