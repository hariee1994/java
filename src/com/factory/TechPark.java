package com.factory;

public class TechPark extends Factory {
	public void techparkName() {
		// TODO Auto-generated method stub
System.out.println("mahindra");
	}
public void techparkAdress() {
	// TODO Auto-generated method stub
      System.out.println("singapore");
}
public static void main(String[] args) {
	TechPark t=new TechPark();
	t.techparkAdress();
	t.techparkName();
	t.factoryArea();
	t.factoryDetails();
}
}
