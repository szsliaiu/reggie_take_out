package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.AddressBook;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author panjinsheng
 * @date 2022/09/24/22:06
 */

@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {
}