package com.controller;

import com.entity.BehaviorUnitSystem;
import com.entity.UserInfo;
import com.service.BehaviorUnitSystemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

    /**
     *
     * @return
     */
    @RequestMapping("info")
    @ResponseBody
    public UserInfo info() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(123);
        userInfo.setUserName("wq");
        return userInfo;
    }

    /**
     * http://localhost:8080/sshdemo/user/unitSystem?id=1
     * 
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("unitSystem")
    public String unitSystem(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        BehaviorUnitSystem behaviorUnitSystem = behaviorUnitSystemService.getBehaviorUnitSystemById(id);
        request.setAttribute("unitSystem", behaviorUnitSystem);
        return "unitSystem";
    }

    /**
     * http://localhost:8080/sshdemo/user/allUnitSystem
     * 
     * @param request
     * @param response
     * @return
     */
    /* @RequestMapping("allUnitSystem")
    public String allUnitSystem(HttpServletRequest request, HttpServletResponse response){
        String id = request.getParameter("id");
        List<BehaviorUnitSystem> result = behaviorUnitSystemService.getBehaviorUnitSystems(id);
        request.setAttribute("result",result);
        request.setAttribute("size",result.size());
        return "index";
    }*/
}
