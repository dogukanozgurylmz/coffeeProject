package eTicaretKay�tGiri�.business.abstracts;

import eTicaretKay�tGiri�.entities.concretes.User;

public interface AuthService {
	
	boolean checkName(User user);
	boolean checkPassword(User user);
	boolean checkEmailExist(User user);
	boolean checkEmailFormat(User user);
	
}
