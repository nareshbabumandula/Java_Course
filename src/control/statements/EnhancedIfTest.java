package control.statements;

import java.util.Scanner;

public class EnhancedIfTest {

	// main method - Entry point for JVM
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		
		if (a>b) System.out.println("a is greater than b");
		
		else if(a==b) System.out.println("a is equal to b");
		
		else System.out.println("a is less than b");
		

	}

}
