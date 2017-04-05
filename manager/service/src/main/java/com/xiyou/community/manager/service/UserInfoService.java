package com.xiyou.community.manager.service;

import com.xiyou.community.medical.manager.pojo.Userinfo;

/**
 * @author wangxinzhi.
 * @Description:
 * @2017/3/27
 * @13:43
 * @Copyright: Xiyou wangxinzhi
 */
public interface UserInfoService {
    Userinfo selectByPrimaryKey(Integer userId);
}
