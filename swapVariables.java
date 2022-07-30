package javaPracticeW3school;

import java.util.Scanner;

public class swapVariables {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n1 = scn.nextInt();
		
		System.out.println("Enter a number again: ");
		int n2 = scn.nextInt();
		
		System.out.println("before swapping....");
		
		System.out.println("number1 = " + n1);
		System.out.println("number2 = " + n2);
		
		int n3;
		
		n3 = n1;
		n1 = n2;
		n2 = n3;
		
		System.out.println("After Swapping...");
		
		System.out.println("number1 = " + n1);
		System.out.println("number2 = " + n2);

	}

}
