// Task 2 - Student Grade Calculator
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSubjects = 5;
        int totalMarks = 0;

        System.out.println("\n Welcome to the Student Grade Calculator!");

        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("\n Enter marks for subject  " + i + " (out of 100): ");
            int marks = scanner.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter between 0 and 100.");
                i--;
                continue;
            }

            totalMarks += marks;
        }

        double average = (double) totalMarks / numberOfSubjects;

        String grade;
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n Total Marks: " + totalMarks);
        System.out.println("\n Average Percentage: " + average + "%");
        System.out.println("\n Grade: " + grade);

        scanner.close();
    }
}
