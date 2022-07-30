package javaPracticeW3school;

public class AmericanFlagPattern {

	public static void main(String[] args) {
		
		String p1 = "* * * * * * ==================================";
		String p2 = " * * * * *  ==================================";
		String p3 = "==============================================";
		
		for(int i = 1; i <=5; i++ ) {
			
			if( i == 5) {
				System.out.println(p1);
				break;
			}
			System.out.println(p1);
			System.out.println(p2);
		}
		
		for(int i =1; i <= 6; i++) {
			
			System.out.println(p3);
		}
		

	}

}
