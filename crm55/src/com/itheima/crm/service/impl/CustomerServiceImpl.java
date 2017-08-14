package com.itheima.crm.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.crm.dao.CustomerDao;
import com.itheima.crm.pojo.Customer;
import com.itheima.crm.pojo.QueryVo;
import com.itheima.crm.service.CustomerService;
import com.itheima.crm.utils.Page;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public Page<Customer> findCustomerByQueryVo(QueryVo vo) {
		Page<Customer> page = new Page<Customer>();
		
/*		page.setSize(8);
		vo.setSize(8);
		if( vo.getPage() == null){
			page.setPage(1);
			vo.setPage(1);
		}else{
			page.setPage(vo.getPage());
		}*/
		page.setSize(vo.getSize());
		page.setPage(vo.getPage());
		
		if(vo != null){
			if(StringUtils.isNotBlank(vo.getCustName())){
				vo.setCustName(vo.getCustName().trim());
			}
		}
		Integer count = customerDao.findCount(vo);
		List<Customer> rows = customerDao.findCustomerByQueryVo(vo);
		page.setTotal(count);
		page.setRows(rows);
		return page;
	}

	@Override
	public Customer findCustomerById(Integer id) {
		// TODO Auto-generated method stub
		return customerDao.findCustomerById(id);
	}

	@Override
	public void update(Customer customer) {
		
		customerDao.update(customer);
	}

	@Override
	public void delete(Integer id) {
		
		customerDao.delete(id);
	}

}
