import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.employeeID = employee.generateEmployeeID();
        System.out.println(employee.employeeID);
    }
}

