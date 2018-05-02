package com.qspiders.assignment1;

public class Gd {
	String  genderDecision(int no){
		if(no==1){
			return "BOY";
		}
			else if(no==2){
				return "GIRL";
		}
			else{
				return "nill";
			}
	}
		public static void main(String[] args){
			Gd g=new Gd();
			String x=g.genderDecision(1);
	        System.out.println(x);		
		
	}

}
