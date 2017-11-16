package com.chinaredstar.jc.crawler.dao.mapper;

import com.chinaredstar.jc.crawler.biz.result.UserResult;

import java.util.List;

/**
 *
 * @author zhuangj
 * @date 2017/10/30
 */
public interface UserMapper {

    List<UserResult> selectAllUser();

}
