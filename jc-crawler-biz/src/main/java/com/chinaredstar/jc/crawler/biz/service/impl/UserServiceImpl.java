package com.chinaredstar.jc.crawler.biz.service.impl;

import com.chinaredstar.jc.crawler.biz.result.UserResult;
import com.chinaredstar.jc.crawler.biz.service.IUserService;
import com.chinaredstar.jc.crawler.dao.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2017/10/30.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public List<UserResult> selectAllUser() {
        return userMapper.selectAllUser();
    }
}
