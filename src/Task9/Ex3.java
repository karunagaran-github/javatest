package Task9;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the number of rows: ");
		        int rows = scanner.nextInt();
		        scanner.close();

		        int currentNumber = 1;

		        for (int i = 1; i <= rows; i++) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print(currentNumber + " ");
		                currentNumber++;
		            }
		            System.out.println();
		        }
	}

}
