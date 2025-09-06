package section.six.loopwihle;

public class Loop2_DoWhile2 {
    public static void main(String[] args) {
        // do-While 문은 조건에 상관 없이 1번은 무조건 실행 된다.

        int i = 10;

        do { // 1회 시작
            System.out.println("i = " + i);
            i++;
        } while (i < 3) ; // 조건에 맞으면 do 블럭이 실행 됨.
    }
}
