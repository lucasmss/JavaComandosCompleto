package curso;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {

	public static void main(String[] args) throws ParseException {
	

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comments c1 = new Comments("Have a nice trip");
		
		Comments c2 = new Comments("The amazing");
		
		Post p1 = new Post(sdf.parse("21/03/2019 12:04:55"), "Traveling to Cannada", "I am going to visit the country", 12);
		
		
		p1.addComments(c1);
		p1.addComments(c2);
		
		System.out.println(p1);
		
	}

}
