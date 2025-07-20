package section.five.ex;

public class CondEx1Question1 {
    public static void main(String[] args) {
        int scoure = 59;
        String mark;

        if (90 <= scoure) {
            mark = "A";
        } else if ( 80 <= scoure ) {
            mark = "B";
        }else if ( 70 <= scoure ) {
            mark = "C";
        }else if ( 60 <= scoure ) {
            mark = "D";
        }else {
            mark = "F";
        }

        System.out.println("출력 : 학점은 "+ mark + "입니다.");
    }
}
