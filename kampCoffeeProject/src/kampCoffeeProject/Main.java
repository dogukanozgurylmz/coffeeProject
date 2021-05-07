package kampCoffeeProject;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

		Customer customer = new Customer(1,"doðukan özgür","yýlmaz",2001,"12345678901");
		
		customerManager.save(customer);
	}

}
