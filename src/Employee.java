import java.util.Scanner;

public class Employee {
    private String name;
    private String username;
    private String email;
    private String password;

    //JP d constructor
    public Employee(){
        name = setName();
        username = setUserName(name);
        email = setEmail(username);
        password = setPassword(username);
    }

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
