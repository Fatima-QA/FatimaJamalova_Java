public class Tapsirig13 {
    public static void main(String [] args) {
         int yas1= 34;
         int ayliqGelir1 = 1500;
         int mebleg1 = 10000;
         boolean tarix1 = true;

         //Müştəri 1
        boolean uygun1 = (yas1 >= 21 && yas1 <= 65) &&
                (ayliqGelir1 > 800) &&
                (mebleg1 >= 300 && mebleg1 <= 50000) &&
                (tarix1);
        System.out.println("Müştəri 1: " + uygun1);

        // Müştəri 2
        int yas2 = 19;
        int ayliqGelir2 = 950;
        int mebleg2 = 3000;
        boolean tarix2 = false;
        boolean uygun2 = (yas2 >= 21 && yas2 <= 65) &&
                (ayliqGelir2 > 800) &&
                (mebleg2 >= 300 && mebleg2 <= 50000) &&
                (tarix2);
        System.out.println("Müştəri 2: " + uygun2 );


        // Müştəri 3
        int yas3 = 45;
        int ayliqGelir3 = 750;
        int mebleg3 = 7000;
        boolean tarix3 = false;
        boolean uygun3 = (yas3 >= 21 && yas3 <= 65) &&
                (ayliqGelir3 > 800) &&
                (mebleg3 >= 300 && mebleg3 <= 50000) &&
                (tarix3);
        System.out.println("Müştəri 3: " + uygun3 );

    }
}
