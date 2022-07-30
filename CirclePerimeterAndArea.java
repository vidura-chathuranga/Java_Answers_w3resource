package javaPracticeW3school;

import java.util.Scanner;

public class CirclePerimeterAndArea {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Radius: ");
		float r = scn.nextFloat();
		
		//calculate perimeter
		float perimeter = (float)((2 * 3.14) * r);
		
		//calculate Area
		float area = (float)(3.14 * r * r);
		
		
		System.out.println("Perimeter is: " + perimeter);
		System.out.println("Area is: " + area);

	}

}
