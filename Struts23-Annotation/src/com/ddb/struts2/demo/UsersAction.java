package com.ddb.struts2.demo;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsersAction extends ActionSupport{
	 private static final long serialVersionUID=5039134787852719761L;
	 private String username;
	 private String password;
	 
	 @Action(value="/users",results={@Result(name="success",location="/results/success.jsp")})
	 public String execute(){
		 return SUCCESS;
	 }
 
}
