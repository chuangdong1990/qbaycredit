package com.optimus.controller;

/**
 * Created by Dongchuang on 2017/11/13.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping("/index")
    public String  index(ModelMap map){
        map.addAttribute("host","www.51bangxue.com");
        return "index";
    }

}
