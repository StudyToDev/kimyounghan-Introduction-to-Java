package section.four.add;

public class OpAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        b=++a; // 전위 증감연산자, a의 값을 먼저 증가 시키고, 그 결과를 b에 대입해라
        System.out.println("a = " + a +  " | b = " + b); // 둘 다 2가 됨
        /*
        a=a+1;
        b=a;
        와 동일
         */

        a=0; // a값을 0으로 지정
        a=b++; // 후위 증감 연산자, a에 b를 대입하고 b의 값을 증감
        System.out.println("a = " + a +  " | b = " + b); // a는 2, b는 3
        /*
        a=b;
        a=a+1;
        와 동일
         */
    }
}
