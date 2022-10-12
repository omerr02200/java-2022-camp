package kodlama.ioDemo.dataAccess;

import kodlama.ioDemo.entities.Category;

public interface CategoryDao {
	void add(Category category);
	void update(Category category);
	void delete(Category category);

}
