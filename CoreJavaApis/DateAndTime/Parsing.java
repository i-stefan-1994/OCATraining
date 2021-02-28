import java.time.format.*;
import java.time.*;

public class Parsing{
	public static void main(String [] args){
		

		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//parsing can take a formatter
		LocalDate ld = LocalDate.parse("29/07/1994", dtf1);
		System.out.println(ld);

	}
}
