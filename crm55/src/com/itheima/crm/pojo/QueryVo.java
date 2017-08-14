package com.itheima.crm.pojo;

public class QueryVo {
	
	private String custIndustry;
	
	private String custLevel;
	
	private String custName;	
	
	private String custSource;
	
	private Integer page;
	
	private Integer start;
	
	private Integer size = 8;
	
	public Integer getPage() {
		if(page == null){
			return 1;
		}else{
			return page;
		}
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getStart() {
		return start = (getPage()-1)*size;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public String getCustIndustry() {
		return custIndustry;
	}
	public void setCustIndustry(String custIndustry) {
		this.custIndustry = custIndustry;
	}
	public String getCustLevel() {
		return custLevel;
	}
	public void setCustLevel(String custLevel) {
		this.custLevel = custLevel;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustSource() {
		return custSource;
	}
	public void setCustSource(String custSource) {
		this.custSource = custSource;
	}

}
