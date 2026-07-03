public class Tapsirig16 {
    public static void main(String[] args) {

        String metn = " Salam, ABB Bank! ";

        // 1. Uzunluq (trim-siz)
        System.out.println("Uzunluq (trim-siz): " + metn.length());

        // 2. trim sonra uzunluğu
        System.out.println("Uzunluq (trim): " + metn.trim().length());

        // 3. Böyük hərflə
        System.out.println("Böyük hərf: " + metn.trim().toUpperCase());

        // 4. Kiçik hərflə
        System.out.println("Kiçik hərf: " + metn.trim().toLowerCase());

        // 5.  "ABB" var mi? (boolean)
        System.out.println("ABB var mi?: " + metn.trim().contains("ABB"));

        // 6. "bank" var mı?
        System.out.println("bank var? " + metn.trim().contains("bank"));

        // 7.  "Bank"-ı "Kredit"-lə əvəz et
        System.out.println("Replace: " + metn.trim().replace("Bank", "Kredit"));

        // 8. startsWith
        System.out.println("Salam ilə başlayır? " + metn.trim().startsWith("Salam"));






    }
}
