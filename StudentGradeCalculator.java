import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Student Grade Calculator!");

        // Input the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        // Array to store the scores of the subjects
        double[] scores = new double[numberOfSubjects];
        double totalScore = 0.0;

        // Input the scores for each subject
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter the score for subject " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
            totalScore += scores[i];
        }

        // Calculate the average score
        double averageScore = totalScore / numberOfSubjects;

        // Determine the grade based on the average score
        char grade;
        if (averageScore >= 90) {
            grade = 'A';
        } else if (averageScore >= 80) {
            grade = 'B';
        } else if (averageScore >= 70) {
            grade = 'C';
        } else if (averageScore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Output the results
        System.out.println("\nResults:");
        System.out.println("Total Score: " + totalScore);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Final Grade: " + grade);

        scanner.close();
    }
}
