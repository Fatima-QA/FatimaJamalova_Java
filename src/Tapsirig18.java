public class Tapsirig18 {
    public static void main(String[] args) {

        String tamAd = "leyla hüseynova";
        // Baş hərflər böyük
        String duzeldilmisAd =
                tamAd.substring(0, 1).toUpperCase() +
                        tamAd.substring(1, 6) +
                        tamAd.substring(6, 7).toUpperCase() +
                        tamAd.substring(7);

        System.out.println("Baş hərflər böyük: " + duzeldilmisAd);


        // Ümumi uzunluq
        System.out.println("Uzunluq: " + tamAd.length());

        // İlk 5 hərf
        System.out.println("İlk 5 hərf: " + tamAd.substring(0, 5));

        // Boşluq varmı?
        System.out.println("Boşluq varmı? " + tamAd.contains(" "));

        // "leyla" ilə başlayırmı?
        System.out.println("Ad leyla ilə başlayırmı? " + tamAd.startsWith("leyla"));

        // Tam böyük hərflə
        System.out.println("Böyük hərflə: " + tamAd.toUpperCase());





    }
}
