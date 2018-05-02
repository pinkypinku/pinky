package com.mr.markerbasicexample;

public class Marker {
	String color;
	int price=50;
	String brand="Camilin";
	void showdetails(){
		System.out.println(color+""+price+""+brand);
	}
	public static void main(String[] args){
		Marker m1=new Marker();
		System.out.println(m1);
        m1.color="black";
        m1.showdetails();
        Marker m2=new Marker();
        System.out.println(m2);
        m2.showdetails();
        m2.color="red";
        m2.showdetails();
	}

}
