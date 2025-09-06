package section.six.loopfor.ex;

public class LoopEx1Question3While {
    public static void main(String[] args) {
        int max = 100;
        int sum = 0;
        int i = 0;
        while (i < max) {
            i++;
            sum = sum + i;
            System.out.println("sum : " + sum + "| i : "+ i);
        }
    }
}
