
public class Person {

	// data members
	private String name;
	private int address;
	private String phoneNumber;
	private String emailAddress;

	public String getName() {
		return name;
	}

	// getters and setters
	public void setName(String name) {
		this.name = name;
	}

	public int getAddress() {
		return address;
	}

	public void setAddress(int address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	// constructors
	public Person(String name, int address, String phoneNumber, String emailAddress) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	public Person() {

	}

	@Override
	public String toString() {
		return "Name: " + name + " Address: " + address + " Phone Number: " + phoneNumber + " Email Address: "
				+ emailAddress;
	}

}
