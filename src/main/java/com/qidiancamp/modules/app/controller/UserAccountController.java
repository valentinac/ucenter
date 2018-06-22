package com.qidiancamp.modules.app.controller;

import java.util.Arrays;
import java.util.Map;

import com.qidiancamp.modules.app.service.AccountLogsService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qidiancamp.modules.app.entity.UserAccountEntity;
import com.qidiancamp.modules.app.service.UserAccountService;
import com.qidiancamp.common.utils.PageUtils;
import com.qidiancamp.common.utils.R;



/**
 * 用户账户
 *
 * @author chenyu
 * @email chenyu@qidiancamp.com
 * @date 2018-06-21 23:05:22
 */
@RestController
@RequestMapping("app/useraccount")
public class UserAccountController {
    @Autowired
    private UserAccountService userAccountService;
    @Autowired
    private AccountLogsService accountLogsService;      //账户日志明细表操作

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("app:useraccount:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userAccountService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{acctId}")
    @RequiresPermissions("app:useraccount:info")
    public R info(@PathVariable("acctId") Long acctId){
			UserAccountEntity userAccount = userAccountService.selectById(acctId);

        return R.ok().put("userAccount", userAccount);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("app:useraccount:save")
    public R save(@RequestBody UserAccountEntity userAccount){
			userAccountService.insert(userAccount);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("app:useraccount:update")
    public R update(@RequestBody UserAccountEntity userAccount){
			userAccountService.updateById(userAccount);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("app:useraccount:delete")
    public R delete(@RequestBody Long[] acctIds){
			userAccountService.deleteBatchIds(Arrays.asList(acctIds));

        return R.ok();
    }

    /**
     * 充值
     * @return
     */
    @RequestMapping("/recharge")
    public R recharge(){
        //

        return R.ok();
    }

    /**
     * 转账
     * @return
     */
    @RequestMapping("/transfer")
    public R transfer(){

        return R.ok();
    }

    /**
     * 支付
     * @return
     */
    @RequestMapping("/pay")
    public R pay(){

        return R.ok();
    }

}
