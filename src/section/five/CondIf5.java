package section.five;

public class CondIf5 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000){
            System.out.println("10,000원 이상 구매");
            discount = discount + 1000;
        }
        if ( age <= 10 ) {
            System.out.println("10살 이하");
            discount = discount + 1000;
        }

        System.out.println("원래 가격 : " + price + " 원");
        System.out.println("총 할인 금액 : " + discount + " 원");
        price = price - discount;
        System.out.println("총 결재 금액 : " + price + " 원");

    }
}
