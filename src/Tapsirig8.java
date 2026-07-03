public class Tapsirig8 {
    public static void main(String[] args) {

        int c1 = 0;
        int c2 = 100;
        int c3 = 37 ;

        // Səhv
        double wrongF1 = c1 * 9 / 5 + 32;
        double wrongF2 = c2 * 9 / 5 + 32;
        double wrongF3 = c3 * 9 / 5 + 32;

        // Düzgün
        double f1 = c1 * 9.0 / 5 + 32;
        double f2 = c2 * 9.0 / 5 + 32;
        double f3 = c3 * 9.0 / 5 + 32;

        System.out.println("0°C  -> " + wrongF1 + " (int bölmə) ");
        System.out.println("100°C  -> " + wrongF2 + " (int bölmə) ");
        System.out.println("37  -> " + wrongF3 + " (int bölmə) ");

        System.out.println("0°C  -> " + f1 + " (double bölmə)");
        System.out.println("100°C  -> " + f2 + " (double bölmə)");
        System.out.println("37  -> " + f3 + " (double bölmə) ");






    }
}
