
public class Employee extends Person {

	// data members
	private String office;
	private int salary;
	private String dateHired;

	// getters and setters
	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDateHired() {
		return dateHired;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}

	// constructors
	public Employee(String name, int address, String phoneNumber, String emailAddress, String office, int salary,
			String dateHired) {
		super(name, address, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}

	public Employee() {

	}

	@Override
	public String toString() {
		return "Office: " + office + " Salary: " + salary + " Date Hired: " + dateHired;
	}

}
