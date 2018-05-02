package com.bottle.waterbottle;

public class Bottle {
	void store(Water w){
		System.out.println("accepting water");
		
	}
	void store(Juice j){
		System.out.println("accepting juice");
	}
	void store(Milk m){
		System.out.println("accepting milk");
	}
  public static void main(String[] args){
	  Bottle b=new Bottle();
	  Water w=new Water();
	  b.store(w);
	  Juice j=new Juice();
	  b.store(j);
      Milk m=new Milk();
      b.store(m);
      System.out.println("program completed");
  }
}
