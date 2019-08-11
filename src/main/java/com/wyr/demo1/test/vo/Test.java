package com.wyr.demo1.test.vo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class Test {

    @JSONField(name = "aaa")
    private Integer aa;

    @JSONField(name = "bbb")
    private String bb;
}
