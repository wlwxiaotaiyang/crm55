package com.itheima.crm.dao;

import java.util.List;

import com.itheima.crm.pojo.Customer;
import com.itheima.crm.pojo.QueryVo;

public interface CustomerDao {

	public Integer findCount(QueryVo vo);

	public List<Customer> findCustomerByQueryVo(QueryVo vo);

	public Customer findCustomerById(Integer id);

	public void update(Customer customer);

	public void delete(Integer id);

}
