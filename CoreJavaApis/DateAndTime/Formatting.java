import java.time.*;
import java.time.format.*;

public class Formatting{
	public static void main(String [] args){
		
		LocalDate ld = LocalDate.of(2021,02,28);
		System.out.println(ld.getMonth());
		System.out.println(ld.getDayOfWeek());
		System.out.println(ld.getYear());
		System.out.println(ld.getDayOfYear());

		//printing out formated time
		System.out.println(ld.format(DateTimeFormatter.ISO_LOCAL_DATE));

		LocalTime lt = LocalTime.of(9, 10);
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		System.out.println(ldt);

		System.out.println(ldt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		//custom formats

		//ofLocalizedDate/Time() + FormatStyle.SHORT/MEDIUM - does not work with
		//unsupported date/time formats. Ex formatted date does not work on time and so on
		DateTimeFormatter ldt1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(ldt1.format(ldt));

		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(lt.format(dtf));

		//creating your own format = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm")

		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/mm/yy hh:mm");
		System.out.println(ldt.format(dtf2));

	}
}
