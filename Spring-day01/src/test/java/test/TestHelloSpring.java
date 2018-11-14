package test;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.teud.demo.HelloSpring;
public class TestHelloSpring {
	//�������л�ȡbean����
	@Test
	public void testGetBean(){
		//1����ʼ���������󣨻�ȡ��������
		//AbstractApplicationContext���ж�����close�������ر�����
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2����ȡbean����
		HelloSpring hs = ac.getBean("hello", HelloSpring.class);
		//���ߣ�HelloSpring hs = (HelloSpring)ac.getBean("hello"); ͨ��java����õ�id="hello"
		//3�����÷���
		hs.sayHello();
		//�ر�����
		ac.close();
	}

}
