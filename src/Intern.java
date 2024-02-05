public class Intern extends Employee {
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print("Hej Intern, här har du en meny på vad du kan göra:");
        System.out.println("");
        System.out.println("1. Byt ditt lösenord");
        System.out.println("2. Logga ut");
    }
}

