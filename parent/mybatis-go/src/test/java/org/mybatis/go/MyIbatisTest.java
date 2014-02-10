package org.mybatis.go;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.licl.mybatisgo.Group;
import com.licl.mybatisgo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:mybatis-go.xml" })
@TransactionConfiguration(defaultRollback = false)
@Transactional
public class MyIbatisTest {

	public final String s = "com.clli.mybatis.User.";
	public final String s2 = "com.clli.mybatis.Group.";
	@Autowired
	SqlSession sql;

	@Test
	public void saveuser() {
		User user = new User();
		user.setUsername("abc");
		sql.insert(s + "insertuser", user);
		Map map = new HashMap();
		map.put("userid", user.getUserid());
		map.put("groupId", 1);
		sql.insert(s + "insertgroup", map);
	}

	@Test
	public void findgroup() {
		List<Group> list = sql.selectList(s2 + "findAllGroup");
		System.out.println(list);
	}

}
