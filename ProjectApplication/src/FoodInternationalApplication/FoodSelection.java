package FoodInternationalApplication;

import EnumForFoodSelection.NationalityFood;
import EnumForFoodSelection.RestaurantForAmerican;
import EnumForFoodSelection.RestaurantForChinese;
import EnumForFoodSelection.RestaurantForItalian;
import EnumForFoodSelection.RestaurantForJapanese;
import EnumForFoodSelection.RestaurantForThai;
import java.util.Random;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Win10
 */
public class FoodSelection {

    public static NationalityFood foodSelection(int num) {
        switch (num) {
            case 1:
                return NationalityFood.Thaifood;
            case 2:
                return NationalityFood.Japanesefood;
            case 3:
                return NationalityFood.Italianfood;
            case 4:
                return NationalityFood.Chinesefood;
            case 5:
                return NationalityFood.Americanfood;
            default:
                return null;
        }
    }

    public static int readNum() {
        Scanner scn = new Scanner(System.in);
        System.out.print("--------------------------" + "\nPlease select the nationality food that you interested in : ");
        int num = scn.nextInt();
        return num;
    }

    public static int readNumSecond() {
        Scanner scn2 = new Scanner(System.in);
        System.out.print("Please select the restaurant  : ");
        int num = scn2.nextInt();
        return num;
    }

