package kodlama.ioDemo.dataAccess;

import kodlama.ioDemo.entities.Category;

public class HibernateCategoryDao implements CategoryDao{
	public void add(Category category) {
		System.out.println("Hibernate ile kategori eklendi: " + " " + category.getName());
	}

	@Override
	public void update(Category category) {
		System.out.println("Hibernate ile kategori güncellendi: " + " " + category.getName());
	}

	@Override
	public void delete(Category category) {
		System.out.println("Hibernate ile kategori eklendi: " + " " + category.getName());
	}
}
