package section.four;

public class Op4 {
    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3;
        int sum4 = (2 * 2) + (3 * 3);
        // 괄호를 명시적으로 사용하는 게 더 쉽다. 실무에서는 더 복잡한 연산을 많이 하기 때문이다
        // 유지보수하기에는 코드가 더 많더라도 명확하고 단순한 것이 더 유지보수 하기 쉽다
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
    }
}
