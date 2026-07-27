import java.util.Scanner;

public class Employee {
    private String name;
    private String username;
    private String email;
    private String password;

    // JP Create toString method
    @Override
    public String toString(){
        return "Employee Details\n" +
                "Name            : " + name + "\n" +
                "Username        : " + username + "\n" +
                "Email           : " + email + "\n" +
                "Initial Password: " + password;
    }
}
