package com.fies.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import com.fies.service.IUserService;

@ManagedBean(name = "userBean")
@SessionScoped
public class UserBean {

	//@ManagedProperty(value = "#{UserService}")
	@Inject
	private IUserService userService;

	public String saveUser() {
		userService.addUser(null);
		return     null;
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

}
