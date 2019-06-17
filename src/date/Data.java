package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		
		Date x1 = new Date();
		
		Date y1 = sdf1.parse("16/03/2000");
		
		Date y2 = sdf2.parse("16/03/2000 15:45:07");
		
		
		System.out.println("Data atual: "+ x1);
		
		System.out.println("-------------------------");
		
		System.out.println("Data: "+y1);
		
		System.out.println("Data: "+ y2);
		
		
		System.out.println("-------------------------");
		
		System.out.println("Data: "+sdf1.format(y1));
		
		System.out.println("Data: "+ sdf2.format(y2));


	}

}
