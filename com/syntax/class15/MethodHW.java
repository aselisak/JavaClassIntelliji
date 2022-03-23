package com.syntax.class15;

public class MethodHW {
	
	void createUsernameAndPassword(String userName, String password, String confirmedPassword) {
		if (userName.isEmpty() && password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
			
		}else {
			if (password.length()<8){
			System.out.println("Password is too short");
			
		}else {
			if (password.contains(userName)) {
				System.out.println("Password cannot contain username");
			}else {
				if (password.equals(confirmedPassword)) {
					System.out.println("Username and Password has been created");
				}else {
					System.out.println("Password do not match");
				}}}}
	}

	public static void main(String[] args) {
	
		String userName="Asel";
		String password="pass1234Asel";
		String confirmedPassword="pass1234Asel";
		MethodHW task1=new MethodHW();
		task1.createUsernameAndPassword(userName, password, confirmedPassword);
	}

}
