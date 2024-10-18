import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentGradebookFileIO {
    public static void main(String[] args) {
        List<String> records = readFile("student_data.txt");
        List<String> grades = calculateGrades(records);
        writeFile("student_grades.txt", grades);
        System.out.println("Grades saved to student_grades.txt");
    }

    public static List<String> readFile(String path) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) lines.add(line);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return lines;
    }

    public static List<String> calculateGrades(List<String> records) {
        List<String> results = new ArrayList<>();
        results.add("Name              Quiz1 Quiz2 Homework1 Midterm Final Average Grade");

        for (String record : records) {
            String[] fields = record.split(",");
            double total = 0;
            for (int i = 1; i < fields.length; i++) total += Double.parseDouble(fields[i].trim());
            double avg = total / (fields.length - 1);
            results.add(String.format("%-17s %5s %5s %8s %7s %5s %7.2f %5c", fields[0].trim(), fields[1], fields[2], fields[3], fields[4], fields[5], avg, getLetterGrade(avg)));
        }
        return results;
    }

    public static void writeFile(String path, List<String> data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : data) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static char getLetterGrade(double avg) {
        return (avg >= 90) ? 'A' : (avg >= 80) ? 'B' : (avg >= 70) ? 'C' : (avg >= 60) ? 'D' : 'F';
    }
}
