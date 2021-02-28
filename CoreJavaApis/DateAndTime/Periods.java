import java.time.*;

public class Periods{
	public static void main(String [] args){
		Period p1 = Period.ofYears(2);
		LocalDate ld1 = LocalDate.of(2020, 02, 01);
		ld1 = ld1.plus(p1);
		System.out.println(ld1);

		//Period cannot be chained. Only last method is taken into account

		Period p2 = Period.ofYears(2).ofMonths(4);
		ld1 = ld1.plus(p2);
		System.out.println(ld1);

		LocalTime t1 = LocalTime.of(8, 13);
		try{
			t1 = t1.plus(p2); 
			System.out.println(t1);
		}catch(Exception e){
			System.out.println("Period can't be used with time");
			System.out.println("UnsupportedTemporalTypeException");
		}
	}
}
