
public class FullRemoteCourse extends OnlineCourse{
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public FullRemoteCourse(String courseNumber, int numStudents, int maxStudents, int credits, String email) {
		super(courseNumber, numStudents, maxStudents, credits);
		this.email = email;
	}

	@Override
	public String toString() {
		return "Email: " + email + "\n" + "Course number: " + super.getCourseNumber() + "\n" + "Number of students: " + super.getNumStudents() + "\n" + "Max students: " + super.getMaxStudents()
		+ "\n" + "Credits: " + super.getCredits() + "";
	}

	
	
}
