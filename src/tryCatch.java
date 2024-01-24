public class tryCatch {
    public static int try_catch_int() {

        int tal = 0;
        while (true) {
            try {
                tal = Main.scan.nextInt();
                //om inputen är mottagbar så sparas den och sedan breakar den ut ur while loopen
                break;
            } catch (Exception e) {
                //om det inte är en acceptabel input printas det och while loopen börjar om
                System.out.print("Ange en siffra!\n: ");
                Main.scan.nextLine();
            }
        }
        return tal;
    }
}
