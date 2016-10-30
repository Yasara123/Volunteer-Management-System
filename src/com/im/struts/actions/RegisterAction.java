package com.im.struts.actions;

public class RegisterAction {
	public String name,email,password,config;
	
	public String execute(){
		System.out.print("name:"+name);
		return "success";
	}
}
