package com.benz.carmanufacture;

public class TestCar {
	Car c=new Car();
	Petrol p=new Petrol();
	Smoke s= c.fill(p);
	Gasoline g=new Gasoline();
	Smoke s1=c.fill(g);
   
	

}
