package kodlama.ioDemo.dataAccess;

import kodlama.ioDemo.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile eğitmen eklendi: " + " " + instructor.getFirstName() + " " + instructor.getLastName());
	}
}
