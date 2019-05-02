package com.abstractproject;

public class Circle extends Shape {
	float radius;

	@Override
	void calculateArea() {
		System.out.println("Enter radius:");
		radius = scr.nextFloat();
		area = PI*radius*radius;
		System.out.println("Area of the Circle :" + area);
		
	}

}
