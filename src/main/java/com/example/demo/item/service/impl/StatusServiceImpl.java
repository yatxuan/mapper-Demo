package com.example.demo.item.service.impl;

import com.example.demo.common.service.impl.BaseServiceImpl;
import com.example.demo.item.mapper.StatusMapper;
import com.example.demo.item.pojo.Status;
import com.example.demo.item.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>Description: 描述 </p>
 *
 * @Created with IDEA
 * @author: Yi-Xuan
 * @Date: 2019/1/8 0008
 * @Time: 20:31
 */
@Service
public class StatusServiceImpl extends BaseServiceImpl<Status, StatusMapper> implements StatusService {

    @Override
    @Autowired
    public void setMapper(StatusMapper statusMapper) {
        super.setMapper(statusMapper);
    }
}
