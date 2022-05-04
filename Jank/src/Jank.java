
public class Jank {

	public static void main(String[] args) {

		int y = 0;
		int x = 0;
		int z = (x == 0) && (y == 2) ? x + y : 3;

		// if(x == 0)
		// z = 3;
		y = 4;

		System.out.println(z);
		// System.out.println(y);

		printMessage(Day.SUNDAY);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
	}

	public enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	public static void printMessage(Day day) {
		switch (day) {
		case MONDAY:
			System.out.println("Lousy day");
			break;

		case FRIDAY:
			System.out.println("Great day");
			break;
		case SUNDAY: case SATURDAY:
			System.out.println("Weekends are best");
			break;

		default:
			System.out.println("Regular day");
			break;
		}
	}

}
