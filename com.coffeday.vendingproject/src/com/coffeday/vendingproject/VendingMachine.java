package com.coffeday.vendingproject;

public class VendingMachine {
			Coffee prepare(CoffeeBean cb){
			System.out.println("creating coffee object");
			Coffee c=new Coffee();
			return c;
			}
			AppleJuice prepare(Apple a){
				System.out.println("creating apple juice object");
				AppleJuice aj=new AppleJuice();
				return aj;
			}
			ColdWater prepare(Water w){
				System.out.println("creating coldwater object");
				ColdWater cw=new ColdWater();
				return cw;
			}
	       
	}


