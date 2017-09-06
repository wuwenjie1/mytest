package com.itheima.crm.service;

import java.util.List;

import com.itheima.crm.po.BaseDict;

public interface BaseDictService {

	// 根据类型编码，查询数据字典
	List<BaseDict> queryBaseDictByTypeCode(String typeCode);
}
