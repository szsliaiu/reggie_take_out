package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author panjinsheng
 * @date 2022/09/23/19:59
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
