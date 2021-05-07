package eTicaretKay�tGiri�;

import eTicaretKay�tGiri�.business.concretes.AuthManager;
import eTicaretKay�tGiri�.business.concretes.UserManager;
import eTicaretKay�tGiri�.core.GoogleEmailManagerAdapter;
import eTicaretKay�tGiri�.dataAccess.concretes.HibernateUserDao;
import eTicaretKay�tGiri�.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager(new HibernateUserDao(), new GoogleEmailManagerAdapter(), new AuthManager());
		
		User user1 = new User(1,"Do�ukan","Y�lmaz","dogukan@gmail.com","123456");
		User user2 = new User(2,"Do�ukan","Y�lmaz","doguka@gmail.com","123456");
		User user3 = new User(3,"Do�ukan","Y�lmaz","doguk@gmail.com","123456");
		
		userManager.register(user1);
		System.out.println("-----------------------------");
		userManager.register(user2);
		System.out.println("-----------------------------");
		userManager.register(user3);
		
	}

}
