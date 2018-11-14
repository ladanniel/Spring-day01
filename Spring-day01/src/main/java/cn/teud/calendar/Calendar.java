package cn.teud.calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Calendar {
	public void Calendar(){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(date));
		
	}

}
