import java.util.ArrayList;

public class TestSchoolRecords {

	public static void main(String[] args) {

		ArrayList<Person> personList = new ArrayList<Person>();

		Student student1 = new Student("Mike", 4567, "970 - 467 - 8723", "Mike@gmail.com", "Junior");
		Student student2 = new Student("Adam", 8700, "970 - 231 - 5467", "Adam@gmail.com", "Freshman");
		Faculty faculty1 = new Faculty("Maria", 6708, "970 - 456 - 0952", "Maria@gmail.com", "WE18", 60000,
				"March 16 2009", "Monday 11:00 - 12:00", "Senior");
		Faculty faculty2 = new Faculty("Phil", 7586, "970 - 893 - 9372", "Phil@gmail.com", "N20", 50000, "April 5 2015",
				"Tuesday 11:00 - 12:00", "Junior");
		Staff staff1 = new Staff("Juan", 9083, "970 - 827 - 2987", "Juan@gmail.com", "S12", 45000, "June 12, 2008",
				"Janitor");
		Staff staff2 = new Staff("Liz", 8726, "970 - 2937 - 3487", "Liz@gmail.com", "E14", 48000, "January 4, 2019",
				"Lunch Lady");

		personList.add(student1);
		personList.add(student2);
		personList.add(faculty1);
		personList.add(faculty2);
		personList.add(staff1);
		personList.add(staff2);

		for (Person person : personList) {
			printPerson(person);

		}

	}

	public static void printPerson(Person myPerson) {

		System.out.print("Name: " + myPerson.getName() + " Address: " + myPerson.getAddress() + " Phone Number: "
				+ myPerson.getPhoneNumber() + " Email: " + myPerson.getEmailAddress());

		if (myPerson instanceof Student) {
			System.out.println("Status: " + ((Student) myPerson).getStatus());
		}
		if (myPerson instanceof Faculty) {
			System.out.println("Office: " + ((Faculty) myPerson).getOffice() + " Salary: "
					+ ((Faculty) myPerson).getSalary() + " Date Hired: " + ((Faculty) myPerson).getDateHired()
					+ " Rank: " + ((Faculty) myPerson).getRank());
		}
		if (myPerson instanceof Staff) {
			System.out.println("Office: " + ((Staff) myPerson).getOffice() + " Salary: "
					+ ((Staff) myPerson).getSalary() + " Date Hired: " + ((Staff) myPerson).getDateHired() + " Title: "
					+ ((Staff) myPerson).getTitle());
		}

	}

}
