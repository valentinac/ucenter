package com.qidiancamp.modules.app.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.qidiancamp.common.utils.PageUtils;
import com.qidiancamp.common.utils.Query;

import com.qidiancamp.modules.app.dao.AccountLogsDao;
import com.qidiancamp.modules.app.entity.AccountLogsEntity;
import com.qidiancamp.modules.app.service.AccountLogsService;


@Service("accountLogsService")
public class AccountLogsServiceImpl extends ServiceImpl<AccountLogsDao, AccountLogsEntity> implements AccountLogsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AccountLogsEntity> page = this.selectPage(
                new Query<AccountLogsEntity>(params).getPage(),
                new EntityWrapper<AccountLogsEntity>()
        );

        return new PageUtils(page);
    }

}
