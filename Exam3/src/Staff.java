
public class Staff extends Employee {

	private String title;

	// getters and setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// constructors
	public Staff(String name, int address, String phoneNumber, String emailAddress, String office, int salary,
			String dateHired, String title) {
		super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
		this.title = title;
	}

	public Staff() {

	}

	@Override
	public String toString() {
		return "Title=" + title;
	}

}
