package com.xiyou.community.manager.service;

import com.xiyou.community.medical.manager.mapper.AttentioninfoMapper;
import com.xiyou.community.medical.manager.pojo.Attentioninfo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangxinzhi.
 * @Description:
 * @2017/3/23
 * @15:44
 * @Copyright: Xiyou wangxinzhi
 */

public class AttentionInfoMapperTest {

    private ApplicationContext applicationContext;

    private AttentioninfoMapper attentioninfoMapper;
    
    @Before
    public void setUp() throws Exception{
        applicationContext = new ClassPathXmlApplicationContext("resources/applicationContext-service.xml");
        attentioninfoMapper = (AttentioninfoMapper)applicationContext.getBean("attentioninfoMapper");
    }

    @Test
    public void testInsert(){
        Attentioninfo attentioninfo = new Attentioninfo();
        attentioninfo.setUserId(10001);
        attentioninfo.setTheAllergy("暂无");
        attentioninfo.setDiseaseHistory("暂无");
        attentioninfo.setPresentSituation("暂无");
        attentioninfoMapper.insert(attentioninfo);
    }

}
