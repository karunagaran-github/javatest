package Task9;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		String revstr = "";
		System.out.println("Str is "+ str);
		
		for(int i=0;i<str.length();i++) {
			revstr = str.charAt(i)+ revstr;
			}
			System.out.println("revstr is "+ revstr);
			
			if(str.equals(revstr)) {
				System.out.println("The string is Palindrom");
			}
			else {
				System.out.println("It is not a palindrome");
			}
		
	}

}
