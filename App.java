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
        //1004
        int val1,val2,prod;
        System.out.println("Problema 1004");
        System.out.println("informe os valores");
        System.out.println("primeiro:");
        val1 = in.nextInt();
        System.out.println("Segundo:");
        val2 = in.nextInt();
        prod = val1 * val2;
        System.out.println("Produto: " + prod);
    }
}
