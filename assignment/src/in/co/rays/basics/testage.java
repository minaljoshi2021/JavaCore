package in.co.rays.basics;

import java.util.Calendar;
import java.util.Date;

public class testage {
	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		
		for(int i=0;i<=12;i++) {
			c.add(Calendar.DATE,30);
		System.out.println(c.getTime());
		}
}
}
