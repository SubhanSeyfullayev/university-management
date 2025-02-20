
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class TeachingAssistant extends Staff {
    private String[] assignedCourses;
    private int courseCount;
    private static final int MAX_COURSES = 10;
    private Professor supervisor;



  

    public TeachingAssistant(String fullName, String gender, String phone, String email, int age, int ID,
            Date dateOfBirth, double salary, String status, String role, String officeNumber, String department,
            ArrayList<Room> assignedRooms, String[] assignedCourses, int courseCount, Professor supervisor) {
        super(fullName, gender, phone, email, age, ID, dateOfBirth, salary, status, role, officeNumber, department,
                assignedRooms);
        this.assignedCourses = assignedCourses;
        this.courseCount = courseCount;
        this.supervisor = supervisor;
    }

    public TeachingAssistant(String fullName, int id, int age, String email, String status, String role,
            String department, String[] assignedCourses, int courseCount, Professor supervisor) {
        super(fullName, id, age, email, status, role, department);
        this.assignedCourses = assignedCourses;
        this.courseCount = courseCount;
        this.supervisor = supervisor;
    }

    public void assignToCourse(String course) {
        if (courseCount < MAX_COURSES) {
            for (int i = 0; i < courseCount; i++) {
                if (assignedCourses[i].equals(course)) {
                    System.out.println(this.getFullName() + " is already assigned to " + course);
                    return;
                }
            }
            assignedCourses[courseCount++] = course;
            System.out.println(this.getFullName() + " has been assigned to assist with the course: " + course);
        } else {
            System.out.println("Cannot assign more courses. Maximum limit reached.");
        }
    }

    public void removeFromCourse(String course) {
        for (int i = 0; i < courseCount; i++) {
            if (assignedCourses[i].equals(course)) {
                assignedCourses[i] = assignedCourses[courseCount - 1]; // Replace with last element
                assignedCourses[courseCount - 1] = null; // Nullify last element
                courseCount--;
                System.out.println(this.getFullName() + " has been removed from assisting with the course: " + course);
                return;
            }
        }
        System.out.println(this.getFullName() + " was not assigned to " + course);
    }

    public String[] getAssignedCoursesArray() {
        return Arrays.copyOf(assignedCourses, courseCount);
    }

    public void holdOfficeHours() {
        System.out.println(this.getFullName() + " is holding office hours.");
    }

    public void conductLab(String labName) {
        System.out.println(this.getFullName() + " is conducting the lab session: " + labName);
    }

    public void gradeStudent(Student student, double grade) {
        System.out.println(this.getFullName() + " (TA) graded student " + student.getFullName() + " with " + grade);
    }

    @Override
    public String toString() {
        return "Teaching Assistant: " + getFullName() + "\n" +
               "Department: " + getDepartment() + "\n" +
               "Salary: $" + getSalary() + "\n" +
               "Email: " + getEmail() + "\n" +
               "Phone Number: " + getPhone() + "\n" +
               "Office Number: " + getOfficeNumber() + "\n" +
               "Supervisor: " + (supervisor != null ? supervisor.getFullName() : "None") + "\n" +
               "Assigned Courses: " + (courseCount > 0 ? String.join(", ", Arrays.copyOf(assignedCourses, courseCount)) : "None") + "\n";
    }
}
