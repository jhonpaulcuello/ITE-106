import java.util.Scanner;

public class StudentGradebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students? ");
        int studentCount = scanner.nextInt();
        System.out.print("How many assignments? ");
        int assignmentCount = scanner.nextInt();

        String[] students = new String[studentCount];
        double[][] grades = new double[studentCount][assignmentCount];
        double[] averages = new double[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Name of student " + (i + 1) + ": ");
            students[i] = scanner.next();
            double total = 0;
            for (int j = 0; j < assignmentCount; j++) {
                System.out.print("Score for assignment " + (j + 1) + ": ");
                grades[i][j] = scanner.nextDouble();
                total += grades[i][j];
            }
            averages[i] = total / assignmentCount;
        }

        System.out.println("\nStudent Grades:\nName\t\tAverage\t\tGrade");
        for (int i = 0; i < studentCount; i++) {
            String grade = getLetterGrade(averages[i]);
            System.out.print(students[i] + "\t\t" + averages[i] + "\t\t" + grade + "\n");
        }
		
        findHighestAndLowestAverage(averages, students);
        sortStudentsByAverage(students, averages, grades);

        scanner.close();
    }

    private static String getLetterGrade(double average) {
        if (average >= 90) return "A";
        else if (average >= 80) return "B";
        else if (average >= 70) return "C";
        else if (average >= 60) return "D";
        return "F";
    }

    private static void findHighestAndLowestAverage(double[] averages, String[] students) {
        double highest = averages[0], lowest = averages[0];
        String highestStudent = students[0], lowestStudent = students[0];

        for (int i = 1; i < averages.length; i++) {
            if (averages[i] > highest) { highest = averages[i]; highestStudent = students[i]; }
            if (averages[i] < lowest) { lowest = averages[i]; lowestStudent = students[i]; }
        }

        System.out.println("\nHighest Average: " + highest + " by " + highestStudent);
        System.out.println("Lowest Average: " + lowest + " by " + lowestStudent);
    }

    private static void sortStudentsByAverage(String[] students, double[] averages, double[][] grades) {
        for (int i = 0; i < averages.length - 1; i++) {
            for (int j = 0; j < averages.length - i - 1; j++) {
                if (averages[j] < averages[j + 1]) {
                    // Swap
                    double tempAvg = averages[j]; averages[j] = averages[j + 1]; averages[j + 1] = tempAvg;
                    String tempName = students[j]; students[j] = students[j + 1]; students[j + 1] = tempName;
                    double[] tempGrades = grades[j]; grades[j] = grades[j + 1]; grades[j + 1] = tempGrades;
                }
            }
        }

        System.out.println("\nSorted by Average Score:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + "\t\t" + averages[i]);
        }
    }
}
