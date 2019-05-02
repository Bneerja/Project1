package com.abstractproject;

public class FactoryShapeClass {
	
	public static Shape getShape(String shapeName) {
		
		//equals is one of the method of string)
		if(shapeName.equals("Circle")) {
			return new Circle();
		} else if(shapeName.equals("Triangle")) {
			return new Triangle();
		} else
		{
			return null;
		}
			
	}

}
