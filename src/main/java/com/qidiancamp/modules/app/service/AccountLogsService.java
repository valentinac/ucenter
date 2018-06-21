package com.qidiancamp.modules.app.service;

import com.baomidou.mybatisplus.service.IService;
import com.qidiancamp.common.utils.PageUtils;
import com.qidiancamp.modules.app.entity.AccountLogsEntity;

import java.util.Map;

/**
 * 用户账户明细
 *
 * @author chenyu
 * @email chenyu@qidiancamp.com
 * @date 2018-06-21 23:05:22
 */
public interface AccountLogsService extends IService<AccountLogsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

