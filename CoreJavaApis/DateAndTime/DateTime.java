import java.time.*;

public class DateTime{
	public static void main(String [] args){
		System.out.println("Local Date is: " + LocalDate.now());
		System.out.println("Local Time is: " + LocalTime.now());
		System.out.println("Local Date and Time is: " + LocalDateTime.now());

		//creation of specific dates and times
		
		LocalDate date1 = LocalDate.of(2020, Month.FEBRUARY, 28);
		LocalDate date2 = LocalDate.of(2021, 2, 28);

		System.out.println(date1 + "\n" + date2);

		LocalTime time1 = LocalTime.of(14, 38);

		System.out.println(time1);

		LocalDate date3 = LocalDate.of(1994, 07, 29);
		System.out.println(date3);

		LocalTime time2 = LocalTime.of(16, 36, 28, 12);
		System.out.println(time2);

		//LocalDateTime cand be combined with date and time parameter variables
		LocalDateTime ldt1 = LocalDateTime.of(date3, time2);
		System.out.println(ldt1);

		//or it can be written on one line
		LocalDateTime ldt2 = LocalDateTime.of(2021, 02, 28, 07, 46, 28, 10000);
		System.out.println(ldt2);

		//LocalDate ld = new LocalDate() DNC <- Constructorii din pachetul time sunt privati
		//LocalTime lt = LocalTime.of(2020, 1, 33); <- DateTimeExceptions

		//Date and Time are immutable -> Need to assign to a ref variable

		time1.plusHours(1); //output 14:38
		System.out.println("immutable time1: " + time1);
		time1 = time1.plusHours(1); //output 15:38
		System.out.println("manipulated time1: " + time1);
		
		ldt1 = ldt1.minusYears(1);
		System.out.println("ldt1 minus 1 year: " + ldt1);
	}
}
