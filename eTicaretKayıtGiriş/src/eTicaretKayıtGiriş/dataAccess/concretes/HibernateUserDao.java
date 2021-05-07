package eTicaretKayýtGiriþ.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretKayýtGiriþ.dataAccess.abstracts.UserDao;
import eTicaretKayýtGiriþ.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi.");
		users.add(user);
	}

	@Override
	public List<User> getAll() {
		return users;
	}

}
