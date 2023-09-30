package javatest;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
        int s1 = sc.nextInt();
        System.out.println("Enter b");
        int s2 = sc.nextInt();
        
        System.out.println("Before swapping:");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        // Swap the values using a temporary variable
        int temp = s1;
        s1 = s2;
        s2 = temp;

        System.out.println("\nAfter swapping:");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

	}

}
