package src;

public class Student {
    private String name;
    private Integer id;  // Wrapper class for an integer ID
    private Double[] grades;  // Array of grades using Double wrapper class

    // Constructor
    public Student(String name, Integer id, Double[] grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    // Method to calculate the average grade
    public Double calculateAverage() {
        if (grades == null || grades.length == 0) {
            System.out.println("No grades available for student ID: " + id);
            return null;
        }
        double sum = 0.0;
        for (Double grade : grades) {
            sum += (grade != null) ? grade : 0; // Handle null grades gracefully
        }
        return sum / grades.length;
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.print("Grades: ");
        for (Double grade : grades) {
            System.out.print((grade != null ? grade : "N/A") + " ");
        }
        System.out.println("\nAverage Grade: " + (calculateAverage() != null ? calculateAverage() : "N/A"));
    }
}
