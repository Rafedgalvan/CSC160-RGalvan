
public class Student extends Person {

	// data members
	private String status;

	// getters and setters
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	// constructors
	public Student(String name, int address, String phoneNumber, String emailAddress, String status) {
		super(name, address, phoneNumber, emailAddress);
		this.status = status;
	}

	public Student() {

	}

	@Override
	public String toString() {
		return "Status: " + status;
	}

}
