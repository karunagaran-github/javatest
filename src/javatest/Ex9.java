package javatest;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		if(age>60) {
			System.out.println(" The person is Senior citizes");
		}
		else {
			System.out.println("The person is not a senior citizen");
		}

	}

}
