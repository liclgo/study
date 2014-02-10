package com.licl.mybatisgo;

import org.apache.ibatis.type.Alias;

@Alias("user")
public class User {

	private Integer userid;

	private String username;

	public Integer getUserid() {
		return userid;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + "]";
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
