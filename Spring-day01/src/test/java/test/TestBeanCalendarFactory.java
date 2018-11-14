package test;


import java.util.Calendar;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.teud.demo.BeanFactory;
public class TestBeanCalendarFactory {
	@Test
	public void TestBeanGetFactory(){
		AbstractApplicationContext ac = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Calendar cl = ac.getBean("calendar",Calendar.class);
		System.out.println(cl.get(Calendar.YEAR));
		ac.close();
		
		
	}
	

}
