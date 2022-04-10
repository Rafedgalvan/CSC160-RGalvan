
public class InPersonCourse extends Course {
	private String roomNumber;

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public InPersonCourse(String courseNumber, int numStudents, int maxStudents, int credits, String roomNumber) {
		
		super(courseNumber,numStudents,  maxStudents, credits);
		
		this.roomNumber = roomNumber;
	}

	@Override
	public String toString() {
		return "Room Number: " + roomNumber + "\n" + "Course number: " + super.getCourseNumber() + "\n" + "Number of students: " + super.getNumStudents() + "\n" + "Max students: " + super.getMaxStudents()
				+ "\n" + "Credits: " + super.getCredits() + "";
	}

	
	
}

