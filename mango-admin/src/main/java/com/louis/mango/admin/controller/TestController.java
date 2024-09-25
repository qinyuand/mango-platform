package com.louis.mango.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class TestController {

    @RequestMapping("/git")
    public String git() throws Exception {
        return "hello l3 -> king -> idea  -> branch v005";
    }


}
