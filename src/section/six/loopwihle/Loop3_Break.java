package section.six.loopwihle;

public class Loop3_Break {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (true)  { // 무한 반복
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i = " + i + " | sum = " + sum);
                break;
            }
            i++;
        } ;
        System.out.println("i = " + i + " | sum = " + sum);
    }
}
