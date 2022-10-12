package kodlama.ioDemo;

import kodlama.ioDemo.business.CategoryManager;
import kodlama.ioDemo.business.InstructorManager;
import kodlama.ioDemo.business.ProgrammingLanguageManager;
import kodlama.ioDemo.core.logging.DatabaseLogger;
import kodlama.ioDemo.core.logging.FileLogger;
import kodlama.ioDemo.core.logging.Logger;
import kodlama.ioDemo.entities.Instructor;
import kodlama.ioDemo.entities.*;
import kodlama.ioDemo.dataAccess.*;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
		
		Instructor instructor = new Instructor(1, "Engin", "Demiroğ");
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor);
		
		Category category = new Category(1, "Programlama");
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(category);
		
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage(1, "Java", 1, -1);
		ProgrammingLanguageManager programmingLanguageManager = new ProgrammingLanguageManager(new JdbcProgrammingLanguageDao(), loggers);
		programmingLanguageManager.add(programmingLanguage);
	}

}
