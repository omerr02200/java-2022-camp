package kodlama.ioDemo.dataAccess;

import kodlama.ioDemo.entities.Category;
import kodlama.ioDemo.entities.Instructor;

public class JdbcCategoryDao implements CategoryDao{
	public void add(Category category) {
		System.out.println("Jdbc ile kategori eklendi: " + " " + category.getName());
	}
}
