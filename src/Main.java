import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Admin admin = new Admin();
        admin.addEmployee(1);
        System.out.println("Employee id: " + LogIn.employeeID);
        System.out.println("Password: " + LogIn.password);
        System.out.println("Position:" + LogIn.position);
    }
}

