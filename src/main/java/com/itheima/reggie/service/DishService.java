package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.dto.DishDto;
import com.itheima.reggie.entity.Dish;

/**
 * @author panjinsheng
 * @date 2022/09/23/20:00
 */
public interface DishService extends IService<Dish> {

    public void saveWithFlavor(DishDto dishDto);

    //����id��ѯ��Ʒ��Ϣ�Ͷ�Ӧ�Ŀ�ζ��Ϣ
    public DishDto getByIdWithFlavor(Long id);

    //���²�Ʒ��Ϣ��ͬʱ���¶�Ӧ�Ŀ�ζ��Ϣ
    public void updateWithFlavor(DishDto dishDto);
}
