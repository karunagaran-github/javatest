package javatest;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int digitCount = countDigits(num);

        System.out.println("Number of digits: " + digitCount);

        
    }
		
		 public static int countDigits(int num) {
		        // Convert the integer to a string and find its length
		        String numStr = Integer.toString(num);
		        return numStr.length();			
	}

}
