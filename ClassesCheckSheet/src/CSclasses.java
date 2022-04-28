import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CSclasses {

	public static void main(String[] args) throws IOException {
		InPersonCourse myCourse = new InPersonCourse("", 0, 0, 0, "");

		/*
		 * System.out.println("Input 1 for In Person Course");
		 * System.out.println("Input 2 for Full Remote Course");
		 * System.out.println("Input 3 for Real Time Remote Course");
		 */

		ArrayList<Course> courseList = new ArrayList<Course>();

		InPersonCourse inPersonCourse1 = new InPersonCourse("PHY160", 15, 25, 3, "BP119");
		InPersonCourse inPersonCourse2 = new InPersonCourse("ECO120", 19, 25, 3, "RP140");
		FullRemoteCourse fullRemoteCourse1 = new FullRemoteCourse("CSC119", 10, 20, 4, "User@Gmail.com");
		FullRemoteCourse fullRemoteCourse2 = new FullRemoteCourse("ENG101", 12, 30, 5, "User@Gmail.com");
		RealTimeRemoteCourse realTimeRemoteCourse1 = new RealTimeRemoteCourse("MAT160", 10, 20, 5, "Link");
		RealTimeRemoteCourse realTimeRemoteCourse2 = new RealTimeRemoteCourse("CHE110", 14, 30, 5, "Link");

		courseList.add(inPersonCourse1);
		courseList.add(inPersonCourse2);
		courseList.add(fullRemoteCourse1);
		courseList.add(fullRemoteCourse2);
		courseList.add(realTimeRemoteCourse1);
		courseList.add(realTimeRemoteCourse2);

		File myFile = new File("Classes.txt");
		if (!myFile.exists()) {
			myFile.createNewFile();
		}
		PrintWriter printer = new PrintWriter(new FileOutputStream(myFile.getName(), false));
		for (Course course : courseList) {
			printFile(course, printer);
			if (printer.checkError()) {
				System.out.println("There were errors when writing");
			}
		}
		printer.close();

		File readFile = null;
		Scanner input = null;
		
		ArrayList<Course> courseRead = new ArrayList<Course>();
		
		

	
			readFile = new File("Classes.txt");
			input = new Scanner(readFile);
			while (input.hasNextLine()) {
				String line = input.nextLine();
				Course course = null;
				System.out.println(line);

				String[] numStr = line.split(", ");
				
				
				
			if (numStr[0].equals("InPersonCourse")) {
				course = new InPersonCourse(numStr[1], Integer.parseInt(numStr[2]),
						Integer.parseInt(numStr[3]), Integer.parseInt(numStr[4]), numStr[5]);
			}
			if(numStr[0].equals("FullRemoteCourse")) {
				course = new FullRemoteCourse(numStr[1], Integer.parseInt(numStr[2]),
						Integer.parseInt(numStr[3]), Integer.parseInt(numStr[4]), numStr[5] );
			}
			if(numStr[0].equals("RealTimeRemoteCourse")) {
				course = new RealTimeRemoteCourse(numStr[1], Integer.parseInt(numStr[2]),
						Integer.parseInt(numStr[3]), Integer.parseInt(numStr[4]), numStr[5] );
			}
				courseRead.add(course);
			
			}
			for(Course course : courseRead) {
				printCourse(course);
			}

		input.close();
		
		

	}

	/*
	 * Scanner in = new Scanner(System.in); int userNumber; userNumber =
	 * in.nextInt();
	 * 
	 * if (userNumber == 1) { printInPersonCourse(myCourse); } else if (userNumber
	 * == 2) { printFullRemote(myCourse); } else if (userNumber == 3) {
	 * printRealTimeRemote(myCourse); } else {
	 * System.out.println("Please input a valid number. "); } }
	 */

	/*
	 * public static void printFile() throws IOException { File myFile = new
	 * File("fileWriteTest.txt"); if(!myFile.exists()) { myFile.createNewFile(); }
	 * 
	 * for(Course course : courseList) { printCourse(course); } }
	 */

	public static void printFile(Course myCourse, PrintWriter printer) throws IOException {

		printer.print(myCourse.getClass().getName() + ", " + myCourse.getCourseNumber() + ", "
				+ myCourse.getNumStudents() + ", " + myCourse.getMaxStudents() + ", " + myCourse.getCredits());

		if (myCourse instanceof InPersonCourse) {
			printer.print(", " + ((InPersonCourse) myCourse).getRoomNumber() + "\n");
		}
		if (myCourse instanceof FullRemoteCourse) {
			printer.print(", " + ((FullRemoteCourse) myCourse).getEmail() + "\n");
		}
		if (myCourse instanceof RealTimeRemoteCourse) {
			printer.print(", " + ((RealTimeRemoteCourse) myCourse).getZoom() + "\n");
		}

	}

	
	  public static void printCourse(Course myCourse){
	  System.out.println("Course Number:" + myCourse.getCourseNumber() +
	  " Number of Students:" + myCourse.getNumStudents() +
	  " Max Number of Students:" + myCourse.getMaxStudents() + " Credits:" +
	  myCourse.getCredits());
	  
	  if(myCourse instanceof InPersonCourse) { System.out.println("Room Number: " +
	  ((InPersonCourse)myCourse).getRoomNumber()); } if(myCourse instanceof
	  FullRemoteCourse) { System.out.println("Email: " +
	  ((FullRemoteCourse)myCourse).getEmail()); } if(myCourse instanceof
	  RealTimeRemoteCourse) { System.out.println("Zoom: " +
	  ((RealTimeRemoteCourse)myCourse).getZoom()); } }
	  
	  
	  
	  public static void printInPersonCourse(Course myCourse) { InPersonCourse
	  myCourse1 = new InPersonCourse("CSC119", 10, 20, 4, "BP119");
	  System.out.println(myCourse1.toString()); }
	  
	  public static void printFullRemote(Course myCourse) { FullRemoteCourse
	  myCourse1 = new FullRemoteCourse("MAT160", 15, 35, 5, "User@Gmail.com");
	  System.out.println(myCourse1.toString()); }
	  
	  public static void printRealTimeRemote(Course myCourse) {
	  RealTimeRemoteCourse myCourse1 = new RealTimeRemoteCourse("PHY160", 12, 25,
	  3, "Link"); System.out.println(myCourse1.toString()); }
	 

}
