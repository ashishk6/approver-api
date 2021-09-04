package com.vim.test.vo;

import java.io.Serializable;

public class PromotionVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String promotionId;
	private String promotionType;
	private String departmentId;
	private String costPrice;
	private String sellingPrice;
	private String marginLost;
	private String msShare;
	private String supplierShare;
	private String startDate;
	private String endDate;
	private String createdBy;
	private String createdByUserEmailId;
	private String msUser;
	private String msUserEmailId;
	private String supplierUser;
	private String supplierUserEmailId;
	private String status;
	private String isActive;
	private String comment;

	
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getMsUserEmailId() {
		return msUserEmailId;
	}
	public void setMsUserEmailId(String msUserEmailId) {
		this.msUserEmailId = msUserEmailId;
	}
	
	public String getCreatedByUserEmailId() {
		return createdByUserEmailId;
	}
	public void setCreatedByUserEmailId(String createdByUserEmailId) {
		this.createdByUserEmailId = createdByUserEmailId;
	}
	public String getSupplierUserEmailId() {
		return supplierUserEmailId;
	}
	public void setSupplierUserEmailId(String supplierUserEmailId) {
		this.supplierUserEmailId = supplierUserEmailId;
	}
	public String getPromotionId() {
		return promotionId;
	}
	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}
	public String getPromotionType() {
		return promotionType;
	}
	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(String costPrice) {
		this.costPrice = costPrice;
	}
	public String getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(String sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public String getMarginLost() {
		return marginLost;
	}
	public void setMarginLost(String marginLost) {
		this.marginLost = marginLost;
	}
	public String getMsShare() {
		return msShare;
	}
	public void setMsShare(String msShare) {
		this.msShare = msShare;
	}
	public String getSupplierShare() {
		return supplierShare;
	}
	public void setSupplierShare(String supplierShare) {
		this.supplierShare = supplierShare;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getMsUser() {
		return msUser;
	}
	public void setMsUser(String msUser) {
		this.msUser = msUser;
	}
	public String getSupplierUser() {
		return supplierUser;
	}
	public void setSupplierUser(String supplierUser) {
		this.supplierUser = supplierUser;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
