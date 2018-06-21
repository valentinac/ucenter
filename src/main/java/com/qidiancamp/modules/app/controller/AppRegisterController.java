package com.qidiancamp.modules.app.controller;


import com.qidiancamp.common.utils.R;
import com.qidiancamp.common.validator.ValidatorUtils;
import com.qidiancamp.modules.app.entity.UserEntity;
import com.qidiancamp.modules.app.form.RegisterForm;
import com.qidiancamp.modules.app.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 注册
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-26 17:27
 */
@RestController
@RequestMapping("/app")
@Api("APP注册接口")
public class AppRegisterController {
    @Autowired
    private UserService userService;

    @PostMapping("register")
    @ApiOperation("注册")
    public R register(@RequestBody RegisterForm form){

        //表单校验
        ValidatorUtils.validateEntity(form);

        UserEntity user = new UserEntity();
        user.setMobile(form.getMobile());
        user.setUsername(form.getUserName()==null?form.getMobile():form.getUserName());     //如果用户名为空则使用手机号码为用户名
        user.setPassword(DigestUtils.sha256Hex(form.getPassword()));
        user.setCreateTime(new Date());
        //新增的字段
        user.setEmail(form.getEmail());
        user.setSite(form.getSite());
        user.setReferrerId(Long.parseLong(form.getReferrerId()));
        userService.insert(user);

        return R.ok();
    }
}
