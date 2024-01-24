public class Admin extends Employee {
    LogIn loginInstance = new LogIn();

    public void changeEmployeeID() {

    }

    public void changeEmployeePosition() {


    }

    //Lägger till ett viss antal anställda
    public void addEmployee(int antal) {

        for (int i = 0; i < antal; i++) {
            LogIn.employeeID.add(generateEmployeeID());
            LogIn.password.add("P4ssw0rd");
        }
    }

    //Tar bort en anställd från systemet
    public void deleteEmployee(int employeeID) {
        LogIn.employeeID.remove(loginInstance.getEmployeeID(employeeID));
        LogIn.password.remove(loginInstance.getEmployeeID(employeeID));
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("hello Admin");
    }
}

