package com.samsung.unlock;

public class MobilePhone {
	void unlock(Pattern p){
		System.out.println("unlock by pattern");
		
	}
	void unlock(int pin){
		System.out.println("unlock by pin");
	}
	public static void main(String[] args){
		MobilePhone mp=new MobilePhone();
		Pattern p=new Pattern();
		mp.unlock(p);
		mp.unlock(1234);
		System.out.println("displaying homescreen");
		
		
		
	}
	

}
