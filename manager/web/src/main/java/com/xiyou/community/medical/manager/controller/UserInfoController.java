package com.xiyou.community.medical.manager.controller;

import com.xiyou.community.manager.service.UserInfoService;
import com.xiyou.community.medical.manager.pojo.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.logging.Logger;

/**
 * @author wangxinzhi.
 * @Description:
 * @2017/4/5
 * @20:35
 * @Copyright: Xiyou wangxinzhi
 */
@Controller
@RequestMapping("/index")
public class UserInfoController {


    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/medical/index", method = RequestMethod.GET)
    public void loginIndex(){
        Userinfo userinfo = userInfoService.selectByPrimaryKey(10001);

    }


}
