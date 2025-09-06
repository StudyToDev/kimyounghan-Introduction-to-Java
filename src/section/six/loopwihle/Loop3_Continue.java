package section.six.loopwihle;

public class Loop3_Continue {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5)  {
            if (i == 3) {
                i++;
                continue; // 이하 라인 무시하고 다음 루프를 탐
            }
            System.out.println("i = " + i );

            i++;
        } ;
    }
}
