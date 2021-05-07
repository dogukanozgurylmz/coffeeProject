package eTicaretKayýtGiriþ.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretKayýtGiriþ.business.abstracts.AuthService;
import eTicaretKayýtGiriþ.entities.concretes.User;

public class AuthManager implements AuthService {
	
	List<String> emailList = new ArrayList<String>();
	List<String> passwordList = new ArrayList<String>();

	@Override
	public boolean checkName(User user) {
		
		if (user.getFirstName().length()<2 || user.getLastName().length()<2) {
			System.out.println("Ad ve soyad 2 karakterden az olamaz!");
			return false;
		}
		return true;
		
	}

	@Override
	public boolean checkPassword(User user) {

		if (user.getPassword().length()<6) {
			System.out.println("Parola 6 karakterden az olamaz!");
			return false;
		}
		passwordList.add(user.getPassword());
		return true;
		
	}

	@Override
	public boolean checkEmailExist(User user) {
		
		for (String email : emailList) {
			if (user.getEmail()==email) {
				System.out.println("Bu e-mail adresi kayýtlý. Lütfen farklý e-mail adresi yazýnýz.");
				return false;
			}
		}
		emailList.add(user.getEmail());
		return true;
		
	}

	@Override
	public boolean checkEmailFormat(User user) {
		
		Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^(.+)@(.+)$", Pattern.CASE_INSENSITIVE);
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(user.getEmail());
		
		if (!matcher.matches()) {
			System.out.println("E-mail adresini kurallara uygun giriniz!");
			return false;
		}else {
			return true;
		}
		
	}

}
