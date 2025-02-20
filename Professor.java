import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Professor extends Faculty {
    private List<String> coursesTaught;
    private List<String> researchPapers;
    private List<Student> assignedStudents;
    private String phd;  // added phd 
    private String researchInterest; //rscrh interest

    //including phd and research interest
    public Professor(String fullName, String gender, String phone, String email, int age, int ID, Date dateOfBirth,
            double salary, String status, String role, String officeNumber, String department,
            ArrayList<Room> assignedRooms, List<String> coursesTaught, List<String> researchPapers,
            List<Student> assignedStudents, String phd, String researchInterest) {
        super(fullName, gender, phone, email, age, ID, dateOfBirth, salary, status, role, officeNumber, department,
                assignedRooms);
        this.coursesTaught = coursesTaught;
        this.researchPapers = researchPapers;
        this.assignedStudents = assignedStudents;
        this.phd = phd;  // 
        this.researchInterest = researchInterest;
    }

    //method to teach a course
    public void teachCourse(String course) {
        if (course != null && !course.isEmpty()) {
            coursesTaught.add(course);
            System.out.println(getFirstName() + " is now teaching: " + course);
        } else {
            System.out.println("Error: Course name cannot be empty.");
        }
    }

    //to publish a research paper
    public void publishResearch(String paperTitle) {
        if (paperTitle != null && !paperTitle.isEmpty()) {
            researchPapers.add(paperTitle);
            System.out.println(getFirstName() + " published a new research paper: " + paperTitle);
        } else {
            System.out.println("Error: Research paper title cannot be empty.");
        }
    }

    // Method to assign a TA to a course
    public void assignTA(TeachingAssistant ta, String course) {
        if (ta != null && course != null && !course.isEmpty()) {
            System.out.println("Professor " + getFirstName() + " assigned " + ta.getFirstName() + " as a TA for " + course);
            ta.assignToCourse(course);
        } else {
            System.out.println("Error: TA or course is invalid.");
        }
    }

    public void defendDissertation() {
        if ("PhD".equals(phd)) {  
            System.out.println(getFirstName() + " is defending their dissertation in " + researchInterest + ".");
        } else {
            System.out.println(getFirstName() + " has not completed a dissertation defense.");
        }
    }

}
