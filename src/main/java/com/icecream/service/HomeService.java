package com.icecream.service;

import com.icecream.model.Home;

/**
 * Created by vlrkw on 2017-03-19.
 */
public interface HomeService {
    void insert();
    void update();
    Home select(String name) throws Exception;
}
