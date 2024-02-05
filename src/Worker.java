public class Worker extends Employee {
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("2. Byt intern EmployeeID");
        System.out.println("3. Logga ut");
    }
}
