public class TeacherAssistant extends Student {
    private String courseAssigned;
    private int officeHoursPerWeek;

    public TeacherAssistant(String name, int age, int id, String major, String courseAssigned, int officeHoursPerWeek) {
        super(name, age, id, major);
        this.courseAssigned = courseAssigned;
        this.officeHoursPerWeek = officeHoursPerWeek;
    }

    public int getOfficeHoursPerWeek() {
        return officeHoursPerWeek;
    }

    @Override
    public String toString() {
        return super.toString() + ", Assigned Course: " + courseAssigned + 
               ", Office Hours: " + officeHoursPerWeek + " hours/week";
    }
}
