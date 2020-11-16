package FoodRandom;

import java.util.Scanner;

public class FoodSelection {

    public static NationalityFood foodSelection(int num) {
        switch (num) {
            case 1:
                return NationalityFood.Italianfood;
            case 2:
                return NationalityFood.Japanesefood;
            case 3:
                return NationalityFood.Thaifood;
            case 4:
                return NationalityFood.Chinesefood;
            case 5:
                return NationalityFood.Americanfood;
            default:
                System.out.println("Please select 1-5");
                return null;
        }
    }

    public static int readNum() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please select the nationality food that you interested in : ");
        int num = scn.nextInt();
        return num;
    }

    public static RestaurantForItalian secondSelection(int num2) {
        switch (num2) {
            case 1:
                return RestaurantForItalian.BigmamaPizzeria;
            case 2:
                return RestaurantForItalian.LenziTuscanKitchen;
            case 3:
                return RestaurantForItalian.LaScarpettaBangkok;
            default:
                return null;
        }
    }

    public static RestaurantForJapanese thirdSelection(int num3) {
        switch (num3) {
            case 1:
                return RestaurantForJapanese.FujiRestaurant;
            case 2:
                return RestaurantForJapanese.SushiHiro;
            case 3:
                return RestaurantForJapanese.ZenRestaurant;
            default:
                return null;
        }
    }

    public static RestaurantForThai fourthSelection(int num4) {
        switch (num4) {
            case 1:
                return RestaurantForThai.Tamleungtong;
            case 2:
                return RestaurantForThai.A94Phochana;
            case 3:
                return RestaurantForThai.Kaysornrestaurant;
            default:
                return null;
        }
    }

    public static RestaurantForChinese fifthSelection(int num5) {
        switch (num5) {
            case 1:
                return RestaurantForChinese.RuenrosRestaurant;
            case 2:
                return RestaurantForChinese.HUASENGHONG;
            case 3:
                return RestaurantForChinese.Towpochana;
            default:
                return null;
        }
    }

    public static RestaurantForAmerican sixthSelection(int num6) {
        switch (num6) {
            case 1:
                return RestaurantForAmerican.McDonaldsMParkRama2;
            case 2:
                return RestaurantForAmerican.ROASTcoffeeeatery;
            case 3:
                return RestaurantForAmerican.AuntieAnne;
            default:
                return null;
        }
    }

    public static int readNumSecond() {
        Scanner scn2 = new Scanner(System.in);
        System.out.print("Please select the restaurant  : ");
        int num = scn2.nextInt();
        return num;
    }

    public static int readNumThird() {
        Scanner scn3 = new Scanner(System.in);
        System.out.print("Please select restaurant : ");
        int num = scn3.nextInt();
        return num;
    }

    public static int readNumFourth() {
        Scanner scn4 = new Scanner(System.in);
        System.out.print("Please select restaurant : ");
        int num = scn4.nextInt();
        return num;
    }

    public static int readNumFifth() {
        Scanner scn5 = new Scanner(System.in);
        System.out.print("Please select restaurant : ");
        int num = scn5.nextInt();
        return num;
    }

    public static int readNumSixth() {
        Scanner scn6 = new Scanner(System.in);
        System.out.print("Please select restaurant :");
        int num = scn6.nextInt();
        return num;
    }

}
