package com.itheima.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie.entity.User;
import com.itheima.reggie.mapper.UserMapper;
import com.itheima.reggie.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author panjinsheng
 * @date 2022/09/24/20:21
 */

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}