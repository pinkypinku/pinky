package com.amazon.paymentapp;

public class Amazon {
	Product pay(Wallet w){
		Product p=new Product();
		System.out.println("accepting wallet");
		return p;
	
	}
	Product pay(Credit c){
		Product p=new Product();
		System.out.println("accepting creditcard");
		return p;
	}
	Product pay(Debit d){
		Product p=new Product();
		System.out.println("accepting debit card");
		return p;
	}
	public static void main(String[] args){
		Amazon a=new Amazon();
		Wallet w=new Wallet();
		Credit c=new Credit();
		Debit  d=new Debit();
		Product p=a.pay(w);
		Product p1=a.pay(c);
		Product p2=a.pay(d);	
		}
}
