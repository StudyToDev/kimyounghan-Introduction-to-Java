package section.four;

public class Op2 {
    public static void main(String[] args) {
        // 문자열과 문자열 더하기 (1)
        String strSum1 = "hello" + "world";
        System.out.println(strSum1);

        // 문자열과 문자열 더하기 (2)
        String str1 = "String1";
        String str2 = "String2";
        String strSum2 = str1 + str2;
        System.out.println(strSum2);

        // 문자열과 숫자 더하기 (1)
        String strIntSum1 = "a + b = " + 10;
        System.out.println(strIntSum1);

        // 문자열과 숫자 더하기 (2)
        int num = 20;
        String str3 = "a + b = ";
        String strIntSum2 = str3 + num;
        System.out.println(strIntSum2);
    }
}
