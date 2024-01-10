import java.util.Random;

public class Employee {
    protected int employeeID;
    protected int password;
    protected String position;

    public void changePassword(){

    }
    //genererar ett random employee id
    public int generateEmployeeID(){
        // Genererar ett random int värde med 9 siffror från 100000000 till 999999999
        int random_int = (int)Math.floor(Math.random() * (999999999 - 100000000 + 1) + 100000000);
        return random_int;
    }
}
