package org.constructormarkerexample;

public class Marker {
	String color;
	int price=50;
	String brand="camilin";
	Marker(String color)
	{
		this.color=color;
		//this is used for differentiate the instance variable and local variable
	}
	public static void main(String[] args){
		Marker m1=new Marker("black");
		System.out.println(m1.color+""+m1.price+""+m1.brand);
		Marker m2=new Marker("green");
		System.out.println(m2.color+""+m2.price+""+m2.brand);
		
	}

}
