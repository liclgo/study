package com.licl.mybatisgo;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class UserService implements UserBo {

	public final String s = "com.clli.mybatis.User.";

	@Autowired
	SqlSession sql;

	public void saveuser() {
		User user = new User();
		user.setUsername("aadsf");
		sql.insert(s + "insertgroup", user);
		sql.insert(s + "insertuser", user);
		System.out.println(user.getUserid());
	}


}
