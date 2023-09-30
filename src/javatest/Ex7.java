package javatest;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String msg = scanner.nextLine();
        
        int Length= msg.length();
        System.out.println(" Length is "+ Length);
	}

}
