package javaPracticeW3school;

import java.util.Scanner;
public class averageOfNumbers {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int total =0;

		
		for(int i =1; i <= 3; i++) {
			System.out.println("Enter " + i + " Number: ");
			int n = scn.nextInt();
			
			total += n;
			
		}
		
		System.out.println("Average is: " + total/3);
	}

}
