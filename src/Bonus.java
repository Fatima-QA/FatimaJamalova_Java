public class Bonus {
    public static void main (String[] args) {

     String musteriadi = "Fatimə Camalova";
     int yas = 22;
     double ayliqGeliri = 5000.0;
     double kreditMeblegi = 10000.0;
     int kreditMuddeti = 36;
     double illikFaiz = 10.9;
     boolean kreditTarixi = true;


     System.out.println("Müştəri adı: " + musteriadi);
     System.out.println("Yaşı: " + yas);
     System.out.println("Aylıq gəliri: " + ayliqGeliri);
     System.out.println("Kredit məbləği: " + kreditMeblegi);
     System.out.println("Kredit  müddəti: " + kreditMuddeti);
     System.out.println("İllik faiz: " + illikFaiz);
     System.out.println("Kredit tarixi: " + kreditTarixi);

     double umumiFaiz = kreditMeblegi * illikFaiz / 100;
     double ayliqOdenis = (kreditMeblegi + umumiFaiz) / kreditMuddeti;
     double gelireNisbet = (ayliqOdenis / ayliqGeliri) * 100;

     System.out.println("Ümumi faiz: " + umumiFaiz);
     System.out.printf("Aylıq ödəniş: %.2f%n", ayliqOdenis);
     System.out.printf("Gəlirə nisbət: %.2f%%%n", gelireNisbet);

     boolean yasSerti = (yas >= 21 && yas <= 65);
     boolean gelirSerti = (ayliqGeliri > 800);
     boolean meblegSerti = (kreditMeblegi >= 300 && kreditMeblegi <= 50000);
     boolean nisbetSerti = (gelireNisbet < 40);

        boolean kreditTesdiqi = yasSerti && gelirSerti && meblegSerti && nisbetSerti && kreditTarixi;
        System.out.println("Yaş şərti: " + yasSerti);
        System.out.println("Gəlir şərti: " + gelirSerti);
        System.out.println("Məbləğ şərti: " + meblegSerti);
        System.out.println("Gəlirə nisbət < 40%: " + nisbetSerti);
        System.out.println("Kredit tarixi: " + kreditTarixi);
        System.out.println("Kredit TƏSDİQLƏNİR: " + kreditTesdiqi);







    }
}
