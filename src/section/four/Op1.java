package section.four;

public class Op1 {
    public static void main(String[] args) {
        //  변수 초기화
        int a = 5;
        int b = 2;

        //  덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 곱셈
        int div = a / b;// => 몫 2가 변수에 저장된다. int는 소수점을 표현할 수 없다.
        System.out.println("a / b = " + div);

        // 나머지
        int mod = a % b; // => 나머지인 1이 저장된다.
        System.out.println("a % b = " + mod);

        // 0 나누기
        // int div0 = a / 0; // =>  [/ by zero] 라는 예외가 발생한다.
        // System.out.println("a / 0 = " + div0);  // => 예외가 발생하고 나면 이후는 실행되지 않고, 멈추게 된다.
    }
}
