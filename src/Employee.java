import java.util.Scanner;
// JB 1-b create employee class
public class Employee {
    private String name;
    private String username;
    private String email;
    private String password;

    Scanner scanner = new Scanner(System.in);

    //JP 1-d constructor
    public Employee(){
        name = setName();
        username = setUserName(name);
        email = setEmail(username);
        password = setPassword(username);
    }// end constructor

    //JP 1-e private methode countChars
    private int countChars(String str, char c){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == c){
                count ++;
            }
        }
        return count;
    }

    //JP 1-f create setName method
    public String setName() {
        String employeeName:
        int nameCount = 0;

        do {
            System.out.println("Employee full name (First Last): ");
            employeeName = scanner.nextLine();

            nameCount = countChars(employeeName, ' ');
        } while (nameCount != 1);
    }

    // JP 1-c Create toString method
    @Override
    public String toString(){
        return "Employee Details\n" +
                "Name            : " + name + "\n" +
                "Username        : " + username + "\n" +
                "Email           : " + email + "\n" +
                "Initial Password: " + password;
    }
}
