package com.chinasoft.data.service.impl;

import com.chinasoft.data.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public void say() {
        System.out.println("ok");
    }
}
