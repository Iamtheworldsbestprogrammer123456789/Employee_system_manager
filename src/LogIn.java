import java.util.ArrayList;

public class LogIn {
    //Dessa två Array listor lagrar all inloggnings information
    ArrayList<Employee> emps = new ArrayList<Employee>();
    protected static ArrayList<Integer> employeeID = new ArrayList<>();
    protected static ArrayList<String> password = new ArrayList<>();
    protected static ArrayList<String> position = new ArrayList<>();

    //Validerar så att EmployeeID och password som tas in i metoden stämmer med det som är i array listorna
    public boolean validate(int employeeID, String password) {
        if (this.employeeID.contains(employeeID) && this.password.contains(password)) {
            return true;
        } else {
            return false;
        }
    }


    public boolean logIn(int employeeID, String password) {
        //kollar så att platsen i arrayen som employee är i stämmer igen med samma plats i password
        if (this.password.get(getEmployeeID(employeeID)) == password) {
            return true;
        } else {
            return false;
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
