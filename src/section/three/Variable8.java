package section.three;

public class Variable8 {
    public static void main(String[] args) {
        //정수
        byte b = 127; // -128 ~ 127
        // 자바는 기본 4byte를 효율적으로 계산하게 설계 됨.
        // 다만 파일을 바이트 단위로 다루기 때문에, 파일 전속, 복사에 사용 됨.
        short s = 32767; // -32768 ~ 32767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 20억)
        long l = 9223372036854775807L; // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

        // 실수
        float f = 10.0f;
        double d = 10.0; // float 다 정밀도가 더 높다
    }
}
