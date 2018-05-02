package com.show.display;

public class Sample {
	void show(){
	display();
	System.out.println("show method");
	}
    void display(){
    	show();
    	System.out.println("display method");
    }
    public static void main(String[] args){
    	Sample s=new Sample();
    	s.show();
    }
}
