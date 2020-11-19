package FoodRandom;

import java.util.Scanner;

public class TestFoodRandom {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("<< Welcome to application --What to eat ?-- >>");
        System.out.println("");
        System.out.println("Select the nationality food you are interested in.");
        System.out.println("1.Italianfoods");
        System.out.println("2.Japanesefoods");
        System.out.println("3.Thaifood");
        System.out.println("4.Chinesefoods");
        System.out.println("5.Americanfood");

        System.out.println("");
        int num = FoodSelection.readNum();
        NationalityFood SelectNationalityFood = FoodSelection.foodSelection(num);
        System.out.println("You selected '" + SelectNationalityFood + "'");

        switch (num) {
            case 1:
                System.out.println("");
                System.out.println("---List of Italian Restaurant---");
                System.out.println("1.Big mama Pizzeria [Location : 139 Soi Sukhumvit 21 North Klongtoey, Watthana, Bangkok 10110]");
                System.out.println("2.Lenzi Tuscan Kitchen [Location : 69/1-2 Ruamruedee 2 Wittayu Road 10330]");
                System.out.println("3.La Scarpetta Bangkok [Location : 1495 Charoenkrung Road, Silom, Bangrak, Bangkok 10500]");
                System.out.println("--------------------------");
                int num2 = FoodSelection.readNumSecond();
                System.out.println("You selected Restaurant : " + FoodSelection.secondSelection(num2));
                break;
            case 2:
                System.out.println("");
                System.out.println("---List of Japanese Restaurant---");
                System.out.println("1.Fuji Restaurant [Location : Central Plaza Rama 2, 4th Floor, Rama 2 Road, Samae Dam, Bang Khun Thian, Bangkok 10150]");
                System.out.println("2.Sushi Hiro [Location : Borommaratchachonnani Road, Bangkok (The shop is located on the 1st floor Community Mall, the sense project Pinklao, next to Central Pinklao)]");
                System.out.println("3.Zen Restaurant [Location : 160 Rama 2 Road, Samae Dam, Bang Khun Thian, Bangkok 10150]");
                System.out.println("--------------------------");
                int num3 = FoodSelection.readNumThird();
                System.out.println("You selected Restaurant : " + FoodSelection.thirdSelection(num3));
                break;
            case 3:
                System.out.println("");
                System.out.println("---List of Thai Restaurant---");
                System.out.println("1.Tam leung tong [Location : Thung Khru Sub-district, Thung Khru District, Bangkok 10140]");
                System.out.println("2.94 Phochana [Location : 618 Soi Pracha Uthit 84/3, Thung Khru Subdistrict, Thung Khru District, Bangkok 10140]");
                System.out.println("3.Kaysorn restaurant [Location : 559 18 Charoen Rat Road, Bang Khlo, Bang Kho Laem, Bangkok 10120]");
                System.out.println("--------------------------");
                int num4 = FoodSelection.readNumFourth();
                System.out.println("You selected Restaurant : " + FoodSelection.fourthSelection(num4));
                break;
            case 4:
                System.out.println("");
                System.out.println("---List of Chinese Restaurant---");
                System.out.println("1.Ruenros Restaurant [Location : 762/2 Bangkok Square Project, Rama III Road, Bang Phong Pang, Yan Nawa, Bangkok 10120]");
                System.out.println("2.HUA SENG HONG [Location : Central Rama 2, 4th Floor, Room No. 403, Rama 2 Road, Samae Dam, Bang Khun Thian, Bangkok 10150]");
                System.out.println("3.Tow pochana [Location : 69 Soi Rat Burana 16 (Suksawat 25, Suksawat Rd., Bangpakok, Rat Burana, Bangkok 10140]");
                System.out.println("--------------------------");
                int num5 = FoodSelection.readNumFifth();
                System.out.println("You selected Restaurant : " + FoodSelection.fifthSelection(num5));
                break;
            case 5:
                System.out.println("");
                System.out.println("---List of American Restaurant---");
                System.out.println("1.McDonalds M-Park Rama2 [Location : 119/1 Rama 2 Road, Samae Dam, Bang Khun Thian, Bangkok 10150]");
                System.out.println("2.ROAST coffee&eatery [Location : The COMMONS 335 Soi Thonglor 17, Khlong Tan Nuea, Watthana, Bangkok 10110]");
                System.out.println("3.Auntie Anne's [Location : 160 Rama 2 Road, Bangkok (Central Rama 2, 1st floor, Room K 07/1)]");
                System.out.println("--------------------------");
                int num6 = FoodSelection.readNumSixth();
                System.out.println("You selected Restaurant : " + FoodSelection.sixthSelection(num6));
            default:
                break;
        }

    }

}
