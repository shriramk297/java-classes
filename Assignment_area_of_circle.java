package day1;

import java.util.Scanner;

public class Assignment_area_of_circle{

	private static Scanner sc;

	public static void main(String[] args) {
		double radius, area;
		sc = new Scanner(System.in);
		
		System.out.println("Welcome to calculate the area of circle:");
		System.out.println("\n Please Enter the radius of a circle: ");
		radius = sc.nextDouble();
		
		area = Math.PI * radius * radius; 

		System.out.println("\n Area of a Circle is  = " + area);
		System.out.println("Thankyou: ");
	}
	  
}