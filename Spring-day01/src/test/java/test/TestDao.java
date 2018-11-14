package test;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.teud.dao.UserDAO;

public class TestDao {
	@Test
	public void TestUserDAO(){
	AbstractApplicationContext aac = new ClassPathXmlApplicationContext("applicationContext.xml");
	UserDAO ud = aac.getBean("userdao",UserDAO.class);
	ud.login();
	aac.close();
	}

}
