package com.itheima.crm.utils;

import java.util.List;

public class Page<T> {
	//添加两行注释玩一下
	//这是第二行
	
	//我是注释
    
	private int total;
	private int page;
	private int size;
    private List<T> rows;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
    
	
    
}
