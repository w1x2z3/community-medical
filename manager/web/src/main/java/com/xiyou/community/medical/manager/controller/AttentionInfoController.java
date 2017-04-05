//package com.xiyou.community.medical.manager.controller;
//
//import com.xiyou.community.manager.service.AttentioninfoService;
//import com.xiyou.community.medical.manager.pojo.Attentioninfo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.annotation.Resource;
//
///**
// * @author wangxinzhi.
// * @Description:
// * @2017/3/23
// * @15:14
// * @Copyright: Xiyou wangxinzhi
// */
//@Controller
//@RequestMapping("/attentionInfo")
//public class AttentioninfoController {
//    @Resource
//    private AttentioninfoService attentioninfoService;
//
//    @RequestMapping(value = "/attentionInfo", method = RequestMethod.POST)
//    public void insertData(){
//        Attentioninfo attentioninfo = new Attentioninfo();
//        attentioninfo.setUserId(10001);
//        attentioninfo.setTheAllergy("暂无");
//        attentioninfo.setDiseaseHistory("暂无");
//        attentioninfo.setPresentSituation("暂无");
//        attentioninfoService.insert(attentioninfo);
//    }
//
//}
