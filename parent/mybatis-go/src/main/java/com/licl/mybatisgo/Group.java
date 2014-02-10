package com.licl.mybatisgo;


import java.util.List;

import org.apache.ibatis.type.Alias;

@Alias("group")
public class Group {

	private String groupname;

	private Integer groupid;
	
	private List<User> user;
	
	private GroupDetail detail;

	@Override
	public String toString() {
		return "Group [groupname=" + groupname + ", groupid=" + groupid
				+ ", user=" + user + ", detail=" + detail + "]";
	}

	public String getGroupname() {
		return groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public Integer getGroupid() {
		return groupid;
	}

	public void setGroupid(Integer groupid) {
		this.groupid = groupid;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public GroupDetail getDetail() {
		return detail;
	}

	public void setDetail(GroupDetail detail) {
		this.detail = detail;
	}
}
