
public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hour = 22;
		int minute = 12;
		int second = 10;
		float secondsPerDay;
		float percentOfDay;
		
		System.out.println("The time in seconds since midnight is: " +((hour * 3600) + (minute * 60) + second));
		secondsPerDay = ((60 - second) + ((60 - 1 - minute) * 60) + (24 - 1 - hour)* 3600);
		System.out.println("The time remaining in seconds until midnight is: " + secondsPerDay);
		percentOfDay = ( (secondsPerDay / 86400) * 100 );
		percentOfDay = (100 - percentOfDay);
		System.out.println("Percentage of day that has gone by:" + percentOfDay + "%");
		
	}

}
