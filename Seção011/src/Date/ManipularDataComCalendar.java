package Date;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;

public class ManipularDataComCalendar {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		Date m = Date.from(Instant.parse("2018-06-25T15:42:07Z"));	
		Date y = Date.from(Instant.parse("2018-06-25T15:42:07Z"));	

		System.out.println( sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();

		cal.setTime(d);
		cal1.setTime(m);
		cal2.setTime(y);
		int minutos = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
//TEM QUE ADD O " 1 + " POIS A CONTAGEM COMECA NO 
		cal.add(Calendar.HOUR_OF_DAY, 4);
		cal1.add(Calendar.DAY_OF_MONTH, 4);
		cal2.add(Calendar.YEAR, 4);

		d = cal.getTime();
		m = cal1.getTime();
		y = cal2.getTime();

		System.out.println(sdf.format(d));
		System.out.println(sdf.format(m));
		System.out.println(sdf.format(y));
		System.out.println();
		System.out.println("Minutes: " + minutos);
		System.out.println("Month: " + month);


	}

}
