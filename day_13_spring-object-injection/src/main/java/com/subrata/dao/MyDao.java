package com.subrata.dao;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MyDao {
	private String[] arr;
	private List<String> list;
	private Set<String> set;
	private Map<String, String> map;
	private Properties props;
	public String[] getArr() {
		System.out.println("array called");
		return arr;
	}
	public void setArr(String[] arr) {
		this.arr = arr;
	}
	public List<String> getList() {
		System.out.println("list called");
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<String> getSet() {
		System.out.println("set called");
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public Map<String, String> getMap() {
		System.out.println("map called");
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public Properties getProps() {
		System.out.println("properties called");
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}

	
}
