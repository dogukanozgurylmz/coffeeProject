package eTicaretKayýtGiriþ;

import eTicaretKayýtGiriþ.business.concretes.AuthManager;
import eTicaretKayýtGiriþ.business.concretes.UserManager;
import eTicaretKayýtGiriþ.core.GoogleEmailManagerAdapter;
import eTicaretKayýtGiriþ.dataAccess.concretes.HibernateUserDao;
import eTicaretKayýtGiriþ.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager(new HibernateUserDao(), new GoogleEmailManagerAdapter(), new AuthManager());
		
		User user1 = new User(1,"Doðukan","Yýlmaz","dogukan@gmail.com","123456");
		User user2 = new User(2,"Doðukan","Yýlmaz","doguka@gmail.com","123456");
		User user3 = new User(3,"Doðukan","Yýlmaz","doguk@gmail.com","123456");
		
		userManager.register(user1);
		System.out.println("-----------------------------");
		userManager.register(user2);
		System.out.println("-----------------------------");
		userManager.register(user3);
		
	}

}
