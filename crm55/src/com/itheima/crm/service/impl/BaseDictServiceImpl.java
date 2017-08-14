package com.itheima.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.crm.dao.BaseDictDao;
import com.itheima.crm.pojo.BaseDict;
import com.itheima.crm.service.BaseDictService;

@Service
public class BaseDictServiceImpl implements BaseDictService {

	@Autowired
	private BaseDictDao baseDictDao;
	
	@Override
	public List<BaseDict> findBaseDictByTypeCode(String dictTypeCode) {
		
		return baseDictDao.findBaseDictByTypeCode(dictTypeCode);
	}

}
