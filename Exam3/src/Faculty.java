
public class Faculty extends Employee {

	// data members
	private String officeHours;
	private String rank;

	// getters and setters
	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	// constructors
	public Faculty(String name, int address, String phoneNumber, String emailAddress, String office, int salary,
			String dateHired, String officeHours, String rank) {
		super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public Faculty() {

	}

}
