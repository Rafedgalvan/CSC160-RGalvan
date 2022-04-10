
public class RealTimeRemoteCourse extends OnlineCourse{
	private String zoom;

	public String getZoom() {
		return zoom;
	}

	public void setZoom(String zoom) {
		this.zoom = zoom;
	}

	public RealTimeRemoteCourse(String courseNumber, int numStudents, int maxStudents, int credits, String zoom) {
		super(courseNumber, numStudents, maxStudents, credits);
		this.zoom = zoom;
	}

	@Override
	public String toString() {
		return "Zoom: " + zoom + "\n" + "Course number: " + super.getCourseNumber() + "\n" + "Number of students: " + super.getNumStudents() + "\n" + "Max students: " + super.getMaxStudents()
			+ "\n" + "Credits: " + super.getCredits();
	}
	
	
	
}
