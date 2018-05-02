package com.paytm.loginmethos;

public class Paytm {
	void login(long mobileNo,String password){
		System.out.println("login succesfull");
	}
	void login(String email,String password){
		System.out.println("login succesfull");
	}
	public static void main(String[] args){
		Paytm p=new Paytm();
		p.login(9440280401L, "jagadeesh");
		p.login("sreevidyasai92gmail.com","jagadeesh");
		System.out.println("done login");
		
	}

}
