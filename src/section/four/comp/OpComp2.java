package section.four.comp;

public class OpComp2 {
    public static void main(String[] args) {
        String str1 = "hi1";
        String str2 = "hi2";

        boolean result1 = "hello".equals("hello");
        boolean result2 = str1.equals("hi1");
        boolean result3 = str1.equals(str2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
