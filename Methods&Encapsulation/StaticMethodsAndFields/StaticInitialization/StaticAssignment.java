public class StaticAssignment{
	private static final int NUM_SECONDS_PER_HOUR;

	static{
		int numSecondsPerMinute = 60;
		int numMinutesPerHour = 60;
		NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
	}
}
