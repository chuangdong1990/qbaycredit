package com.optimus.controller;

import com.optimus.mapper.UserMapper;
import com.optimus.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.annotation.Resource;

/**
 * Created by Dongchuang on 2017/11/13.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Resource
    private UserMapper userMapper;
    @RequestMapping(value="/users",method = RequestMethod.GET)
    public @ResponseBody User testUserDao(){
        User user =userMapper.findById("1");
        return user;
    }

}
