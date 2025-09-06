package section.six.loopfor;

public class Loop1_For2 {
    public static void main(String[] args) {
        int endNum = 3;
        int sum = 0;

        // int i는 카운트 변수, 인덱스 변수 등으로 부른다
        for (int i = 1; i <= endNum; i ++) {
            sum = sum + 1;
            System.out.println("i = " + i + " | sum = " + sum );
        }
        // for문은 초기화 조건 검사, 반복 작업 등이 규칙적으로 한 줄에 모두 들어가 있어서, while보다 이해가 쉬우며,
        // 반복을 위한 증가하는 카운터 변수를 다른 부분과 명확히 구분할 수 있다.
    }
}
