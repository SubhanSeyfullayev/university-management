import java.util.List;

public class BachelorStudent extends Student {
    private String thesisTitle;
    private boolean internshipCompleted;

    public BachelorStudent(String name, int id, int coursesCovered, double cgpa, String major, List<String> subjects,
            boolean onProbation, int semester, String thesisTitle, boolean internshipCompleted) {
        super(name, id, coursesCovered, cgpa, major, subjects, onProbation, semester);
        this.thesisTitle = thesisTitle;
        this.internshipCompleted = internshipCompleted;
    }

    public BachelorStudent(String name, int id) {
        super(name, id);
        this.thesisTitle = "Not Assigned";
        this.internshipCompleted = false;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    public boolean isInternshipCompleted() {
        return internshipCompleted;
    }

    public void setInternshipCompleted(boolean internshipCompleted) {
        this.internshipCompleted = internshipCompleted;
    }

    public void displayBachelorInfo() {
        super.getStudentInfo();
        System.out.println("Thesis Title: " + thesisTitle);
        System.out.println("Internship Completed: " + (internshipCompleted ? "Yes" : "No"));
    }

    @Override
    public String toString() {
        return super.toString() + ", Thesis Title: " + thesisTitle + ", Internship: "
                + (internshipCompleted ? "Yes" : "No");
    }

    public static void main(String[] args) {
        System.out.println("h");
    }
}
