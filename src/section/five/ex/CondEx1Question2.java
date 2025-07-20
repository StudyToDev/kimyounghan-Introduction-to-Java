package section.five.ex;

public class CondEx1Question2 {
    public static void main(String[] args) {
        int distance = 11;
        String vehicle;

        if (100 < distance) {
            vehicle = "비행기";
        } else if ( 10 < distance ) {
            vehicle = "자동차";
        }else if ( 1 < distance ) {
            vehicle = "자전거";
        }else {
            vehicle = "도보";
        }

        System.out.println(vehicle + "를 이용하세요.");
    }
}
