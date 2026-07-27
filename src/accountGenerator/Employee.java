package accountGenerator;
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
    private int countChars(String str, char targetChar){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == targetChar){
                count ++;
            }
        }
        return count;
    }

    //JP 1-f create setName method
    public String setName() {
        String employeeName;
        //int nameCount = 0;

        while(true){
            System.out.println("Employee full name (First Last): ");
            employeeName = scanner.nextLine();

            //check input
            if(employeeName.matches("^\\S+\\s+\\S+$")){
                break; }
            else {
                System.out.println("Incorrect format for name");
            }

            //nameCount = countChars(employeeName, ' ');
        }
        return employeeName;
    }

    // JP 1-g create setUserName method
    private String setUserName(String name){
        String formatName = name.toLowerCase();
        return formatName.replace(" ", ".");
    }

    // JP 1-h setEmail method
    private String setEmail(String username){
        String[] parts = username.split("\\.");
        char firstNameLetter = parts[0].charAt(0);
        String lastName = parts[1];

        return firstNameLetter + lastName + "@oracleacademy.test";
    }

    // JP 1-i setPassword method
    private String setPassword(String username){
        StringBuilder passwordBuilder;

        //adjust username length to 8 characters
        if ( username.length() > 8 ){
            passwordBuilder = new StringBuilder(username.substring(0, 8)); }
        else {
            passwordBuilder = new StringBuilder(username);
            while (passwordBuilder.length() <= 8 ){
                passwordBuilder.append('*');
            }
        }

        //replace vowels with *
        for (int i = 0; i < passwordBuilder.length(); i++){
            char c = passwordBuilder.charAt(i);
            if ( "aeiou".indexOf(c) != -1){
                passwordBuilder.setCharAt(i, '*');
            }
        }

        //set first aplabet character to uppercase
        for(int i = 0; i <passwordBuilder.length(); i++){
            char c = passwordBuilder.charAt(i);
            if (Character.isLetter(c)){
                passwordBuilder.setCharAt(i, Character.toUpperCase(c));
                break;
            }
        }
        return passwordBuilder.toString();
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
