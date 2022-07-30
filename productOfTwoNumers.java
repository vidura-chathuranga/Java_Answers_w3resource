package javaPracticeW3school;

import java.util.Scanner;

public class productOfTwoNumers {

	public static void main(String[] args) {
		
		//create Scanner Object
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Input First Number: ");
		int n1 = obj.nextInt();
		
		System.out.println("Input Second Number: ");
		int n2 = obj.nextInt();
		
		System.out.println( n1 + " * " + n2 + " = " + n1*n2 );

	}

}
