package com.qidiancamp.modules.app.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户账户明细
 * 
 * @author chenyu
 * @email chenyu@qidiancamp.com
 * @date 2018-06-21 23:05:22
 */
@TableName("uc_account_logs")
public class AccountLogsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long logId;
	/**
	 * 用户id
	 */
	private Long userId;
	/**
	 * 账户id
	 */
	private Long acctId;
	/**
	 * 账户类型对应不同币种
	 */
	private String acctType;
	/**
	 * 操作类型:充值(R)/转账(T)/付款(P)等
	 */
	private String operType;
	/**
	 * 记账类型:消纳(0)/发生(1)
	 */
	private Integer loanType;
	/**
	 * 发生金额
	 */
	private BigDecimal amt;
	/**
	 * 快速记账:+/-金额
	 */
	private BigDecimal rapidAmt;
	/**
	 * 操作之前余额
	 */
	private BigDecimal preOperAmt;
	/**
	 * 关联订单，充值订单等的订单id
	 */
	private Long orderId;
	/**
	 * 操作人id
	 */
	private Long operUserId;
	/**
	 * 操作时间
	 */
	private Date createTime;

	/**
	 * 设置：
	 */
	public void setLogId(Long logId) {
		this.logId = logId;
	}
	/**
	 * 获取：
	 */
	public Long getLogId() {
		return logId;
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
	 * 设置：账户id
	 */
	public void setAcctId(Long acctId) {
		this.acctId = acctId;
	}
	/**
	 * 获取：账户id
	 */
	public Long getAcctId() {
		return acctId;
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
	 * 设置：操作类型:充值(R)/转账(T)/付款(P)等
	 */
	public void setOperType(String operType) {
		this.operType = operType;
	}
	/**
	 * 获取：操作类型:充值(R)/转账(T)/付款(P)等
	 */
	public String getOperType() {
		return operType;
	}
	/**
	 * 设置：记账类型:消纳(0)/发生(1)
	 */
	public void setLoanType(Integer loanType) {
		this.loanType = loanType;
	}
	/**
	 * 获取：记账类型:消纳(0)/发生(1)
	 */
	public Integer getLoanType() {
		return loanType;
	}
	/**
	 * 设置：发生金额
	 */
	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}
	/**
	 * 获取：发生金额
	 */
	public BigDecimal getAmt() {
		return amt;
	}
	/**
	 * 设置：快速记账:+/-金额
	 */
	public void setRapidAmt(BigDecimal rapidAmt) {
		this.rapidAmt = rapidAmt;
	}
	/**
	 * 获取：快速记账:+/-金额
	 */
	public BigDecimal getRapidAmt() {
		return rapidAmt;
	}
	/**
	 * 设置：操作之前余额
	 */
	public void setPreOperAmt(BigDecimal preOperAmt) {
		this.preOperAmt = preOperAmt;
	}
	/**
	 * 获取：操作之前余额
	 */
	public BigDecimal getPreOperAmt() {
		return preOperAmt;
	}
	/**
	 * 设置：关联订单，充值订单等的订单id
	 */
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	/**
	 * 获取：关联订单，充值订单等的订单id
	 */
	public Long getOrderId() {
		return orderId;
	}
	/**
	 * 设置：操作人id
	 */
	public void setOperUserId(Long operUserId) {
		this.operUserId = operUserId;
	}
	/**
	 * 获取：操作人id
	 */
	public Long getOperUserId() {
		return operUserId;
	}
	/**
	 * 设置：操作时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：操作时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
}
