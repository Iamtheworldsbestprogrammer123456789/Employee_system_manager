public class Manager extends Admin {
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print("Hej Manager, här har du en meny på vad du kan göra:");
        System.out.println();
        System.out.println("1. Ändra ditt lösenord");
        System.out.println("2. Lägg till Employee");
        System.out.println("3. Ta bort Employee");
        System.out.println("4. Byt en employees position");
        System.out.println("5. Logga ut");
    }
}
