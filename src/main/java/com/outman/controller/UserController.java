package com.outman.controller;

import com.outman.po.User;
import com.outman.service.UserService;
import com.outman.utils.FastjsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: outman
 * Date: 2017/7/7
 * Time: 下午9:21
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/userQuery")
    public ModelAndView userQuery() throws Exception {

        //查询id为1的用户
        User user = userService.findUserById(1);

        ModelAndView modelAndView = new ModelAndView();

        if (user != null) {
            modelAndView.addObject("username", user.getUsername());
        }

        modelAndView.setViewName("test");

        return modelAndView;

    }

    @ResponseBody
    @RequestMapping(value ="/findUser", method = RequestMethod.GET)
    public User findUser(@RequestParam(value = "uid", required = false) int uid) throws Exception {

        User user = userService.findUserById(uid);

        return user;

    }


    @ResponseBody
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<User> getAll(@RequestParam(value = "username", required = false) String username) throws Exception {
        System.out.println("UserController name:" + username);
        //查询id为1的用户
        List<User> list = userService.getAll();
        return list;
    }

}
