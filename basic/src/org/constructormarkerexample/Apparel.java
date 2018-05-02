package org.constructormarkerexample;

public class Apparel {
	String type;
	String color;
	char size;
	Apparel(String type,String color,char size)
	{
	this.color=color;
	this.type=type;
	this.size=size;
	}
	Apparel(String type,char size){
		this.type=type;
		this.size=size;
		this.color="black";
	}
	public static void main(String[] args){
		Apparel a =new Apparel("Jeans","blue",'m');
		a.showDetails();
		Apparel a1=new Apparel("shirt",'s');
		a1.showDetails();
		
	}
	void showDetails(){
		System.out.println(this.color+" "+this.type+" "+this.size);
	}

}
