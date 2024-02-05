import java.util.ArrayList;

public class LogIn {
    //Dessa två Array listor lagrar all inloggnings information
    ArrayList<Employee> emps = new ArrayList<Employee>();
    protected static ArrayList<Integer> employeeID = new ArrayList<>();
    protected static ArrayList<String> password = new ArrayList<>();
    protected static ArrayList<String> position = new ArrayList<>();

    //Validerar så att EmployeeID och password som tas in i metoden stämmer med det finns lagrat i array listorna
    public boolean validate(int employeeID, String password) {
        if (this.employeeID.contains(employeeID) && this.password.contains(password)) {
            return true;
        } else {
            return false;
        }
    }

    /*
    Denna metod hanterar själva inlogningen. Den tar in ett employeeid och lösenord från användaren. först används validate metoden
    för att kolla så att Employeeid och lösenordet stämmer igen med va använder angett. Sedan matchar den employeeidet med respektive
    position.
     */
    public void logIn() {
        System.out.println("LOG IN");
        System.out.print("EmployeeID: ");
        int id = tryCatch.try_catch_int();
        Main.scan.nextLine();
        System.out.print("Password: ");
        String pass = Main.scan.nextLine();
        if (validate(id, pass)) {
            if (pass.equals(this.password.get(getEmployeeID(id)))) {
                String tempPosition = position.get(employeeID.indexOf(id));
                if (tempPosition.equals("Intern")) {
                    Intern intern = new Intern();
                    intern.printInfo();
                } else if (tempPosition.equals("Worker")) {
                    Worker worker = new Worker();
                    worker.printInfo();
                } else if (tempPosition.equals("Admin")) {
                    Admin admin = new Admin();
                    admin.printInfo();
                } else if (tempPosition.equals("Manager")) {
                    Manager manager = new Manager();
                    manager.printInfo();
                }
            }

        } else {
            System.out.println("Wrong employeeID or password");
            logIn();
        }
    }

    //hämtar positionen på ett element i arrayen
    public int getEmployeeID(int id) {
        int position;
        position = employeeID.indexOf(id);
        return position;
    }

    //hämtar positionen på ett element i arrayen
    public int getPassword(String id) {
        int position;
        position = password.indexOf(id);
        return position;


    }

}
