package javaPracticeW3school;

import java.util.Scanner;

public class AreaPerimeterRectangle {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter rectangle width: ");
		float w = scn.nextFloat();
		
		System.out.println("Enter rectangle Height: ");
		float h = scn.nextFloat();
		
		
		System.out.printf("%d * ( %.1f + %.1f) = %.2f\n", 2, w, h, 2*(w + h));
		System.out.printf(" %.1f * %.1f = %.2f",w , h, w * h);
		
	}
}
