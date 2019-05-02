package com.abstractproject;

public class Triangle extends Shape {

	float base;
	float height;
	@Override
	void calculateArea() {
		System.out.println("Enter base and height :");
		base = scr.nextFloat();
		height = scr.nextFloat();
		area = (base*height)/2;
		System.out.println("Area of the triangle :" + area);
		
	}
	

}
