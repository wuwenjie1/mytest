package com.itheima.crm.po;

public class Customer {

	  private String cust_id; //BIGINT(32) NOT NULL AUTO_INCREMENT COMMENT '客户编号(主键)',
	  private String cust_name; //VARCHAR(32) NOT NULL COMMENT '客户名称(公司名称)',
	  private String cust_user_id; //BIGINT(32) DEFAULT NULL COMMENT '负责人id',
	  private String cust_create_id; //BIGINT(32) DEFAULT NULL COMMENT '创建人id',
	  private String cust_source; //VARCHAR(32) DEFAULT NULL COMMENT '客户信息来源',
	  private String cust_industry; //VARCHAR(32) DEFAULT NULL COMMENT '客户所属行业',
	  private String cust_level; //VARCHAR(32) DEFAULT NULL COMMENT '客户级别',
	  private String cust_linkman; //VARCHAR(64) DEFAULT NULL COMMENT '联系人',
	  private String cust_phone; //VARCHAR(64) DEFAULT NULL COMMENT '固定电话',
	  private String cust_mobile; //VARCHAR(16) DEFAULT NULL COMMENT '移动电话',
	  private String cust_zipcode; //VARCHAR(10) DEFAULT NULL,
	  private String cust_address; //VARCHAR(100) DEFAULT NULL,
	  private String cust_createtime; //DATETIME DEFAULT NULL COMMENT '创建时间',
	  
	  
	public String getCust_id() {
		return cust_id;
	}
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCust_user_id() {
		return cust_user_id;
	}
	public void setCust_user_id(String cust_user_id) {
		this.cust_user_id = cust_user_id;
	}
	public String getCust_create_id() {
		return cust_create_id;
	}
	public void setCust_create_id(String cust_create_id) {
		this.cust_create_id = cust_create_id;
	}
	public String getCust_source() {
		return cust_source;
	}
	public void setCust_source(String cust_source) {
		this.cust_source = cust_source;
	}
	public String getCust_industry() {
		return cust_industry;
	}
	public void setCust_industry(String cust_industry) {
		this.cust_industry = cust_industry;
	}
	public String getCust_level() {
		return cust_level;
	}
	public void setCust_level(String cust_level) {
		this.cust_level = cust_level;
	}
	public String getCust_linkman() {
		return cust_linkman;
	}
	public void setCust_linkman(String cust_linkman) {
		this.cust_linkman = cust_linkman;
	}
	public String getCust_phone() {
		return cust_phone;
	}
	public void setCust_phone(String cust_phone) {
		this.cust_phone = cust_phone;
	}
	public String getCust_mobile() {
		return cust_mobile;
	}
	public void setCust_mobile(String cust_mobile) {
		this.cust_mobile = cust_mobile;
	}
	public String getCust_zipcode() {
		return cust_zipcode;
	}
	public void setCust_zipcode(String cust_zipcode) {
		this.cust_zipcode = cust_zipcode;
	}
	public String getCust_address() {
		return cust_address;
	}
	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}
	public String getCust_createtime() {
		return cust_createtime;
	}
	public void setCust_createtime(String cust_createtime) {
		this.cust_createtime = cust_createtime;
	}
	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", cust_name=" + cust_name + ", cust_user_id=" + cust_user_id
				+ ", cust_create_id=" + cust_create_id + ", cust_source=" + cust_source + ", cust_industry="
				+ cust_industry + ", cust_level=" + cust_level + ", cust_linkman=" + cust_linkman + ", cust_phone="
				+ cust_phone + ", cust_mobile=" + cust_mobile + ", cust_zipcode=" + cust_zipcode + ", cust_address="
				+ cust_address + ", cust_createtime=" + cust_createtime + "]";
	}
	  
}
