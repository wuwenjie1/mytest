package com.itheima.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.crm.mapper.CustomerMapper;
import com.itheima.crm.po.Customer;
import com.itheima.crm.po.QueryVo;
import com.itheima.crm.service.CustomerService;
import com.itheima.crm.utils.Page;
@Service
public class CustomerServiceImpl implements CustomerService {

	// 注入客户mapper接口
	@Autowired
	private CustomerMapper customerMapper;
	
	@Override
	public Page<Customer> queryCustomerByCondition(QueryVo queryVo) {
		// 1.计算分页记录起始数
		// 第一页：0，第二页：10，第三页：20......
		int start = (queryVo.getPage()-1)*queryVo.getRows();
		queryVo.setStart(start);
		
		// 2.查询客户列表
		List<Customer> list = this.customerMapper.queryCustomerByCondition(queryVo);
		
		// 3.统计客户记录数
		Integer totals = this.customerMapper.countCustomerByCondition(queryVo);
		
		// 4.创建分页对象
		// public Page(int total, int page, int size, List<T> rows) {
		Page<Customer> page=new Page<Customer>(totals,queryVo.getPage(),queryVo.getRows(),list);
		
		return page;
	}

	@Override
	public Customer queryCustomerById(Long id) {
		
		Customer customer = this.customerMapper.queryCustomerById(id);
		
		return customer;
	}

	@Override
	public void updateCustomerById(Customer customer) {
		this.customerMapper.updateCustomerById(customer);
	}

	@Override
	public void deleteCustomerById(Long id) {
		
		this.customerMapper.deleteCustomerById(id);
		
	}

}
