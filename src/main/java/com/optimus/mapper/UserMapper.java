package com.optimus.mapper;

import com.optimus.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Dongchuang on 2017/11/13.
 */
@Mapper
public interface UserMapper {
    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User findById(String id);
}
