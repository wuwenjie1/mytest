package com.itheima.crm.mapper;

import java.util.List;

import com.itheima.crm.po.BaseDict;

public interface BaseDictMapper {

	// 根据类型编码，查询数据字典
	List<BaseDict> queryBaseDictByTypeCode(String typeCode);
}
