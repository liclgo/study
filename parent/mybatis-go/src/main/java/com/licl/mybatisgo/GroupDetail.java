package com.licl.mybatisgo;

import org.apache.ibatis.type.Alias;

@Alias("groupdetail")
public class GroupDetail {

	private Integer groupid;

	@Override
	public String toString() {
		return "GroupDetail [groupid=" + groupid + ", detail=" + detail + "]";
	}

	private String detail;

	public Integer getGroupid() {
		return groupid;
	}

	public void setGroupid(Integer groupid) {
		this.groupid = groupid;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
}
