package eTicaretKay�tGiri�.dataAccess.abstracts;

import java.util.List;

import eTicaretKay�tGiri�.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	List<User> getAll();
	
}
