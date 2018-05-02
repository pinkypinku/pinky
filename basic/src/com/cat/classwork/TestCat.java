package com.cat.classwork;

public class TestCat {
	public static void main(String[] args){
		Cat c =new Cat();
		Fish f=new Fish();
		Cheese ch=new Cheese();
		Rat r=new Rat();
		c.eat(f);
		c.eat(ch);
		c.eat(r);
		
	}

}
