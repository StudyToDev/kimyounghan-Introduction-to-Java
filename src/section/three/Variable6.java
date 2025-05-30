package section.three;

public class Variable6 {
    public static void main(String[] args) {
        int a;
        // 변수 초기화 하지 않고 실행하면 컴파일되지 않음으로 실행자체가 되지 않음
        // System.out.println(a);
        // 컴퓨터는 메모리를 여러 시스템이 같이 사용
        // 변수를 선언하면 메모리의 어떤 공간을 차지함.
        // 이 공간은 java 프로그램 뿐만 아니라, 게임, 브라우저 등이 사용 중일 수도 있음
        // 때문에 변수를 선언하지 않으면 java 프로그램에서 선언하지 않은 변수의 값이 출력될 수 있기 때문에
        // 변수 초기화를 하지 않은 변수를 사용하려고 하면 null 이나 undefinde 같은 값이 아닌, 에러를 발생 시킨다.
        // 이 때 발생하는 에러는 컴파일 에러이다. 컴파일은 class 파일을 생성해야하는데, 컴파일 단계에서 실행된 에러이다
        // 자바 문법 에러 같은 경우, 컴파일 단계에서 에러를 발생시킨다
        // 컴파일 할 때, 사용하지 않은 변수는 컴파일 하지 않는다. (자바가 스스로 최적화)
    }
}
