package com.qidiancamp.modules.app.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户账户
 * 
 * @author chenyu
 * @email chenyu@qidiancamp.com
 * @date 2018-06-21 23:05:22
 */
@TableName("uc_user_account")
public class UserAccountEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long acctId;
	/**
	 * 用户id
	 */
	private Long userId;
	/**
	 * 账户类型对应不同币种
	 */
	private String acctType;
	/**
	 * 账户状态:正常(A)/冻结(F)/注销(C)
	 */
	private String acctStatus;
	/**
	 * 可用金额
	 */
	private BigDecimal availableAmt;
	/**
	 * 绑定的钱包地址
	 */
	private String walletAddr;
	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 设置：
	 */
	public void setAcctId(Long acctId) {
		this.acctId = acctId;
	}
	/**
	 * 获取：
	 */
	public Long getAcctId() {
		return acctId;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 设置：账户类型对应不同币种
	 */
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	/**
	 * 获取：账户类型对应不同币种
	 */
	public String getAcctType() {
		return acctType;
	}
	/**
	 * 设置：账户状态:正常(A)/冻结(F)/注销(C)
	 */
	public void setAcctStatus(String acctStatus) {
		this.acctStatus = acctStatus;
	}
	/**
	 * 获取：账户状态:正常(A)/冻结(F)/注销(C)
	 */
	public String getAcctStatus() {
		return acctStatus;
	}
	/**
	 * 设置：可用金额
	 */
	public void setAvailableAmt(BigDecimal availableAmt) {
		this.availableAmt = availableAmt;
	}
	/**
	 * 获取：可用金额
	 */
	public BigDecimal getAvailableAmt() {
		return availableAmt;
	}
	/**
	 * 设置：绑定的钱包地址
	 */
	public void setWalletAddr(String walletAddr) {
		this.walletAddr = walletAddr;
	}
	/**
	 * 获取：绑定的钱包地址
	 */
	public String getWalletAddr() {
		return walletAddr;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
}
