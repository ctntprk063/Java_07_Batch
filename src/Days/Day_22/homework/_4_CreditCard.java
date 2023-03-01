package Days.Day_22.homework;

public class _4_CreditCard {
    public static void main(String[] args) {
        userEligible();
        userNotEligible();

    }

    public static void userEligible() {
        int income = 2500;
        if (income > 1500) {
            System.out.println(" user is eligible for credit card");
        }else
            System.out.println(" user is not eligible for credit card");
    }
    public static void userNotEligible() {
        int income = 1400;
        if (income < 1500) {
            System.out.println(" user is not eligible for credit card");
        } else
            System.out.println(" user is eligible for credit card");

    }
}
