package Task9;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the student's mark: ");
        int mark = scanner.nextInt();
        
        scanner.close();
        
        String grade = calculateGrade(mark);
        
        System.out.println("Grade: " + grade);
    }

    public static String calculateGrade(int mark) {
        if (mark >99 && mark <=100) {
        return "S";
    }
    {
        if (mark >= 90 && mark <= 199) {
            return "A";
        } else if (mark >= 80 && mark < 90) {
            return "B";
        } else if (mark >= 70 && mark < 80) {
            return "C";
        } else if (mark >= 60 && mark < 70) {
            return "D";
        } else if (mark >= 50 && mark < 60) {
            return "E";
        } else if (mark < 50 && mark >= 0) {
            return "F";
        } else {
            return "Invalid input. Mark should be between 0 and 100.";
        }

    }}}


