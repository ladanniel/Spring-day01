package test;



import java.util.Calendar;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class TestCalendar {
	//��̬������ʼ����ʵ������
	@Test
	public void testGetCalendar(){
		AbstractApplicationContext aac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Calendar c = aac.getBean("cls",Calendar.class);
//        c.Calendar();
       
        //��̬��������
        Calendar d = aac.getBean("cl",Calendar.class);
        
        System.out.println(d.get(Calendar.YEAR)+":"+(d.get(Calendar.MONTH)+1)+":"+d.get(Calendar.DAY_OF_MONTH));
        aac.close();
	}

}
