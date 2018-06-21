package com.qidiancamp.modules.app.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qidiancamp.modules.app.entity.AccountLogsEntity;
import com.qidiancamp.modules.app.service.AccountLogsService;
import com.qidiancamp.common.utils.PageUtils;
import com.qidiancamp.common.utils.R;



/**
 * 用户账户明细
 *
 * @author chenyu
 * @email chenyu@qidiancamp.com
 * @date 2018-06-21 23:05:22
 */
@RestController
@RequestMapping("app/accountlogs")
public class AccountLogsController {
    @Autowired
    private AccountLogsService accountLogsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("app:accountlogs:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = accountLogsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{logId}")
    @RequiresPermissions("app:accountlogs:info")
    public R info(@PathVariable("logId") Long logId){
			AccountLogsEntity accountLogs = accountLogsService.selectById(logId);

        return R.ok().put("accountLogs", accountLogs);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("app:accountlogs:save")
    public R save(@RequestBody AccountLogsEntity accountLogs){
			accountLogsService.insert(accountLogs);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("app:accountlogs:update")
    public R update(@RequestBody AccountLogsEntity accountLogs){
			accountLogsService.updateById(accountLogs);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("app:accountlogs:delete")
    public R delete(@RequestBody Long[] logIds){
			accountLogsService.deleteBatchIds(Arrays.asList(logIds));

        return R.ok();
    }

}
