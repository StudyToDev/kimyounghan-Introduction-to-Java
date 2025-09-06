package section.six.loopwihle;

public class Loop1_While4 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;

        while (i <= endNum) {
            sum = sum + i;
            System.out.println("i = " + i + " | sum = " + sum);
            i++;
        }
    }
}
