public class Tapsirig9 {
    public static void main(String[] args){


        int sayi1 = 583;
        int yuzler1 = sayi1 / 100;
        int onlar1 = (sayi1 % 100) / 10;
        int birler1 = sayi1 % 10;

        int cem1 = yuzler1 + onlar1 + birler1;

        System.out.println("Ədəd: " + sayi1);
        System.out.println("Yüzlər: " + yuzler1);
        System.out.println("Onlar: " + onlar1);
        System.out.println("Birlər: " + birler1);
        System.out.println("Rəqəmlərin cəmi: " + cem1);


        int sayi2 = 907;
        int yuzler2 = sayi2 / 100;
        int onlar2 = (sayi2 % 100) / 10;
        int birler2 = sayi2 % 10;

        int cem2 = yuzler2 + onlar2 + birler2;

        System.out.println("Ədəd: " + sayi2);
        System.out.println("Yüzlər: " + yuzler2);
        System.out.println("Onlar: " + onlar2);
        System.out.println("Birlər: " + birler2);
        System.out.println("Rəqəmlərin cəmi: " + cem2);

    }
}
