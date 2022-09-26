package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author panjinsheng
 * @date 2022/09/25/0:10
 */
@Mapper
public interface OrderMapper extends BaseMapper<Orders> {
}
