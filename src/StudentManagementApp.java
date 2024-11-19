package src;
import java.util.ArrayList;
import java.util.List;

public class StudentManagementApp {
    private List<Student> students; // Using an ArrayList to store students

    // Constructor
    public StudentManagementApp() {
        students = new ArrayList<>();
    }

    // Method to add a student
    public void addStudent(String name, Integer id, Double[] grades) {
        Student student = new Student(name, id, grades);
        students.add(student);
        System.out.println("Student added: " + name);
    }

    // Method to display all students
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        for (Student student : students) {
            student.displayStudentInfo();
            System.out.println("-------------");
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create the student management application
        StudentManagementApp app = new StudentManagementApp();

        // Sample data for testing
        Double[] grades1 = {90.5, 85.0, 88.0};
        Double[] grades2 = {76.5, 80.0, 72.0, null}; // Contains a null grade
        Double[] grades3 = {}; // Empty grades array
        Double[] grades4 = {null, null}; // Array with all nulls

        // Adding students
        app.addStudent("Alice Johnson", 101, grades1);
        app.addStudent("Bob Smith", 102, grades2);
        app.addStudent("Carol Williams", 103, grades3);
        app.addStudent("David Brown", 104, grades4);

        // Display all students
        System.out.println("\nDisplaying All Students:");
        app.displayAllStudents();
    }
}
