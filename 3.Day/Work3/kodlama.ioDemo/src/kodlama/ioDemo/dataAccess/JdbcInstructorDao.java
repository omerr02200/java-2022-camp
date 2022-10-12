package kodlama.ioDemo.dataAccess;

import kodlama.ioDemo.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile eğitmen eklendi: " + " " + instructor.getFirstName() + " " + instructor.getLastName());
	}
}
