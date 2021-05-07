package eTicaretKay�tGiri�.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretKay�tGiri�.dataAccess.abstracts.UserDao;
import eTicaretKay�tGiri�.entities.concretes.User;

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
