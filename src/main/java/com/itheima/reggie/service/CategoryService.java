package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.entity.Category;

/**
 * @author panjinsheng
 * @date 2022/09/23/19:32
 */
public interface CategoryService extends IService<Category> {

    public void remove(Long ids);
}
