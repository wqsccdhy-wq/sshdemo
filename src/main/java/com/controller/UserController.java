package com.controller;

import com.entity.BehaviorUnitSystem;
import com.entity.UserInfo;
import com.service.BehaviorUnitSystemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

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

    @Resource
    private BehaviorUnitSystemService behaviorUnitSystemService;

    @RequestMapping("info")
    @ResponseBody
    public UserInfo info() {
        BehaviorUnitSystem behaviorUnitSystem = behaviorUnitSystemService.getBehaviorUnitSystemById("1");
        System.out.printf(behaviorUnitSystem.getName());
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(123);
        userInfo.setUserName("wq");
        return userInfo;
    }
}
