package eTicaretKayýtGiriþ.core;

import eTicaretKayýtGiriþ.googleEmail.GoogleEmailManager;

public class GoogleEmailManagerAdapter implements EmailService {

	@Override
	public void send(String email) {
		
		GoogleEmailManager emailManager = new GoogleEmailManager();
		emailManager.send(email);
		
	}

	@Override
	public boolean verify() {
		
		boolean result = true;
		if (result==false) {
			System.out.println("Doðrulama onaylanmamýþtýr.");
		}else {
			System.out.println("Doðrulama onaylanmýþtýr.");
			return true;
		}
		return result;
	}

}
