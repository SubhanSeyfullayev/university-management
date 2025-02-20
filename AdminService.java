import java.util.ArrayList;
import java.util.Scanner;

public class AdminService {
    
    private ArrayList<Course> courses;
    private StudentService studentService;
    private Scanner sc;

    public AdminService(StudentService studentService) {
        this.courses = new ArrayList<>();
        this.studentService = studentService;
        this.sc = new Scanner(System.in);
    }
    public void addStudent() {
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();
        System.out.print("Enter student GPA: ");
        float gpa = sc.nextFloat();
        System.out.print("Enter student age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter student email: ");
        String email = sc.next();
        
Student student = new Student(name, id, age, gpa, email);
        studentService.students.add(student);
        System.out.println("Student added successfully!");
    }

    public void addCourse() {
     
        System.out.print("Enter course name: ");
        String courseName = sc.nextLine();
        System.out.println("Enter the description");
        String description = sc.nextLine();
        System.out.print("Enter course code: ");
int courseCode = sc.nextInt();
        System.out.print("Enter credit score: ");
        int creditScore = sc.nextInt();
        System.out.println("Enter the max number of Students");
int numberOfStudents = sc.nextInt();
        System.out.print("Enter grade: ");

        char passingGrade = sc.next().charAt(0);
       
        Course course = new  Course(courseName, description, courseCode, creditScore, numberOfStudents,passingGrade, null, null, null );
        courses.add(course);
        studentService.addAvailableCourse(course);
        System.out.println("Course added successfully!");
    }
    public void removeStudent(int studentId) {
        if (studentService.removeStudentById(studentId)) {
            System.out.println("Student removed successfully!");
        } else {
            System.err.println("Student not found!");
        }
    }
}