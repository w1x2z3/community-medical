package com.xiyou.community.manager.service.impl;

import com.xiyou.community.manager.service.UserInfoService;
import com.xiyou.community.medical.manager.mapper.UserinfoMapper;
import com.xiyou.community.medical.manager.pojo.Userinfo;

import javax.annotation.Resource;

/**
 * @author wangxinzhi.
 * @Description:
 * @2017/3/27
 * @13:43
 * @Copyright: Xiyou wangxinzhi
 */
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserinfoMapper userinfoMapper;

    @Override
    public Userinfo selectByPrimaryKey(Integer userId) {
        return userinfoMapper.selectByPrimaryKey(userId);
    }
}
