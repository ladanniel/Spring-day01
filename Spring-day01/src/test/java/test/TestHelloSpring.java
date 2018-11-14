package test;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.teud.demo.HelloSpring;
public class TestHelloSpring {
	//从容器中获取bean对象
	@Test
	public void testGetBean(){
		//1、初始化容器对象（获取容器对象）
		//AbstractApplicationContext类中定义了close方法，关闭容器
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2、获取bean对象
		HelloSpring hs = ac.getBean("hello", HelloSpring.class);
		//或者：HelloSpring hs = (HelloSpring)ac.getBean("hello"); 通过java反射得到id="hello"
		//3、调用方法
		hs.sayHello();
		//关闭容器
		ac.close();
	}

}
