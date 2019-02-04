package com.mmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
/*
@Mapping()
*/
public class TestController {

    @Autowired
    TestController testController;

    public void aa(){

    }

   // @ResponseBody
  //  @RequestBody(true)
    public Map bb(/*@RequestBody()*/){
        Map map;
        return null;
    }

    public String getControl(){
        return "a";
    }

}
