package eTicaretKay�tGiri�.business.concretes;

import eTicaretKay�tGiri�.business.abstracts.AuthService;
import eTicaretKay�tGiri�.business.abstracts.UserService;
import eTicaretKay�tGiri�.core.EmailService;
import eTicaretKay�tGiri�.dataAccess.abstracts.UserDao;
import eTicaretKay�tGiri�.entities.concretes.User;

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
