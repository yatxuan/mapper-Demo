package com.example.demo.item.controller;

import com.example.demo.common.controller.BaseController;
import com.example.demo.item.pojo.User;
import com.example.demo.item.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Description: 描述 </p>
 *
 * @Created with IDEA
 * @author: Yi-Xuan
 * @Date: 2019/1/8 0008
 * @Time: 20:31
 */
@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController extends BaseController<User, UserServiceImpl> {

    @Override
    @Autowired
    public void setService(UserServiceImpl service) {
        super.setService(service);
    }
}
