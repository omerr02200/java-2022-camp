package kodlama.ioDemo.business;

import kodlama.ioDemo.core.logging.Logger;
import kodlama.ioDemo.dataAccess.InstructorDao;
import kodlama.ioDemo.dataAccess.JdbcInstructorDao;
import kodlama.ioDemo.entities.Instructor;

public class InstructorManager {
	
	InstructorDao instructorDao;
	Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao=instructorDao;
		this.loggers = loggers;
	}
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for(Logger logger:loggers) {
			logger.log(instructor.getFirstName() + " " + instructor.getLastName());
		}
	}
}
