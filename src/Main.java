import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.addEmployee(2);
        System.out.println("Employee id: " + LogIn.employeeID);
        System.out.println("Password: " + LogIn.password);
    }
}

