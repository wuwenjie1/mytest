package com.itheima.crm.mapper;

import java.util.List;

import com.itheima.crm.po.Customer;
import com.itheima.crm.po.QueryVo;

public interface CustomerMapper {

	//综合查询客户列表
	List<Customer> queryCustomerByCondition(QueryVo queryVo);
	
	//综合统计客户记录
	Integer countCustomerByCondition(QueryVo queryVo);
	
	// 根据客户Id查询客户信息
	Customer queryCustomerById(Long id);
	
	// 根据客户Id修改客户信息
	void updateCustomerById(Customer customer);
	
	// 根据客户I的删除客户信息
	void deleteCustomerById(Long id);
}
