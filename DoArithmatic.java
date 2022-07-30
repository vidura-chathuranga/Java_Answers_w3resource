package javaPracticeW3school;

import java.util.Scanner;

public class DoArithmatic {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Input First Number: ");
		int n1 = scn.nextInt();
		
		System.out.println("Input Second Number: ");
		int n2 = scn.nextInt();
		
		System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
		System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
		System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
		System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
		System.out.println(n1 + " mod " + n2 + " = " + (n1%n2));
		

	}

}
