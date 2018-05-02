package com.coffeday.vendingproject;

public class TestVendingMachine {
	public static void main(String[] args){
	VendingMachine vm=new VendingMachine();
	CoffeeBean cb=new CoffeeBean();
	Apple a=new Apple();
	Water w=new Water();
	Coffee c=vm.prepare(cb);
	AppleJuice aj=vm.prepare(a);
	ColdWater cw=vm.prepare(w);
	}
}
