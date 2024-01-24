import java.util.ArrayList;
import java.util.Scanner;

public class LoginSys {
    public static final Scanner scan = new Scanner(System.in);
    public ArrayList<Admin> admins = new ArrayList<>();

    public LoginSys() {
        // genrateData();
        login();
        admins.add(new Admin());
        admins.add(new Admin());
        admins.add(new Admin());
        createPosition();
    }


    public void createPosition() {

        System.out.println("Välj position:");
        System.out.println("1. Intern");
        System.out.println("2. Worker");
        System.out.println("3. Admin");
        System.out.println("4. Manager");
        int val = tryCatch.try_catch_int();
        if (val == 1) {
            LogIn.position.add("intern");
        } else if (val == 2) {
            LogIn.position.add("Worker");
        } else if (val == 3) {
//            if current user is admin --> allow
//sout all admins
//Which admin do yu want to change

        } else if (val == 4) {
            LogIn.position.add("Manager");
        } else {
            addPosition();
        }
    }
}
