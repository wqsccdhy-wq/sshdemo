package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName MainController
 * @Description: 后台管理系统首页
 * @Author wq
 * @Date 2019-10-26
 * @Version V1.0
 **/
@Controller
@RequestMapping("main")
public class MainController {

    @RequestMapping("index")
    public String index(HttpServletRequest request, HttpServletResponse response) {
        return "index";
    }

    @RequestMapping("main")
    public String mainIndex(HttpServletRequest request, HttpServletResponse response) {
        return "main";
    }
}
