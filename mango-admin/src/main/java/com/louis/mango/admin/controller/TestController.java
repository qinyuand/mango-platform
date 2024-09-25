package com.louis.mango.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
        @RequestMapping("/git")
        public String git() throws Exception {
            return "hello l3 -> king -> idea  -> master v01";
        }
}
