import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        LogIn login = new LogIn();
        LogInSystem logInSystem = new LogInSystem();
        logInSystem.addEmployee(5);
        System.out.println(LogIn.employeeID);
        System.out.println(LogIn.password);
        System.out.println(LogIn.position);
        login.logIn();

    }
}


