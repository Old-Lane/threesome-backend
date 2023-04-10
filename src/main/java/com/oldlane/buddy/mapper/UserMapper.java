package com.oldlane.buddy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.oldlane.buddy.model.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

/**
 * 用户数据库操作
 *
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




