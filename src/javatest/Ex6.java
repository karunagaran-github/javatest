package javatest;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int factorial =1;
        
        for (int i=1; i<=number;i++) {
        	 factorial *= i;
             
	}
        System.out.println( "Factorial of  "+ number + " is "+factorial);
}}
