
public class Course {
	private String courseNumber;
	private int numStudents;
	private int maxStudents;
	private int credits;
	
	
	// Getters and Setters 
	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public int getNumStudents() {
		return numStudents;
	}

	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}

	public int getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	// constructors 
	public Course(int numStudents, int maxStudents) {
		this.numStudents = numStudents;
	}
	
	public Course(String courseNumber) {
		this.courseNumber = courseNumber;
	}
	
	public Course(int maxStudents) {
		this.maxStudents = maxStudents;
	}
	public Course(int credits, String courseNumber) {
		this.credits = credits;
	}
	
	
	public Course(String courseNumber, int numStudents, int maxStudents, int credits) {
		super();
		this.courseNumber = courseNumber;
		this.numStudents = numStudents;
		this.maxStudents = maxStudents;
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "Course number: " + courseNumber + "\n" + "Number of students: " + numStudents + "\n" + "Max students: " + maxStudents
				+ "\n" + "Credits: " + credits;
	}

	
	
}
