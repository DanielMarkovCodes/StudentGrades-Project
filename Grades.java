// ************************************************************
// Grades.java
//
// Use Student class to get test grades for two students
// and compute averages
//
// ************************************************************

public class Grades {
    public static void main(String[] args) {
        Student student1 = new Student("Mary");
        Student student2 = new Student("Mike");

        // Input grades for Mary
        student1.inputGrades();

        // Print average for Mary
        System.out.println("Average for " + student1.getName() + ": " + student1.getAverage());

        System.out.println();

        // Input grades for Mike
        student2.inputGrades();

        // Print average for Mike
        System.out.println("Average for " + student2.getName() + ": " + student2.getAverage());
    }
}





