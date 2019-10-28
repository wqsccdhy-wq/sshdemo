package com.controller;

import com.common.model.Page;
import com.entity.BehaviorUnitSystem;
import com.google.common.base.Strings;
import com.service.BehaviorUnitSystemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @ClassName UnitSystemController
 * @Description: TODO
 * @Author wq
 * @Date 2019-10-26
 * @Version V1.0
 **/
@Controller
@RequestMapping("unitSystem")
public class UnitSystemController {

    @Resource
    private BehaviorUnitSystemService behaviorUnitSystemService;

    @RequestMapping("list")
    public String unitSystem(HttpServletRequest request, HttpServletResponse response){
        String pageNo = request.getParameter("pageNo");
        if (Strings.isNullOrEmpty(pageNo)) {
            pageNo = "1";
        }
        Page<BehaviorUnitSystem> page = behaviorUnitSystemService.getBehaviorUnitSystems("", Integer.valueOf(pageNo), 5);
        List<BehaviorUnitSystem> results = page.getList();
        request.setAttribute("page",page);
        request.setAttribute("result",results);
        return "unitSystem/unitSystems";
    }
}
