public class Admin extends Employee {

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("2. Lägg till Employee");
        System.out.println("3. Ta bort Employee");
        System.out.println("Byt en employee position");
    }
}

