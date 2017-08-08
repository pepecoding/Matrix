package org.itstep;

public class AccountCreator {

	public int getRandomNumber(int min, int max) {
		int rndNum = 0;
		if (min < max) {
			rndNum = min + (int) Math.random() * (max - min) + 1;

		}

		return rndNum;

	}

	public String getRandomString(int randomNumber) {
		String rndString = "";
		for (int i = 0; i < randomNumber; i++) {
			String symbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			char[] charSymbols = symbols.toCharArray();
			rndString += String.valueOf(charSymbols[getRandomNumber(0, (charSymbols.length - 1))]);
		}

		return rndString;
	}

	public String getRandomEmail(String rndString, int randomNumber) {
		if (randomNumber > 5) {
			randomNumber = 5;

		}
		String rndEmail = rndString + "@";
		switch (randomNumber) {
		case 1:
			rndEmail += "gmail.com";

			break;

		case 2:
			rndEmail += "mail.com";

			break;

		case 3:
			rndEmail += "hotmail.com";

			break;

		case 4:
			rndEmail += "bigmir.net";

			break;

		case 5:
			rndEmail += "ukr.net";

			break;

		default:
			rndEmail += "gmail.com";

			break;
		}
		return rndEmail;

	}

	public String getRandomPass() {

		String rndPass = "";
		rndPass = getRandomString(6) + getRandomNumber(1000, 9999);

		return rndPass;
	}

	public Account getRandomAccount() {
		String name = getRandomString(getRandomNumber(8, 14));
		String email = getRandomEmail(name, getRandomNumber(1, 5));
		String pass = getRandomPass();
		Account account = new Account(email, pass, name);

		return account;
	}

}
