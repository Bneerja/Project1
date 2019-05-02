package com.abstractproject;

import java.util.Scanner;

public abstract class Shape {

	final float PI = 3.14f; //declaring and initialising a constant.final variables must be assigned the value.
	
	Scanner scr = new Scanner(System.in);
	
	float area;
	
	abstract void calculateArea();	
	
}
