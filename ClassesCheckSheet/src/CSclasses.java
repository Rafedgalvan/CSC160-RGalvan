import java.util.ArrayList;
import java.util.Scanner;

public class CSclasses {

	public static void main(String[] args) {
		InPersonCourse myCourse = new InPersonCourse("", 0, 0, 0, "");

		/*System.out.println("Input 1 for In Person Course");
		System.out.println("Input 2 for Full Remote Course");
		System.out.println("Input 3 for Real Time Remote Course");*/

		ArrayList<Course> courseList = new ArrayList<Course>();

		FullRemoteCourse fullRemoteCourse = new FullRemoteCourse("CSC119", 10, 20, 4, "User@Gmail.com");
		RealTimeRemoteCourse realTimeRemoteCourse = new RealTimeRemoteCourse("MAT160", 10, 20, 5, "Link");
		InPersonCourse inPersonCourse = new InPersonCourse("PHY160", 15, 25, 3,  "BP119");

		courseList.add(fullRemoteCourse);
		courseList.add(inPersonCourse);
		courseList.add(realTimeRemoteCourse);
		

		for(Course course : courseList) {
			printCourse(course);
		}

		Scanner in = new Scanner(System.in);
		int userNumber;
		userNumber = in.nextInt();

		if (userNumber == 1) {
			printInPersonCourse(myCourse);
		} else if (userNumber == 2) {
			printFullRemote(myCourse);
		} else if (userNumber == 3) {
			printRealTimeRemote(myCourse);
		} else {
			System.out.println("Please input a valid number. ");
		}
	}
	 
	public static void printCourse(Course myCourse){
		System.out.println("Course Number:" + myCourse.getCourseNumber() + 
		" Number of Students:" + myCourse.getNumStudents() + " Max Number of Students:" + myCourse.getMaxStudents() + " Credits:" + myCourse.getCredits());
		
		if(myCourse instanceof InPersonCourse) {
			System.out.println("Room Number: " + ((InPersonCourse)myCourse).getRoomNumber());
		}
		if(myCourse instanceof FullRemoteCourse) {
			System.out.println("Email: " + ((FullRemoteCourse)myCourse).getEmail());
		}
		if(myCourse instanceof RealTimeRemoteCourse) {
			System.out.println("Zoom: " + ((RealTimeRemoteCourse)myCourse).getZoom());
		}
	}

	
	
	public static void printInPersonCourse(Course myCourse) {
		InPersonCourse myCourse1 = new InPersonCourse("CSC119", 10, 20, 4, "BP119");
		System.out.println(myCourse1.toString());
	}

	public static void printFullRemote(Course myCourse) {
		FullRemoteCourse myCourse1 = new FullRemoteCourse("MAT160", 15, 35, 5, "User@Gmail.com");
		System.out.println(myCourse1.toString());
	}

	public static void printRealTimeRemote(Course myCourse) {
		RealTimeRemoteCourse myCourse1 = new RealTimeRemoteCourse("PHY160", 12, 25, 3, "Link");
		System.out.println(myCourse1.toString());
	}

}
