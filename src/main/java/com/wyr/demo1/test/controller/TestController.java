package com.wyr.demo1.test.controller;

import com.alibaba.fastjson.JSONObject;
import com.wyr.demo1.test.vo.Test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "test")
public class TestController {

    @RequestMapping()
    public String test(){
        Test test = new Test();
        test.setAa(11);
        test.setBb("22");
        return JSONObject.toJSONString(test);
    }
}
