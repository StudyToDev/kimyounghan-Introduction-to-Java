package section.four.comp.logical;

public class OpLogical1 {
    public static void main(String[] args) {
        System.out.println("&&: AND 연산");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println();
        System.out.println("||: OR 연산");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println();
        System.out.println("!: 부정 연산");
        System.out.println(!true);
        System.out.println(!false);

        System.out.println();
        System.out.println("변수 활용");

        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);
    }
}
