package Collections.ArrListTask.mappss;

import java.util.HashMap;
import java.util.Map;

public class calculate_avg {
    public static double calculateAverageGrade(String[] studentNames , double[] studentsGrades){
        if (studentNames.length == 0 || studentsGrades.length == 0 || studentNames.length != studentsGrades.length){
            throw new IllegalArgumentException("Invalid input: Student names and grades must have the same non-zero length.");
        }

        Map<String, Double> studentGradesMap = new HashMap<>();
        double sum = 0.0;
        for (int i = 0; i < studentNames.length ; i++) {
            studentGradesMap.put(studentNames[i],studentsGrades[i]);
            sum += studentsGrades[i];
        }

        return sum / studentNames.length;
    }
    public static void main(String[] args) {
        String[] studentNames = {"Marmik","Meet","Himesh" ,"Falgun"};
        double[] studentGrades = {88.0,99.4,87.25,65.57};

        double averageGrade = calculateAverageGrade(studentNames,studentGrades);
        System.out.println("Average grades: " + averageGrade);
    }
}
