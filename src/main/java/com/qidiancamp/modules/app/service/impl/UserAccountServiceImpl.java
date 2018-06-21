package com.qidiancamp.modules.app.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.qidiancamp.common.utils.PageUtils;
import com.qidiancamp.common.utils.Query;

import com.qidiancamp.modules.app.dao.UserAccountDao;
import com.qidiancamp.modules.app.entity.UserAccountEntity;
import com.qidiancamp.modules.app.service.UserAccountService;


@Service("userAccountService")
public class UserAccountServiceImpl extends ServiceImpl<UserAccountDao, UserAccountEntity> implements UserAccountService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<UserAccountEntity> page = this.selectPage(
                new Query<UserAccountEntity>(params).getPage(),
                new EntityWrapper<UserAccountEntity>()
        );

        return new PageUtils(page);
    }

}
