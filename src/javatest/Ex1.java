package javatest;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter c");
        int c = sc.nextInt();
        System.out.println("Enter d");
        int d = sc.nextInt();
        
                
		int e = a+b;
		int f = c+d;
		
		if(e>f) {
			System.out.println("The sum of a and b is greater than sum of c and d");
		}
		else {
			System.out.println("The sum of c and d is greater than sum of a and b");
		}

}
}