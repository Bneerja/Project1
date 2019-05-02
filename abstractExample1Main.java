package com.abstractproject;

import java.util.Scanner;

public class abstractExample1Main {

	public static void main(String[] args) {
		/*
		Circle cr = new Circle();
		cr.calculateArea();
		
		Triangle tr = new Triangle();
		tr.calculateArea();
		*/
       // the above is a not a preferred style to call an abstract program. instead we could do as follows.
		
		/*But the following method also we cannot follow, because, then we have to send all the three class -
		 *  shape, cicle & triangle too.
		 
		
		Shape shape;
		
		shape = new Circle();
		System.out.println(shape);		
		shape.calculateArea();
		
		shape = new Triangle();
		System.out.println(shape);
		shape.calculateArea();
		*/
		// hence we shall create one more layer - factory class.to connect factory class & main class we do the foll.
		Scanner scr = new Scanner(System.in);
		Shape shape;
		System.out.println("Enter shape name");
		String shapeName = scr.next();
		shape = FactoryShapeClass.getShape(shapeName);
		//here we call the static method by using its class name;
		System.out.println(shape);
		shape.calculateArea();
		scr.close();
		
	}

}
