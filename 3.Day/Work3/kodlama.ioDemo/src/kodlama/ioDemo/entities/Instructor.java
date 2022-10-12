package kodlama.ioDemo.entities;

public class Instructor extends BaseEntity{
	String firstName;
	String lastName;
	
	public Instructor() {
		
	}

	public Instructor(int id, String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id=id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
