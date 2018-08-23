package com.gwg.demo.controller;


import com.sun.org.apache.bcel.internal.generic.RETURN;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Api(value = "helloController", tags = "测试")
public class HelloController {

    @ApiOperation(value = "哈喽")
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello(){
        return "hello World";
    }

}
