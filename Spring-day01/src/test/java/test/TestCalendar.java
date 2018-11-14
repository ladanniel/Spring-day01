package test;



import java.util.Calendar;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class TestCalendar {
	//静态方法初始化并实例对象
	@Test
	public void testGetCalendar(){
		AbstractApplicationContext aac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Calendar c = aac.getBean("cls",Calendar.class);
//        c.Calendar();
       
        //静态工厂方法
        Calendar d = aac.getBean("cl",Calendar.class);
        
        System.out.println(d.get(Calendar.YEAR)+":"+(d.get(Calendar.MONTH)+1)+":"+d.get(Calendar.DAY_OF_MONTH));
        aac.close();
	}

}
