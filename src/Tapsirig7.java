public class Tapsirig7 {
    public static void main(String[] args) {

        double mebleg = 8000.0;
        double illikFaiz = 15.0;
        int muddet = 12;


        double umumiFaiz = mebleg * (illikFaiz / 100);
        double umumiOdenis = mebleg + umumiFaiz;
        double ayliqOdenis = umumiOdenis / muddet;

        System.out.println("Ümumi faiz: " + umumiFaiz);
        System.out.println("Ümumi ödəniş: " + umumiOdenis);
        System.out.println("Aylıq ödəniş: " + ayliqOdenis);


    }
}
