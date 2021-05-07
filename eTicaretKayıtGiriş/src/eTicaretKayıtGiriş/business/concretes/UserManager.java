package eTicaretKayýtGiriþ.business.concretes;

import eTicaretKayýtGiriþ.business.abstracts.AuthService;
import eTicaretKayýtGiriþ.business.abstracts.UserService;
import eTicaretKayýtGiriþ.core.EmailService;
import eTicaretKayýtGiriþ.dataAccess.abstracts.UserDao;
import eTicaretKayýtGiriþ.entities.concretes.User;

public class UserManager implements UserService {
	
	UserDao userDao;
	EmailService emailervice;
	AuthService authService;	
	
	public UserManager(UserDao userDao, EmailService emailService, AuthService authService) {
		this.userDao = userDao;
		this.emailervice = emailService;
		this.authService = authService;
	}

	@Override
	public void login(User user) {
		
		
		
	}

	@Override
	public void register(User user) {
		
		boolean result = (authService.checkPassword(user) && authService.checkName(user) && authService.checkEmailFormat(user) && authService.checkEmailExist(user));
		
		if (!result) {
			return;
		}else if(result){
			emailervice.send(user.getEmail());
			if (emailervice.verify()==true) {
				userDao.add(user);
			}
		}
		
	}

}
