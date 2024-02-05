public class tryCatch {
    public static int try_catch_int() {

        int tal = 0;

        try {
            tal = Main.scan.nextInt();
            //om inputen är mottagbar så sparas den och skippar catch
        } catch (Exception e) {
            //om det inte är en acceptabel input printas det och metoden kallas sig själv igen
            System.out.print("Ange en siffra!\n: ");
            Main.scan.nextLine();
            try_catch_int();
        }

        return tal;
    }
}
