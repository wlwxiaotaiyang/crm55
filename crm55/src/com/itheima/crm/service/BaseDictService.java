package com.itheima.crm.service;

import java.util.List;

import com.itheima.crm.pojo.BaseDict;

/**
 * 字典表业务层接口
 * @author WANGWEIHONG
 *
 */
public interface BaseDictService {

	public List<BaseDict> findBaseDictByTypeCode(String dictTypeCode);

}
