package com.moneyio.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by akli on 28/03/15.
 */
@RestController

public class TestController {


    @RequestMapping(value = "/", produces = "application/json",
            method = RequestMethod.GET)
    public @ResponseBody
    String getDefaultCurriculum(
            HttpServletResponse response, HttpServletRequest request) {
        return "Hello world from Moneyio API !!";
    }
}
