package Task9;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == j || i + j == rows + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

	}

}
