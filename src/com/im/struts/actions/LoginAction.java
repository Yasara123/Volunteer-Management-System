package com.im.struts.actions;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	public String email,password;

	public String execute(){
		if(email.equals("abc@")&&password.equals("123")){
			return "success";
		}else{
			return "error";
		}
		
	}
@Override
public void validate(){
	if((email==null)||!(email.contains("@"))){
		addFieldError("email", "Email is not valid");
	}else{
		if(password==null){
			addFieldError("password", "Password must fill");
		}
	}
}

}
