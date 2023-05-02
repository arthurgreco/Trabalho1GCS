import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner (System.in);

        int km = in.nextInt();

        if (km > 0) {
            int tempo;
            tempo = km * 2;
            System.out.println("Minutos " + tempo);
        } else {
            System.out.println("Minutos 0");
        }
    }
}
