
public class CourseTest {

	public static void main(String[] args) {
		Course myCourse = new Course();
		System.out.println(myCourse);
		
		Course myCourse2 = new Course("CSC160" );
		myCourse2.setNumberOfCredits(4);
		myCourse2.setMaxStudents(10);
		myCourse2.setActualStudents(9);
		System.out.println(myCourse2);
		
		Course myCourse3 = new Course("CSC161", 5);
		myCourse3.setMaxStudents(10);
		myCourse3.setActualStudents(7);
		System.out.println(myCourse3);
		
		Course myCourse4 = new Course("CSC162", 6, 10 , 8);
		System.out.println(myCourse4);
		
		Course[] myCourseArr = new Course[4];
		myCourseArr[0] = myCourse;
		myCourseArr[1] = myCourse2;
		myCourseArr[2] = myCourse3;
		myCourseArr[3] = myCourse4;
		myCourseArr[4] = myCourse4;
		
		
	}

}
