package interfaces;

public class Main {

	public static void main(String[] args) {
		//ICustomerDal customerDal = new MySqlCustomerDal();
		
		/* CustomerManager customerManager = new CustomerManager();
		customerManager.customerDal=new MySqlCustomerDal();
		customerManager.add();*/
		
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		customerManager.add();
	}

}
