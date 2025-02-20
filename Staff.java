import java.util.ArrayList;
import java.util.Date;


public class Staff extends Person {
    private double salary;
    private String status;
    private String role;
    private String officeNumber;
    private String department;
    private ArrayList<Room> assignedRooms;

    public Staff(String fullName, String gender, String phone, String email, int age, int ID, Date dateOfBirth,
                 double salary, String status, String role, String officeNumber, String department, 
                 ArrayList<Room> assignedRooms) {
        super(fullName, gender, phone, email,ID, age, dateOfBirth);
        this.salary = Math.max(salary, 0); 
        this.status = status;
        this.role = role;
        this.officeNumber = officeNumber;
        this.department = department;
        this.assignedRooms = assignedRooms != null ? assignedRooms : new ArrayList<>();
    }

    public Staff(String fullName, int id, int age, String email, String status, String role, String department) {
        super(fullName,email, id, age);
        this.status = status;
        this.role = role;
        this.department = department;
        this.assignedRooms = new ArrayList<>();
    }

  

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Error: Salary must be positive.");
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department != null && !department.isEmpty()) {
            this.department = department;
        } else {
            System.out.println("Error: Department cannot be empty.");
        }
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public void assignRoom(Room room) {
        if (room != null && !assignedRooms.contains(room)) {
            assignedRooms.add(room);
            System.out.println("Room " + room.getID() + " assigned to " + getFullName());
        } else {
            System.out.println("Error: Room is either null or already assigned.");
        }
    }

    public void removeRoom(Room room) {
        if (assignedRooms.contains(room)) {
            assignedRooms.remove(room);
            System.out.println("Room " + room.getID() + " removed from " + getFullName());
        } else {
            System.out.println("Error: Room not found in assigned rooms.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nStatus: " + status + 
               "\nRole: " + role + 
               "\nOffice Number: " + (officeNumber != null ? officeNumber : "N/A") + 
               "\nDepartment: " + department + 
               "\nSalary: $" + salary + 
               "\nNumber of Assigned Rooms: " + assignedRooms.size();
    }
}
