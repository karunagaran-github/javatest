package javatest;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean flag = false;
	    
	    for (int i = 2; i <= number / 2; ++i) {
	      // condition for nonprime number
	      if (number % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(number + " is a prime number.");
	    else
	      System.out.println(number + " is not a prime number.");

	}

}
