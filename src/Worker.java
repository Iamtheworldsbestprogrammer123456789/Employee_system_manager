public class Worker extends Employee {
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print("Hej Worker, här har du en meny på vad du kan göra:");
        System.out.println();
    }
}
