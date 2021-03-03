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


		//getting specific timeframes

		LocalDateTime ldt2 = LocalDateTime.of(2021, Month.JULY, 29, 4, 4, 5);
		System.out.println(ldt2.getYear());
		System.out.println(ldt2.getDayOfWeek());
		System.out.println(ldt2.getHour());
		System.out.println(ldt2.getMinute());
		System.out.println(ldt2.getSecond());


		//formatting date
		System.out.println(ldt2.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(ldt2.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(ldt2.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

		//custom formatting

		DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(ldt2.format(f1));
		DateTimeFormatter f2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		System.out.println(ldt2.format(f2));
		DateTimeFormatter f3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(ldt2.format(f3));

		DateTimeFormatter f4 = DateTimeFormatter.ofPattern("dd/mm/yyyy, HH:mm");
		System.out.println(ldt2.format(f4));


		//parsing

		DateTimeFormatter f5 = DateTimeFormatter.ofPattern("dd/mm/yy hh:mm");
		System.out.println(ldt2.format(f5));
	}
}
