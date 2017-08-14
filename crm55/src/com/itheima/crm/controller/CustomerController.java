package com.itheima.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.crm.pojo.BaseDict;
import com.itheima.crm.pojo.Customer;
import com.itheima.crm.pojo.QueryVo;
import com.itheima.crm.service.BaseDictService;
import com.itheima.crm.service.CustomerService;
import com.itheima.crm.utils.Page;

@Controller
public class CustomerController {
	
	@Autowired
	private BaseDictService baseDiceService;
	
	@Autowired
	private CustomerService customerService;
	
	@Value(value="${crm.fromType}")
	private String ft;
	
	@Value(value="${crm.levelType}")
	private String lt;
	
	@Value(value="${crm.industryType}")
	private String it;
	
	@RequestMapping(value="/customer/list.action")
	public String list(Model model,QueryVo vo){
		List<BaseDict> fromType = baseDiceService.findBaseDictByTypeCode(ft);
		List<BaseDict> levelType = baseDiceService.findBaseDictByTypeCode(lt);
		List<BaseDict> industryType = baseDiceService.findBaseDictByTypeCode(it);
		Page<Customer> page = customerService.findCustomerByQueryVo(vo);
		
		model.addAttribute("fromType", fromType);
		model.addAttribute("levelType", levelType);
		model.addAttribute("industryType", industryType);
		
		model.addAttribute("custIndustry", vo.getCustIndustry());
		model.addAttribute("custLevel", vo.getCustLevel());
		model.addAttribute("custName", vo.getCustName());
		model.addAttribute("custSource", vo.getCustSource());
		
		model.addAttribute("page", page);
		
		return "customer";
	}
	
	@RequestMapping(value="/customer/edit.action")
	public @ResponseBody Customer edit(Integer id){
		Customer customer = customerService.findCustomerById(id);
		return customer;
	}

	@RequestMapping(value="/customer/update.action")
	public @ResponseBody 
	String update(Customer customer){
		customerService.update(customer);
		return "OK";
	}
	
	@RequestMapping(value="/customer/delete.action")
	public @ResponseBody
	String delete(Integer id){
		customerService.delete(id);
		return "OK";
	}
}
