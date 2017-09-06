package com.itheima.crm.service;

import com.itheima.crm.po.Customer;
import com.itheima.crm.po.QueryVo;
import com.itheima.crm.utils.Page;

public interface CustomerService {

	// 分页查询客户信息
	Page<Customer> queryCustomerByCondition(QueryVo queryVo);
	
	// 根据客户Id查询客户信息
	Customer queryCustomerById(Long id);
	
	// 根据客户Id修改客户信息
	void updateCustomerById(Customer customer);
	
	// 根据客户I的删除客户信息
	void deleteCustomerById(Long id);
}
