package section.four.comp.logical;

public class OpLogical2 {
    public static void main(String[] args) {
        int a = 15;

        // a는 10보다 크고, 20보다 작다
        boolean result = a > 10 && a < 20; // 비교 먼저 하고 논리 연산을 한다

        System.out.println("result = " + result );


        boolean result1 = 10 < a && a < 20;
        System.out.println("result1 = " + result1 );

    }
}
