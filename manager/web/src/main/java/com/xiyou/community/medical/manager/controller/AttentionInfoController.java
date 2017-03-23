package com.xiyou.community.medical.manager.controller;

import com.xiyou.community.manager.service.AttentionInfoService;
import com.xiyou.community.medical.manager.pojo.Attentioninfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangxinzhi.
 * @Description:
 * @2017/3/23
 * @15:14
 * @Copyright: Xiyou wangxinzhi
 */
@Controller
@RequestMapping("/attentionInfo")
public class AttentionInfoController {
    @Autowired
    AttentionInfoService attentionInfoService;

    @ResponseBody
    public int insert(Attentioninfo attentioninfo){
        int i = attentionInfoService.insert(attentioninfo);
        return i;
    }

}
