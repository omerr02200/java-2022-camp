package kodlama.ioDemo.entities;

public class ProgrammingLanguage extends BaseEntity {
	String name;
	int categoryId;
	double price;

	public ProgrammingLanguage() {

	}

	public ProgrammingLanguage(int id, String name, int categoryId, double price) {
		this.id = id;
		this.name = name;
		this.categoryId = categoryId;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
