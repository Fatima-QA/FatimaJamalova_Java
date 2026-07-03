public class Tapsirig17 {
    public static void main(String [] args) {

        String s1 = "test";
        String s2 = "test";
        String s3 = "TEST";

        System.out.println(s1.equals(s2));  //true "test"="test"
        System.out.println(s1.equals(s3));  // false  "test" fərqlidir "TEST" dən
        System.out.println(s1.equalsIgnoreCase(s3));  // true // hərf fərqlərini görmür
        System.out.println(s1.equals("  test  ".trim()));  //true // "test" boşluqları sildi

        // Bonus: bunu da əlavə edib nəticəyə baxın:
        String s4 = new String("test");
        System.out.println(s1 == s2);      //   (s1.equals(s2))  == string müqayisəsi edilmir
        System.out.println(s1 == s4);     //    (s1.equals(s4))


        // Bonus: bunu da əlavə edib nəticəyə baxın:
    }
}
