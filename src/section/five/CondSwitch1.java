package section.five;

public class CondSwitch1 {
    public static void main(String[] args) {
        int grade = 4;

        int coupon = 500;

        /*
        if (grade == 1) coupon = (coupon + 500) * grade;
        else if (grade == 2) coupon = (coupon + 500) * grade;
        else if (grade == 3) coupon = (coupon + 500) * grade;
        */

        switch (grade) {
            case 1:
                coupon = (coupon + 500) * grade;
                break;
            case 2:
                coupon = (coupon + 500) * grade;
                break;
            case 3:
                coupon = (coupon + 500) * grade;
                break;
        }
        System.out.println("쿠폰 금액 : "+ coupon);

    }
}
