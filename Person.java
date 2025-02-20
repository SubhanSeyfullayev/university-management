import java.util.Date;

public class Person {

    private String fullName;
    private String phone;
    private String email;
    private int ID;
    private int age;
    private Date dateOfBirth;
    private String address;

    public Person(String fullName, String address, String phone, String email, int ID, int age, Date dateOfBirth2) {

        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.age = age;
        this.ID = ID;
        this.dateOfBirth = dateOfBirth2;
    }

 

    public Person(String fullName, String email, int ID, int age) {
        this.fullName = fullName;
        this.email = email;
        this.ID = ID;
        this.age = age;
    }



    public String getFullName() {
        return fullName;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public int getID() {
        return ID;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }



    @Override
    public String toString() {
        return "Person [fullName=" + fullName + ", phone=" + phone + ", email=" + email + ", ID=" + ID + ", age=" + age
                + ", dateOfBirth=" + dateOfBirth + ", address=" + address + "]";
    }
    

    }

