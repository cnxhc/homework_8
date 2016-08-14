package com.xhc.spring;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class JsonOutputHelper implements IOutputHelper {
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	/**
	 * 实现json格式输出
	 */
	@Override
	public String printMessage() {
		Gson gson=new Gson();
		String json=gson.toJson(employee);
		return json.toString();
	}

}
