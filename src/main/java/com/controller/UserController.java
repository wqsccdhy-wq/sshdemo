package com.controller;

import com.entity.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName UserController
 * @Description: TODO
 * @Author wq
 * @Date 2019-10-23
 * @Version V1.0
 **/

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("info")
    @ResponseBody
    public UserInfo info(){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(123);
        userInfo.setUserName("wq");
        return userInfo;
    }
}
