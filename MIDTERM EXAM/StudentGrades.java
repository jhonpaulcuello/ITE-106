import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        String[] names = new String[n];
        double[] avgs = new double[n];
        double total = 0, max = 0, min = 100;

        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + " name: ");
            names[i] = sc.next();
            avgs[i] = getAvg(sc);
            total += avgs[i];
            max = Math.max(max, avgs[i]);
            min = Math.min(min, avgs[i]);
        }

        for (int i = 0; i < n; i++) 
            System.out.println(names[i] + ": Avg = " + avgs[i] + ", Grade = " + getGrade(avgs[i]));

        System.out.println("\nClass avg: " + (total / n) + ", Max: " + max + ", Min: " + min);
        sc.close();
    }

    private static double getAvg(Scanner sc) {
        double quiz = getScore(sc, "Quiz"), hw = getScore(sc, "Homework"), exam = getScore(sc, "Exam");
        return quiz * 0.2 + hw * 0.3 + exam * 0.5;
    }

    private static double getScore(Scanner sc, String type) {
        System.out.print(type + " score: ");
        return sc.nextDouble();
    }

    private static char getGrade(double avg) {
        return avg >= 90 ? 'A' : avg >= 80 ? 'B' : avg >= 70 ? 'C' : avg >= 60 ? 'D' : 'F';
    }
}
