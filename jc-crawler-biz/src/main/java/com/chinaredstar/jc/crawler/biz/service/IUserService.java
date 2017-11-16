package com.chinaredstar.jc.crawler.biz.service;

import com.chinaredstar.jc.crawler.biz.result.UserResult;

import java.util.List;

/**
 * Created by zhuangj on 2017/10/30.
 */

public interface IUserService {

    List<UserResult> selectAllUser();
}
