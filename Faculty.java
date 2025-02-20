import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Faculty extends Person {
    private int facultyID;
    private String department;
    private String position;
    private String officeLocation;
    private Date hireDate;
    private boolean availability;
    private List<Course> coursesTaught;

    public Faculty(String fullName, String address, String phone, String email, int ID, int age, Date dateOfBirth,
                   int facultyID, String department, String position, String officeLocation, Date hireDate, boolean availability) {
        super(fullName, address, phone, email, ID, age, dateOfBirth);
        this.facultyID = facultyID;
        this.department = department;
        this.position = position;
        this.officeLocation = officeLocation;
        this.hireDate = hireDate;
        this.availability = availability;
        this.coursesTaught = new ArrayList<>();
    }

    public Faculty(String fullName, String email, int ID, int age, int facultyID) {
        super(fullName, email, ID, age);
        this.facultyID = facultyID;
        this.department = "N/A";
        this.position = "N/A";
        this.officeLocation = "N/A";
        this.hireDate = new Date();
        this.availability = false;
        this.coursesTaught = new ArrayList<>();
    }

    public int getFacultyID() { return facultyID; }
    public void setFacultyID(int facultyID) { this.facultyID = facultyID; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public String getOfficeLocation() { return officeLocation; }
    public void setOfficeLocation(String officeLocation) { this.officeLocation = officeLocation; }

    public Date getHireDate() { return hireDate; }
    public void setHireDate(Date hireDate) { this.hireDate = hireDate; }

    public boolean isAvailable() { return availability; }
    public void setAvailability(boolean availability) { this.availability = availability; }

    public ArrayList<Course> getCoursesTaught() {
        return coursesTaught;
    }

    public void changeAvailabilityStatus(boolean status) {
        this.availability = status;
        System.out.printf("%s %s is now %s.%n", this.position, this.getFullName(), status ? "available" : "unavailable");
    }

    public void assignCourse(Course course) {
        if (course == null) {
            System.out.println("Invalid course. Cannot assign null.");
            return;
        }
        if (!coursesTaught.contains(course)) {
            coursesTaught.add(course);
            System.out.println("\"" + course.getName() + "\" has been assigned to " + this.getFullName());
        } else {
            System.out.println(this.getFullName() + " is already assigned to \"" + course.getName() + "\"");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
          .append("\nFaculty ID: ").append(facultyID)
          .append("\nDepartment: ").append(department)
          .append("\nPosition: ").append(position)
          .append("\nOffice: ").append(officeLocation)
          .append("\nHire Date: ").append(hireDate)
          .append("\nAvailability: ").append(availability ? "Available" : "Unavailable")
          .append("\nCourses Taught: ");
        
        if (coursesTaught.isEmpty()) {
            sb.append("None");
        } else {
            for (Course course : coursesTaught) {
                sb.append("\n - ").append(course.getName());
            }
        }
        
        return sb.toString();
    }
}
