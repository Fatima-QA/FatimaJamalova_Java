import java.util.Scanner;
import java.util.Locale;

public class Task4_tapsirig8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);


        System.out.print("Celsius (int) daxil et: ");
        int c = scanner.nextInt();

        //Yanlış variant (int / int = int)
        double f1 = c * 9 / 5 + 32;

        System.out.println("\n--- Yanlış variant ---");
        System.out.println("Fahrenheit: " + f1);

        System.out.println("İZAH: 9/5 = 1 (int division), ona görə nəticə yanlış olur.");

        // Doğru variant (double division)
        double f2 = c * 9.0 / 5 + 32;

        System.out.println("\n--- DÜZGÜN variant ---");
        System.out.println("Fahrenheit: " + f2);

        System.out.println("İZAH: 9.0/5 = 1.8 olduğu üçün real nəticə alınır.");

    }
}