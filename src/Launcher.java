public class Launcher {
    public static void main(String[] args) {
        System.out.println("Bienvenue");
        java.util.Scanner entree = new java.util.Scanner(System.in);
        System.out.println("Entrée du text");
        String text = entree.next();
        if (!text.equals("quit"))
            System.out.println("Unknown command");
    }
}