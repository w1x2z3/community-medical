package com.xiyou.community.manager.service.impl;

import com.xiyou.community.manager.service.AttentioninfoService;
import com.xiyou.community.medical.manager.mapper.AttentioninfoMapper;
import com.xiyou.community.medical.manager.pojo.Attentioninfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * @author wangxinzhi.
 * @Description:
 * @2017/3/23
 * @14:57
 * @Copyright: Xiyou wangxinzhi
 */
@Service
public class AttentioninfoServiceImpl implements AttentioninfoService , Serializable {
    @Resource
    private AttentioninfoMapper attentioninfoMapper;


    @Override
    public void insert(Attentioninfo attentioninfo) {
        attentioninfoMapper.insert(attentioninfo);
    }
}
