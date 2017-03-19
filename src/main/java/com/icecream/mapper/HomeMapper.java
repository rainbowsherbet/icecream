package com.icecream.mapper;

import com.icecream.model.Home;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by vlrkw on 2017-03-19.
 */
@Mapper
public interface HomeMapper {
    Home selectHome(String name) throws Exception;
}
