public class Tapsirig14 {
    public static void main(String[] args) {
        int n = 84;

        boolean cut = (n % 2 ==0 );
        boolean musbet = (n > 0 );
        boolean uceBolunur = (n % 3 ==0 );
        boolean yeddiyeBolunur = ( n % 7 ==0);
        boolean ucVeyeddiye = (n % 3 ==0 ) && (n % 7 ==0);
        boolean araliq = ( n > 10 && n < 100);

        System.out.println("n = " + n);
        System.out.println("Cüt? " + cut);
        System.out.println("Müsbət? " + musbet);
        System.out.println("3-ə bölünür? " + uceBolunur);
        System.out.println("7-yə bölünür? " + yeddiyeBolunur);
        System.out.println("Həm 3-ə, həm də 7-yə bölünür? " + ucVeyeddiye);
        System.out.println("10-dan böyük, 100-dən kiçik? " + araliq);

        int n1 = 105;

        boolean cut1 = (n1 % 2 ==0 );
        boolean musbet1 = (n1 > 0 );
        boolean uceBolunur1 = (n1 % 3 ==0 );
        boolean yeddiyeBolunur1 = ( n1 % 7 ==0);
        boolean ucVeyeddiye1 = (n1 % 3 ==0 ) && (n1 % 7 ==0);
        boolean araliq1 = ( n1 > 10 && n1 < 100);

        System.out.println("n1 = " + n1);
        System.out.println("Cüt? " + cut1);
        System.out.println("Müsbət? " + musbet1);
        System.out.println("3-ə bölünür? " + uceBolunur1);
        System.out.println("7-yə bölünür? " + yeddiyeBolunur1);
        System.out.println("Həm 3-ə, həm də 7-yə bölünür? " + ucVeyeddiye1);
        System.out.println("10-dan böyük, 100-dən kiçik? " + araliq1);





    }
}
