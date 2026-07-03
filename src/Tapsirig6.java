public class Tapsirig6 {
    public static void main(String[] args) {

        int a = 17;
        int b = 5;

        System.out.println("Toplama: " + (a + b));
        System.out.println("Çıxma: " + (a - b));
        System.out.println("Vurma: " + (a * b));
        System.out.println("Bölmə: " + (a / b));
        System.out.println("Qalıq: " + (a % b));

        System.out.println("Bölmə (ondalıqla): " + (double) a / b);  // int / int = int olduğu üçün 17 / 5 = 3 olur, double-a çevirdikdə nəticə 3.4 alınır

    }
}