    public static RestaurantForThai thaiSelection(int num2) {
        switch (num2) {
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

    public static int readNumThird() {
        Scanner scn3 = new Scanner(System.in);
        System.out.print("Please select restaurant : ");
        int num = scn3.nextInt();
        return num;
    }

    public static RestaurantForJapanese japaneseSelection(int num3) {
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

    public static int readNumFourth() {
        Scanner scn4 = new Scanner(System.in);
        System.out.print("Please select restaurant : ");
        int num = scn4.nextInt();
        return num;
    }

    public static RestaurantForItalian italianSelection(int num4) {
        switch (num4) {
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

    public static int readNumFifth() {
        Scanner scn5 = new Scanner(System.in);
        System.out.print("Please select restaurant : ");
        int num = scn5.nextInt();
        return num;
    }

    public static RestaurantForChinese chineseSelection(int num5) {
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

    public static int readNumSixth() {
        Scanner scn6 = new Scanner(System.in);
        System.out.print("Please select restaurant :");
        int num = scn6.nextInt();
        return num;
    }

    public static RestaurantForAmerican americanSelection(int num6) {
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

    public static String randomFunctionThailandOne() {
        Scanner scn1 = new Scanner(System.in);
        System.out.print("\nDo you want to go to the RanDomFood! function ([y] = randomfunction / [n] = norandom but show all menus) \n--> ");
        String randomizing = scn1.nextLine();
        if ("y".equals(randomizing)) {
            System.out.println("\n! Random Function !");

            String[] randomfoodTamleungtong = {"Pork Satay 70 THB", "Fried Fish Wonton 120 THB", "Roasted Pork 120 THB", "Steamed Sea Bass with Lemon 350 THB", "Sour Soup with Prawn & Mixed Vegetables 150 THB"};
            Random Tam = new Random();
            int randomfunctionTam = Tam.nextInt(randomfoodTamleungtong.length);
            System.out.println(randomfoodTamleungtong[randomfunctionTam]);
        }
        if ("n".equals(randomizing)) {
            //-------//
        }
        return randomizing;

    }

    public static String randomFunctionThailandTwo() {
        Scanner scn2 = new Scanner(System.in);
        System.out.print("\nDo you want to go to the RanDomFood! function ([y] = randomfunction / [n] = norandom but show all menus) \n--> ");
        String randomizing2 = scn2.nextLine();
        if ("y".equals(randomizing2)) {
            System.out.println("\n! Random Function !");

            String[] randomfood94Phochana = {"Stewed duck 130 THB", "Fried Sea Bass with Fish Sauce 320 THB", "Grouper with Chili Sauce 240 THB", "Wing Bean Salad 109 THB", "Pad Thai with fresh shrimp 60 THB"};
            Random Pho = new Random();
            int randomfunctionPho = Pho.nextInt(randomfood94Phochana.length);
            System.out.println(randomfood94Phochana[randomfunctionPho]);
        }
        if ("n".equals(randomizing2)) {
            //-------//
        }
        return randomizing2;

    }

    public static String randomFunctionThailandThree() {
        Scanner scn3 = new Scanner(System.in);
        System.out.print("\nDo you want to go to the RanDomFood! function ([y] = randomfunction / [n] = norandom but show all menus) \n--> ");
        String randomizing3 = scn3.nextLine();
        if ("y".equals(randomizing3)) {
            System.out.println("\n! Random Function !");

            String[] randomfoodKaysornrestaurant = {"Simmered crab 600 THB", "Chicken with liquor 650 THB", "Steamed Curry Seafood in Young Coconut 350 THB", "Steamed Squid with Lemon 450 THB", "Thai papaya salad 200 THB"};
            Random Kay = new Random();
            int randomfunctionKay = Kay.nextInt(randomfoodKaysornrestaurant.length);
            System.out.println(randomfoodKaysornrestaurant[randomfunctionKay]);
        }
        if ("n".equals(randomizing3)) {
            //-------//
        }
        return randomizing3;
    }

    public static String randomFunctionJapaneseOne() {
        Scanner scn4 = new Scanner(System.in);
        System.out.print("\nDo you want to go to the RanDomFood! function ([y] = randomfunction / [n] = norandom but show all menus) \n--> ");
        String randomizing4 = scn4.nextLine();
        if ("y".equals(randomizing4)) {
            System.out.println("\n! Random Function !");

            String[] randomfoodFujiRestaurant = {"Fuji Bento Sashimi Set 350 THB", "Makimono Moriawase 180 THB", "Salmon Ikura Don 320 THB", "Onigiri 60 THB", "Tempura Set 180 THB"};
            Random Fu = new Random();
            int randomfunctionFu = Fu.nextInt(randomfoodFujiRestaurant.length);
            System.out.println(randomfoodFujiRestaurant[randomfunctionFu]);
        }
        if ("n".equals(randomizing4)) {
            //-------//
        }
        return randomizing4;
    }

    public static String randomFunctionJapaneseTwo() {
        Scanner scn5 = new Scanner(System.in);
        System.out.print("\nDo you want to go to the RanDomFood! function ([y] = randomfunction / [n] = norandom but show all menus) \n--> ");
        String randomizing5 = scn5.nextLine();
        if ("y".equals(randomizing5)) {
            System.out.println("\n! Random Function !");

            String[] randomfoodSushiHiro = {"Salmon Duo Sashimi 120 THB", "(Salmon Toro Karaage Tataki 179 THB", "Shiurauo Kari Kari Salad 220 THB", "Hokkaido Cheesecake 120 THB", "Tempura Moriawase 380 THB"};
            Random Hiro = new Random();
            int randomfunctionHiro = Hiro.nextInt(randomfoodSushiHiro.length);
            System.out.println(randomfoodSushiHiro[randomfunctionHiro]);
        }
        if ("n".equals(randomizing5)) {
            //-------//
        }
        return randomizing5;
    }

    public static String randomFunctionJapaneseThree() {
        Scanner scn6 = new Scanner(System.in);
        System.out.print("\nDo you want to go to the RanDomFood! function ([y] = randomfunction / [n] = norandom but show all menus) \n--> ");
        String randomizing6 = scn6.nextLine();
        if ("y".equals(randomizing6)) {
            System.out.println("\n! Random Function !");

            String[] randomfoodZenRestaurant = {"VEGETARIAN INARI ROLL 150 THB", "UNAGI MAKI 250 THB", "KAISEN DON 395 THB", "SALMON ABURI SUSHI 65 THB", "SHIMA HOKKE 390 THB"};
            Random Zen = new Random();
            int randomfunctionZen = Zen.nextInt(randomfoodZenRestaurant.length);
            System.out.println(randomfoodZenRestaurant[randomfunctionZen]);
        }
        if ("n".equals(randomizing6)) {
            //-------//
        }
        return randomizing6;
    }

    public static String randomFunctionItalianOne() {
        Scanner scn7 = new Scanner(System.in);
        System.out.print("\nDo you want to go to the RanDomFood! function ([y] = randomfunction / [n] = norandom but show all menus) \n--> ");
        String randomizing7 = scn7.nextLine();
        if ("y".equals(randomizing7)) {
            System.out.println("\n! Random Function !");

            String[] randomfoodBigmamaPizzeria = {"Tuna Salad 273 THB", "Big Mama Salad 279 THB", "Pizza Salmon 412 THB", "Crab Spaghetti 343 THB", "Mussels Baked With Cheese 380 THB"};
            Random Piz = new Random();
            int randomfunctionPiz = Piz.nextInt(randomfoodBigmamaPizzeria.length);
            System.out.println(randomfoodBigmamaPizzeria[randomfunctionPiz]);
        }
        if ("n".equals(randomizing7)) {
            //-------//
        }
        return randomizing7;
    }

    public static String randomFunctionItalianTwo() {
        Scanner scn8 = new Scanner(System.in);
        System.out.print("\nDo you want to go to the RanDomFood! function ([y] = randomfunction / [n] = norandom but show all menus) \n--> ");
        String randomizing8 = scn8.nextLine();
        if ("y".equals(randomizing8)) {
            System.out.println("\n! Random Function !");

            String[] randomfoodLenziTuscanKitchen = {"Pancetta Toscana 290 THB", "Tagliere Del Lenzi 560 THB", "Il crudo del Lenzi 1800 THB", "Minestra della Garfagnana 350 THB", "Insalata mista 350 THB"};
            Random Tus = new Random();
            int randomfunctionTus = Tus.nextInt(randomfoodLenziTuscanKitchen.length);
            System.out.println(randomfoodLenziTuscanKitchen[randomfunctionTus]);
        }
        if ("n".equals(randomizing8)) {
            //-------//
        }
        return randomizing8;
    }

    public static String randomFunctionItalianThree() {
        Scanner scn9 = new Scanner(System.in);
        System.out.print("\nDo you want to go to the RanDomFood! function ([y] = randomfunction / [n] = norandom but show all menus) \n--> ");
        String randomizing9 = scn9.nextLine();
        if ("y".equals(randomizing9)) {
            System.out.println("\n! Random Function !");

            String[] randomfoodLaScarpettaBangkok = {"Insalata Cesare 250 THB", "Risotto ai Funghi Porcini aromatizzato al Tartufo 260 THB", "Lasagna Classica 280 THB", "Tagliatelle alla Bolognese 240 THB", "Vongole 260 THB"};
            Random Scar = new Random();
            int randomfunctionScar = Scar.nextInt(randomfoodLaScarpettaBangkok.length);
            System.out.println(randomfoodLaScarpettaBangkok[randomfunctionScar]);
        }
        if ("n".equals(randomizing9)) {
            //-------//
        }
        return randomizing9;
    }

    public static String randomFunctionChaineseOne() {
        Scanner scn10 = new Scanner(System.in);
        System.out.print("\nDo you want to go to the RanDomFood! function ([y] = randomfunction / [n] = norandom but show all menus) \n--> ");
        String randomizing10 = scn10.nextLine();
        if ("y".equals(randomizing10)) {
            System.out.println("\n! Random Function !");

            String[] randomfoodRuenrosRestaurant = {"Abalone in Oyster Sauce 2200 THB", "Braised Goat Meat in Red Sauce 300 THB", "Fried scallops with XO sauce 700 THB", "Fried Snow Fish with Soy Sauce 300 THB", "Baked River Prawn with Glass Noodles 325 THB"};
            Random Ru = new Random();
            int randomfunctionRu = Ru.nextInt(randomfoodRuenrosRestaurant.length);
            System.out.println(randomfoodRuenrosRestaurant[randomfunctionRu]);
        }
        if ("n".equals(randomizing10)) {
            //-------//
        }
        return randomizing10;
    }

    public static String randomFunctionChaineseTwo() {
        Scanner scn11 = new Scanner(System.in);
        System.out.print("\nDo you want to go to the RanDomFood! function ([y] = randomfunction / [n] = norandom but show all menus) \n--> ");
        String randomizing11 = scn11.nextLine();
        if ("y".equals(randomizing11)) {
            System.out.println("\n! Random Function !");

            String[] randomfoodHUASENGHONG = {"Barbecued suckling pig 1600 THB", "Roasted Duck Tube Noodle 89 THB", "Shrimp Dumpling 59 THB", "Banana Shrimp Fried with Garlic 350 THB", "Abalone Shark Fin Soup 899 THB"};
            Random HUA = new Random();
            int randomfunctionHUA = HUA.nextInt(randomfoodHUASENGHONG.length);
            System.out.println(randomfoodHUASENGHONG[randomfunctionHUA]);
        }
        if ("n".equals(randomizing11)) {
            //-------//
        }
        return randomizing11;
    }

    public static String randomFunctionChaineseThree() {
        Scanner scn12 = new Scanner(System.in);
        System.out.print("\nDo you want to go to the RanDomFood! function ([y] = randomfunction / [n] = norandom but show all menus) \n--> ");
        String randomizing12 = scn12.nextLine();
        if ("y".equals(randomizing12)) {
            System.out.println("\n! Random Function !");

            String[] randomfoodTowpochana = {"Stir Fried Kale with Salted Fish 130 THB", "Stir Fried Squid 180 THB", "Stir Fried Morning Glory 80 THB", "Stir Fried Snakehead Fish with Celery Leaves 180 THB", "Stewed duck 480 THB"};
            Random Tow = new Random();
            int randomfunctionTow = Tow.nextInt(randomfoodTowpochana.length);
            System.out.println(randomfoodTowpochana[randomfunctionTow]);
        }
        if ("n".equals(randomizing12)) {
            //-------//
        }
        return randomizing12;
    }

    public static String randomFunctionAmericanOne() {
        Scanner scn13 = new Scanner(System.in);
        System.out.print("\nDo you want to go to the RanDomFood! function ([y] = randomfunction / [n] = norandom but show all menus) \n--> ");
        String randomizing13 = scn13.nextLine();
        if ("y".equals(randomizing13)) {
            System.out.println("\n! Random Function !");

            String[] randomfoodMcDonaldsMParkRama2 = {"Double Summer Samurai 279 THB", "Cheese Burger Set 145 THB", "McFish Set 165 THB", "French fries 74 THB", "McNuggets 145 THB"};
            Random Mc = new Random();
            int randomfunctionMc = Mc.nextInt(randomfoodMcDonaldsMParkRama2.length);
            System.out.println(randomfoodMcDonaldsMParkRama2[randomfunctionMc]);
        }
        if ("n".equals(randomizing13)) {
            //-------//
        }
        return randomizing13;
    }

    public static String randomFunctionAmericanTwo() {
        Scanner scn14 = new Scanner(System.in);
        System.out.print("\nDo you want to go to the RanDomFood! function ([y] = randomfunction / [n] = norandom but show all menus) \n--> ");
        String randomizing14 = scn14.nextLine();
        if ("y".equals(randomizing14)) {
            System.out.println("\n! Random Function !");

            String[] randomfoodROASTcoffeeeatery = {"Eggs Benedict 320 THB", "Pastrami Hash 380 THB", "Roast Breakfast 420 THB", "Jerk Chicken 380 THB", "Bolognese 300 THB"};
            Random ROAST = new Random();
            int randomfunctionROAST = ROAST.nextInt(randomfoodROASTcoffeeeatery.length);
            System.out.println(randomfoodROASTcoffeeeatery[randomfunctionROAST]);
        }
        if ("n".equals(randomizing14)) {
            //-------//
        }
        return randomizing14;
    }

    public static String randomFunctionAmericanThree() {
        Scanner scn15 = new Scanner(System.in);
        System.out.print("\nDo you want to go to the RanDomFood! function ([y] = randomfunction / [n] = norandom but show all menus) \n--> ");
        String randomizing15 = scn15.nextLine();
        if ("y".equals(randomizing15)) {
            System.out.println("\n! Random Function !");

           String[] randomfoodAuntieAnnes = {"Original Pretzel 35 THB", "Chessy Chicken Bites 62 THB", "Almond Stix 49 THB", "Almond Choco Ball 49 THB", "Grilled Smoked Chicken Pretzel  79 THB"};
        Random Aunt = new Random();
        int randomfunctionAunt = Aunt.nextInt(randomfoodAuntieAnnes.length);
        System.out.println(randomfoodAuntieAnnes[randomfunctionAunt]);
    }
        if ("n".equals(randomizing15)) {
            //-------//
        }
        return randomizing15;
    }
    
    
    
    
    
    
    
    
    
}
