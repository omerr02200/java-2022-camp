package kodlama.ioDemo.business;

import java.util.ArrayList;
import java.util.List;

import kodlama.ioDemo.core.logging.Logger;
import kodlama.ioDemo.dataAccess.CategoryDao;
import kodlama.ioDemo.dataAccess.InstructorDao;
import kodlama.ioDemo.dataAccess.JdbcInstructorDao;
import kodlama.ioDemo.entities.Category;
import kodlama.ioDemo.entities.Instructor;
import kodlama.ioDemo.entities.ProgrammingLanguage;

public class CategoryManager {
	
	CategoryDao categoryDao;
	Logger[] loggers;
	
	List<Category> categories = new ArrayList<>();
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao=categoryDao;
		this.loggers = loggers;
	}
	public void add(Category category) throws Exception {
		boolean result = nameExist(category.getName());
		if(!result) {
			throw new Exception("Aynı isimde kategori olamaz.");
		}
		categoryDao.add(category);
		
		for(Logger logger:loggers) {
			logger.log(category.getName());
		}
	}
	
	public boolean nameExist(String name) {
		for (Category category : categories) {
			if (category.getName().equals(name)) {
				return false;
			}
		}
		return true;
	}
}


