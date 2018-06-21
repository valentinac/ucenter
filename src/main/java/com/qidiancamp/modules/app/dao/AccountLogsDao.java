package com.qidiancamp.modules.app.dao;

import com.qidiancamp.modules.app.entity.AccountLogsEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户账户明细
 * 
 * @author chenyu
 * @email chenyu@qidiancamp.com
 * @date 2018-06-21 23:05:22
 */
@Mapper
public interface AccountLogsDao extends BaseMapper<AccountLogsEntity> {
	
}
