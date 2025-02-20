public class Email {
    // fields 
    private String email;
    private String password;

    // constructor
    public Email(String email, String password){
        this.email = email;
        this.password = password;
    }

    // getter methods
    public String getEmail() {
        return email;
    }

    // setter methods
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Email [email=" + email + ", password=" + password + "]";
    }

   
}
