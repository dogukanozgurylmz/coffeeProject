package eTicaretKayýtGiriþ.dataAccess.abstracts;

import java.util.List;

import eTicaretKayýtGiriþ.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	List<User> getAll();
	
}
