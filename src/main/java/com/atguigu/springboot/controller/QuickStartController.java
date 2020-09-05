package com.atguigu.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xuedong HuangFu
 * @Date 2020/09/01
 */
@RestController
public class QuickStartController {

    @RequestMapping("/quick")
    public String quick(){
        return "springboot访问成功";

    }

}
