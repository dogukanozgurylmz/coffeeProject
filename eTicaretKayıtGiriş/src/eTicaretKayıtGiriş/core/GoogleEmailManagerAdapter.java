package eTicaretKay�tGiri�.core;

import eTicaretKay�tGiri�.googleEmail.GoogleEmailManager;

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
			System.out.println("Do�rulama onaylanmam��t�r.");
		}else {
			System.out.println("Do�rulama onaylanm��t�r.");
			return true;
		}
		return result;
	}

}
