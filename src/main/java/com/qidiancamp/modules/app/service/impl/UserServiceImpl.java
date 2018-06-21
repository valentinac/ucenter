package com.qidiancamp.modules.app.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.qidiancamp.common.exception.RRException;
import com.qidiancamp.common.validator.Assert;
import com.qidiancamp.modules.app.dao.UserDao;
import com.qidiancamp.modules.app.entity.UserEntity;
import com.qidiancamp.modules.app.form.LoginForm;
import com.qidiancamp.modules.app.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {

	@Override
	public UserEntity queryByUserName(String mobile) {
		UserEntity userEntity = new UserEntity();
		userEntity.setUsername(mobile);
		return baseMapper.selectOne(userEntity);
	}

	@Override
	public long login(LoginForm form) {
		UserEntity user = queryByUserName(form.getUsername());
		Assert.isNull(user, "用户名或密码错误");

		//密码错误
		if(!user.getPassword().equals(DigestUtils.sha256Hex(form.getPassword()))){
			throw new RRException("用户名或密码错误");
		}

		return user.getUserId();
	}
}
