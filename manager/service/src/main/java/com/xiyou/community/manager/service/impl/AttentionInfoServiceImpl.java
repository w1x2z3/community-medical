package com.xiyou.community.manager.service.impl;

import com.xiyou.community.manager.service.AttentionInfoService;
import com.xiyou.community.medical.manager.mapper.AttentioninfoMapper;
import com.xiyou.community.medical.manager.pojo.Attentioninfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangxinzhi.
 * @Description:
 * @2017/3/23
 * @14:57
 * @Copyright: Xiyou wangxinzhi
 */
@Service
public class AttentionInfoServiceImpl implements AttentionInfoService{
    @Autowired
    private AttentioninfoMapper attentioninfoMapper;

    @Override
    public int insert(Attentioninfo record) {
        Attentioninfo attentioninfo = new Attentioninfo();
        attentioninfo.setUserId(10001);
        attentioninfo.setTheAllergy("暂无");
        attentioninfo.setDiseaseHistory("暂无");
        attentioninfo.setPresentSituation("暂无");
        int i = attentioninfoMapper.insert(attentioninfo);
        return i;
    }


}
