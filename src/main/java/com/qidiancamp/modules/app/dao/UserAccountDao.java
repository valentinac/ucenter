package com.qidiancamp.modules.app.dao;

import com.qidiancamp.modules.app.entity.UserAccountEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户账户
 * 
 * @author chenyu
 * @email chenyu@qidiancamp.com
 * @date 2018-06-21 23:05:22
 */
@Mapper
public interface UserAccountDao extends BaseMapper<UserAccountEntity> {
	
}
