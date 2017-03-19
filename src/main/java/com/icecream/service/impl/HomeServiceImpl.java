package com.icecream.service.impl;

import com.icecream.mapper.HomeMapper;
import com.icecream.model.Home;
import com.icecream.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vlrkw on 2017-03-19.
 */
@Service
public class HomeServiceImpl implements HomeService {
    @Autowired
    HomeMapper homeMapper;

    @Override
    public void insert() {

    }

    @Override
    public void update() {

    }

    @Override
    public Home select(String name) throws Exception {
        return homeMapper.selectHome(name);
    }
}
