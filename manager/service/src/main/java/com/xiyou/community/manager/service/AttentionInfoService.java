package com.xiyou.community.manager.service;

import com.xiyou.community.medical.manager.pojo.Attentioninfo;
import org.springframework.stereotype.Service;

/**
 * @author wangxinzhi.
 * @Description:
 * @2017/3/23
 * @14:57
 * @Copyright: Xiyou wangxinzhi
 */
@Service
public interface AttentioninfoService {
    void insert(Attentioninfo attentioninfo);
}
