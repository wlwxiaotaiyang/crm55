package com.itheima.crm.service;

import com.itheima.crm.pojo.Customer;
import com.itheima.crm.pojo.QueryVo;
import com.itheima.crm.utils.Page;

public interface CustomerService {

	public Page<Customer> findCustomerByQueryVo(QueryVo vo);

	public Customer findCustomerById(Integer id);

	public void update(Customer customer);

	public void delete(Integer id);

}
