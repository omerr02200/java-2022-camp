package kodlama.ioDemo.entities;

public class Category extends BaseEntity{
	String name;

	public Category() {
		
	}

	public Category(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
