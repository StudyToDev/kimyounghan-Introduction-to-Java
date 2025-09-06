package section.six.loopfor;

public class Loop2_Beark1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        // 위 코드도 가능하다. while(true)와 동일
        for(;;) {
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i = " + i + " | sum = " + sum);
                break;
            }
            i++;

        }
        System.out.println("i = " + i + " | sum = " + sum);

    }
}
