
public class Course {
	//Data Members
	private String courseNumber;
	private int numberOfCredits;
	private int maxStudents;
	private int actualStudents;
	
	//Constructors
	public Course() {
		courseNumber = "CSC160";
		numberOfCredits = 4;
		maxStudents = 10;
		actualStudents = 9;
	}
	
	

	public Course(String courseNumber, int numberOfCredits, int maxStudents, int actualStudents) {
		super();
		this.courseNumber = courseNumber;
		this.numberOfCredits = numberOfCredits;
		this.maxStudents = maxStudents;
		this.actualStudents = actualStudents;
	}

	public Course(String courseNumber) {
		this.courseNumber = courseNumber;
		
	}
	
	public Course (String courseNumber, int numberOfCredits) {
		this.courseNumber = courseNumber;
		this.numberOfCredits = numberOfCredits;
		
	}
	
	public Course (int maxStudents, int numberOfCredits) {
		this.maxStudents = maxStudents;
	}
	

	public String getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}
	public int getNumberOfCredits() {
		return numberOfCredits;
	}
	public void setNumberOfCredits(int numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}
	public int getMaxStudents() {
		return maxStudents;
	}
	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}
	public int getActualStudents() {
		return actualStudents;
	}
	public void setActualStudents(int actualStudents) {
		this.actualStudents = actualStudents;
	}



	@Override
	public String toString() {

	return "CourseNumber: " + courseNumber +  ", numberOfCredits: " + numberOfCredits + ", maxStudents: "
			+ maxStudents + ", actualStudents: " + actualStudents;
		
	}
	
	
	
}
