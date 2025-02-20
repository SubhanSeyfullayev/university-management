
import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    public ArrayList<Student> students;
    private Scanner sc;
    private ArrayList<Student.Course> availableCourses;

    public StudentService() {
        this.students = new ArrayList<>();
        this.sc = new Scanner(System.in);
        this.availableCourses = new ArrayList<>();
    }

    // Find Student by ID
    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getID() == id) {
                return student;
            }
        }
        System.err.println("Student not found!");
        return null;
    }

    // Enroll Student in a Course
    public void enrollStudentInCourse(int studentId) {
        Student student = getStudentById(studentId);
        if (student != null) {
            if (availableCourses.isEmpty()) {
                System.out.println("No available courses to enroll in.");
                return;
            }
            System.out.println("Available courses:");
            for (int i = 0; i < availableCourses.size(); i++) {
                System.out.println((i + 1) + ". " + availableCourses.get(i).getName());
            }
            System.out.print("Choose a course number to enroll: ");
            int choice = sc.nextInt();
            if (choice > 0 && choice <= availableCourses.size()) {
                student.addCourse(availableCourses.get(choice - 1));
                System.out.println("Successfully enrolled in the course!");
            } else {
                System.err.println("Invalid choice!");
            }
        }
    }
    public void withdrawStudentFromCourse(int studentId, int courseId) {
        Student student = getStudentById(studentId);
        if (student != null) {
            student.withdrawFromCourse(courseId);
        }
    }

    public void printStudentInfo(int studentId) {
        Student student = getStudentById(studentId);
        if (student != null) {
            student.toString();
        }
    }

    public float calculateStudentGPA(int studentId) {
        Student student = getStudentById(studentId);
        if (student != null) {
            return (float) student.calculateGPA();
        }
        return 0.0f;
    }

    public boolean removeStudentById(int studentId) {
        return students.removeIf(student -> student.getID() == studentId);
    }

    public void addAvailableCourse(Course course) {

    }

}
