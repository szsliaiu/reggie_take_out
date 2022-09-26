package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author panjinsheng
 * @date 2022/09/24/20:21
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {
}