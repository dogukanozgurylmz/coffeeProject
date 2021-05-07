package eTicaretKayýtGiriþ.business.abstracts;


import eTicaretKayýtGiriþ.entities.concretes.User;

public interface UserService {

	void login(User user);
	void register(User user);
	
}
