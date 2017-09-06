package com.itheima.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.crm.po.BaseDict;
import com.itheima.crm.po.Customer;
import com.itheima.crm.po.QueryVo;
import com.itheima.crm.service.BaseDictService;
import com.itheima.crm.service.CustomerService;
import com.itheima.crm.utils.Page;

@Controller
@RequestMapping("cust")
public class CustomerController {
	
	// 注入数据字典service
	@Autowired
	private BaseDictService baseDictService;
	
	// 3.查询客户列表
	@Autowired
	private CustomerService customerService;

	//${pageContext.request.contextPath }/cust/list
	@RequestMapping("list")
	public String list(Model model,QueryVo queryVo){
		// 1.综合查询条件初始化
//		客户来源：fromType：002
		List<BaseDict> fromType = this.baseDictService.queryBaseDictByTypeCode("002");
		
//		客户所属行业：industryType：001 
		List<BaseDict> industryType = this.baseDictService.queryBaseDictByTypeCode("001");
		
//		客户级别：levelType：006
		List<BaseDict> levelType = this.baseDictService.queryBaseDictByTypeCode("006");
		
		// 2.设置响应综合查询条件的模型数据
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);
		
		// 3.查询客户列表
		Page<Customer> page=this.customerService.queryCustomerByCondition(queryVo);
		
		// 4.设置客户列表的模型数据
		model.addAttribute("page", page);
		
		// 5.综合查询条件回显
		model.addAttribute("custName", queryVo.getCustName());
		model.addAttribute("custSource", queryVo.getCustSource());
		model.addAttribute("custIndustry", queryVo.getCustIndustry());
		model.addAttribute("custLevel", queryVo.getCustLevel());
		
		return "customer";
	}
	
	// url:"<%=basePath%>cust/edit"
	// 根据客户Id查询客户信息
	@RequestMapping("edit")
	@ResponseBody
	public Customer edit(Long id){
		
		// 1.根据客户Id查询客户
		Customer customer = this.customerService.queryCustomerById(id);
		
		return customer;
		
	}
	
	// $.post("<%=basePath%>cust/update",
	// 保存客户信息
	@RequestMapping("update")
	@ResponseBody
	public void update(Customer customer){
		// 1.保存客户信息
		this.customerService.updateCustomerById(customer);
	}

	// $.post("<%=basePath%>cust/delcust",
	// 删除客户信息
	@RequestMapping("delcust")
	@ResponseBody
	public void deleteCustomerById(Long id){
		//1.删除客户信息
		this.customerService.deleteCustomerById(id);
	}
}
