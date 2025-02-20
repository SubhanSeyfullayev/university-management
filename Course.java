import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private String description;
    private int courseCode;
    private int credits;
    private int numberOfStudents;
    private char passingGrade;
    private String[] studentNames;
    private String[] topics;
    private int[] prerequisiteCourses;
    private List<Course> courses = new ArrayList<>();

    public Course() {

    }

    public Course(String name, String description, int courseCode, int credits, int numberOfStudents,
            char passingGrade, String[] studentNames, String[] topics, int[] prerequisiteCourses) {
        this.name = name;
        this.description = description;
        this.courseCode = courseCode;
        this.credits = credits;
        this.numberOfStudents = numberOfStudents;
        this.passingGrade = passingGrade;
        this.studentNames = studentNames;
        this.topics = topics;
        this.prerequisiteCourses = prerequisiteCourses;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course{")
                .append("name='").append(name).append('\'')
                .append(", description='").append(description).append('\'')
                .append(", courseCode=").append(courseCode)
                .append(", credits=").append(credits)
                .append(", numberOfStudents=").append(numberOfStudents)
                .append(", passingGrade=").append(passingGrade)
                .append('}');
        return sb.toString();
    }

    public List<Course> getCourses() {
        return this.courses;
    }

    public void setCourse(List<Course> courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public char getPassingGrade() {
        return passingGrade;
    }

    public void setPassingGrade(char passingGrade) {
        this.passingGrade = passingGrade;
    }
    
    public void setStudentNames(String[] studentNames) {
        this.studentNames = studentNames;
    }
    
    public String[] getStudentNames() {
        return studentNames;
    }

    public void setTopics(String[] topics) {
        this.topics = topics;
    }
    
    public String[] getTopics() {
        return topics;
    }

    public void setPrerequisiteCourses(int[] prerequisiteCourses) {
        this.prerequisiteCourses = prerequisiteCourses;
    }
    
    public int[] getPrerequisiteCourses() {
        return prerequisiteCourses;
    }
        
    

    public List<Course> addCourse(String name, String description, int courseCode, int credits, int numberOfStudents,
            char passingGrade) {
        Course course = new Course(name, description, courseCode, credits, numberOfStudents, passingGrade, studentNames, topics, prerequisiteCourses);
        courses.add(course);
        System.out.println(courses);
        return courses;
    }

}
