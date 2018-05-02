package com.qspiders.assignment1;

public class Caliculation {
	void add(int num1,int num2){
		int res=num1+num2;
		System.out.println(res);
	}
	void add(int num1,int num2,int num3){
			int res=num1+num2+num3;
			System.out.println(res);
	}
			void add(int num1,int num2,int num3,int num4){
				int res=num1+num2+num3+num4;
				System.out.println(res);
				
	}
			public static void main(String[] args){
				Caliculation c=new Caliculation();
				c.add(1,2);
				c.add(1,2,3);
				c.add(1,2,3,4);
			}
			

		
	}


