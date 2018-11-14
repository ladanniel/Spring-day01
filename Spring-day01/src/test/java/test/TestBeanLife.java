package test;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.teud.demo.BeanLife;
public class TestBeanLife {
	
	//测试bean的生命周期、
	@Test
	public void testBeanLife(){
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		BeanLife beanLife = ac.getBean("beanLife",BeanLife.class);
		ac.close();
		beanLife.Destroy();
		
	}
	

}
