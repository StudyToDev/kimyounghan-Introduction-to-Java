package section.six.loopfor.ex;

public class LoopEx1Question2While {
    public static void main(String[] args) {
        int num = 1;
        int count = 0;
        while (count <= 10) {
            if ((num % 2) == 0) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
