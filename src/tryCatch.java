public class tryCatch {
    //Denna metod och klass gör det lättare att lägga till kod där man ska få in ett tal. Klassen kollar så att inputen är valid och inte krashar systemet.
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
