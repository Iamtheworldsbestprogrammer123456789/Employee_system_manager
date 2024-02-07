public class LogInSystem {
    LogIn loginInstance = new LogIn();

    //genererar ett random employee id
    public int generateEmployeeID() {
        // Genererar ett random int värde med 9 siffror från 100000000 till 999999999
        int random_int = (int) Math.floor(Math.random() * (999999999 - 100000000 + 1) + 100000000);
        return random_int;
    }

    //Denna klass tar ett employeeid och ändrar positionen kopplad till det IDt
    public void changeEmployeePosition() {


    }

    //En meny som kommer upp när man ska lägga till en postion till en employee. Används när en employee görs
    public void addPosition() {
        System.out.println("Välj position:");
        System.out.println("1. Intern");
        System.out.println("2. Worker");
        System.out.println("3. Admin");
        System.out.println("4. Manager");
        int val = tryCatch.try_catch_int();
        if (val == 1) {
            LogIn.position.add("Intern");
        } else if (val == 2) {
            LogIn.position.add("Worker");
        } else if (val == 3) {
            LogIn.position.add("Admin");
        } else if (val == 4) {
            LogIn.position.add("Manager");
        } else {
            addPosition();
        }
    }

    //Lägger till ett viss antal anställda. För alla nya employees genereras ett random ID och de får ett defult lösenord som går att ändra
    public void addEmployee(int antal) {

        for (int i = 0; i < antal; i++) {
            LogIn.employeeID.add(generateEmployeeID());
            LogIn.password.add("P4ssw0rd");
            addPosition();
        }
    }

    public void changePassword() {

    }


    //Tar bort en anställd från systemet
    public void deleteEmployee(int employeeID) {
        LogIn.employeeID.remove(loginInstance.getEmployeeID(employeeID));
        LogIn.password.remove(loginInstance.getEmployeeID(employeeID));
    }
}

