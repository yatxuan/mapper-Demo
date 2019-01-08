package com.example.demo.item.controller;

import com.example.demo.common.controller.BaseController;
import com.example.demo.item.pojo.Status;
import com.example.demo.item.service.impl.StatusServiceImpl;
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
@RequestMapping("/status")
public class StatusController extends BaseController<Status, StatusServiceImpl> {

    @Override
    @Autowired
    public void setService(StatusServiceImpl service) {
        super.setService(service);
    }
}
