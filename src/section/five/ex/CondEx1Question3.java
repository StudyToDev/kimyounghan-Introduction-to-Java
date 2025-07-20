package section.five.ex;

public class CondEx1Question3 {
    public static void main(String[] args) {
        int dollar = 10;
        int won = 1300;

        if (0 < dollar) {
            System.out.println("환전 금액은 " + dollar * won + "원 입니다.");
        } else if (0 == dollar) {
            System.out.println("환전할 급액이 없습니다.");
        } else {
            System.out.println("잘못된 금액입니다.");
        }

    }
}
