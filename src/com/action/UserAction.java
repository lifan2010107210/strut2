package com.action;

import org.apache.struts2.ServletActionContext;

public class UserAction {

	private String username;
	private String userpwd;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String login() {

		if ("dhc".equals(username) && "123".equals(userpwd)) {
			// 往控制台打印一条语句
			System.out.println("登录成功");
			// 通过耦合的方式获取HttpSession，然后设置(将用户民设置到session范围中)
			ServletActionContext.getRequest().getSession().setAttribute("username", username);
			// 返回普通的字符串
			return "success";
		} else {
			// 往控制台打印一条语句
			System.out.println("登录失败");
			// 返回普通的字符串
			return "error";
		}

	}

}
