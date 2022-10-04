package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "Asus Laptop", 500, 3, "siyah");
//		product.setName("Laptop"); 
//		product.setId(1);;
//		product.setDescription("Asus Laptop");
//		product.setPrice(500);
//		product.setStockAmount(3);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());

	}

}
