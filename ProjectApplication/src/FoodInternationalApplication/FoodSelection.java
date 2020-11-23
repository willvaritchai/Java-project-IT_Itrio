package FoodInternationalApplication;

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

    public static String randomFunctionThailandRes() {
        Scanner scn1 = new Scanner(System.in);
        System.out.print("\nDo you want to go to the RanDomFood! function ([y] = randomfunction / [n] = norandom but show all menus) \n--> ");
        String randomizing = scn1.nextLine();
        if ("y".equals(randomizing)) {
            System.out.println("\n! Random Function activate ! \n");

            String[] randomfoodThai = {"\t[TamLeungTong] Pork Satay 70 THB", "\t[TamLeungTong] Fried Fish Wonton 120 THB", "\t[TamLeungTong] Roasted Pork 120 THB", "\t[TamLeungTong] Steamed Sea Bass with Lemon 350 THB", "\t[TamLeungTong] Sour Soup with Prawn & Mixed Vegetables 150 THB \n",
                                       "\t[94 Phochana] Stewed duck 130 THB", "\t[94 Phochana] Fried Sea Bass with Fish Sauce 320 THB", "\t[94 Phochana] Grouper with Chili Sauce 240 THB", "\t[94 Phochana] Wing Bean Salad 109 THB", "\t[94 Phochana] Pad Thai with fresh shrimp 60 THB \n" ,
                                       "\t[Kaysorn] Simmered crab 600 THB", "\t[Kaysorn] Chicken with liquor 650 THB", "\t[Kaysorn] Steamed Curry Seafood in Young Coconut 350 THB", "\t[Kaysorn] Steamed Squid with Lemon 450 THB", "\t[Kaysorn] Thai papaya salad 200 THB"};
            Random Thai = new Random();
            int randomfunctionThai = Thai.nextInt(randomfoodThai.length);
            System.out.println(randomfoodThai[randomfunctionThai]);
        }
        if ("n".equals(randomizing)) { 
                String[] thaiRestaurant = {"\t[TamLeungTong] Pork Satay 70 THB", "\t[TamLeungTong] Fried Fish Wonton 120 THB", "\t[TamLeungTong] Roasted Pork 120 THB", "\t[TamLeungTong] Steamed Sea Bass with Lemon 350 THB", "\t[TamLeungTong] Sour Soup with Prawn & Mixed Vegetables 150 THB \n",
                                       "\t[94 Phochana] Stewed duck 130 THB", "\t[94 Phochana] Fried Sea Bass with Fish Sauce 320 THB", "\t[94 Phochana] Grouper with Chili Sauce 240 THB", "\t[94 Phochana] Wing Bean Salad 109 THB", "\t[94 Phochana] Pad Thai with fresh shrimp 60 THB \n" ,
                                       "\t[Kaysorn] Simmered crab 600 THB", "\t[Kaysorn] Chicken with liquor 650 THB", "\t[Kaysorn] Steamed Curry Seafood in Young Coconut 350 THB", "\t[Kaysorn] Steamed Squid with Lemon 450 THB", "\t[Kaysorn] Thai papaya salad 200 THB"};
        for (int i = 0; i < thaiRestaurant.length; i++) {
        System.out.println(thaiRestaurant[i]);
    }
        }
        return randomizing;
    }

    public static String randomFunctionJapaneseRes() {
        Scanner scn2 = new Scanner(System.in);
        System.out.print("\nDo you want to go to the RanDomFood! function ([y] = randomfunction / [n] = norandom but show all menus) \n--> ");
        String randomizing2 = scn2.nextLine();
        if ("y".equals(randomizing2)) {
            System.out.println("\n! Random Function activate ! \n");

            String[] randomfoodJapan = {"\t[Fuji] Fuji Bento Sashimi Set 350 THB", "\t[Fuji] Makimono Moriawase 180 THB", "\t[Fuji] Salmon Ikura Don 320 THB", "\t[Fuji] Onigiri 60 THB", "\t[Fuji] Tempura Set 180 THB \n",
                                        "\t[SushiHiro] Salmon Duo Sashimi 120 THB", "\t[SushiHiro] Salmon Toro Karaage Tataki 179 THB", "\t[SushiHiro] Shiurauo Kari Kari Salad 220 THB", "\t[SushiHiro] Hokkaido Cheesecake 120 THB", "\t[SushiHiro] Tempura Moriawase 380 THB \n",
                                        "\t[Zen] VEGETARIAN INARI ROLL 150 THB", "\t[Zen] UNAGI MAKI 250 THB", "\t[Zen] KAISEN DON 395 THB", "\t[Zen] SALMON ABURI SUSHI 65 THB", "\t[Zen] SHIMA HOKKE 390 THB" };
            Random Japan = new Random();
            int randomfunctionJapan = Japan.nextInt(randomfoodJapan.length);
            System.out.println(randomfoodJapan[randomfunctionJapan]);
        }
        if ("n".equals(randomizing2)) {
            String[] japaneseRestaurant = {"\t[Fuji] Fuji Bento Sashimi Set 350 THB", "\t[Fuji] Makimono Moriawase 180 THB", "\t[Fuji] Salmon Ikura Don 320 THB", "\t[Fuji] Onigiri 60 THB", "\t[Fuji] Tempura Set 180 THB \n",
                                        "\t[SushiHiro] Salmon Duo Sashimi 120 THB", "\t[SushiHiro] Salmon Toro Karaage Tataki 179 THB", "\t[SushiHiro] Shiurauo Kari Kari Salad 220 THB", "\t[SushiHiro] Hokkaido Cheesecake 120 THB", "\t[SushiHiro] Tempura Moriawase 380 THB \n",
                                        "\t[Zen] VEGETARIAN INARI ROLL 150 THB", "\t[Zen] UNAGI MAKI 250 THB", "\t[Zen] KAISEN DON 395 THB", "\t[Zen] SALMON ABURI SUSHI 65 THB", "\t[Zen] SHIMA HOKKE 390 THB" };
        for (int i = 0; i < japaneseRestaurant.length; i++) {
        System.out.println(japaneseRestaurant[i]);
    }
        }
        return randomizing2;
    }

    public static String randomFunctionItalianRes() {
        Scanner scn3 = new Scanner(System.in);
        System.out.print("\nDo you want to go to the RanDomFood! function ([y] = randomfunction / [n] = norandom but show all menus) \n--> ");
        String randomizing3 = scn3.nextLine();
        if ("y".equals(randomizing3)) {
            System.out.println("\n! Random Function activate ! \n");

            String[] randomfoodItalian = {"\t[BigMama] Tuna Salad 273 THB", "\t[BigMama] Big Mama Salad 279 THB", "\t[BigMama] Pizza Salmon 412 THB", "\t[BigMama] Crab Spaghetti 343 THB", "\t[BigMama] Mussels Baked With Cheese 380 THB \n",
                                          "\t[LenziTuscan] Pancetta Toscana 290 THB", "\t[LenziTuscan] Tagliere Del Lenzi 560 THB", "\t[LenziTuscan] Il crudo del Lenzi 1800 THB", "\t[LenziTuscan] Minestra della Garfagnana 350 THB", "\t[LenziTuscan] Insalata mista 350 THB \n",
                                          "\t[LaScarpettaBangkok] Insalata Cesare 250 THB", "\t[LaScarpettaBangkok] Risotto ai Funghi Porcini aromatizzato al Tartufo 260 THB", "\t[LaScarpettaBangkok] Lasagna Classica 280 THB", "\t[LaScarpettaBangkok] Tagliatelle alla Bolognese 240 THB", "\t[LaScarpettaBangkok] Vongole 260 THB"};
            Random Italian = new Random();
            int randomfunctionItalian = Italian.nextInt(randomfoodItalian.length);
            System.out.println(randomfoodItalian[randomfunctionItalian]);
        }
        if ("n".equals(randomizing3)) {
            String[] italianRestaurant = {"\t[BigMama] Tuna Salad 273 THB", "\t[BigMama] Big Mama Salad 279 THB", "\t[BigMama] Pizza Salmon 412 THB", "\t[BigMama] Crab Spaghetti 343 THB", "\t[BigMama] Mussels Baked With Cheese 380 THB \n",
                                          "\t[LenziTuscan] Pancetta Toscana 290 THB", "\t[LenziTuscan] Tagliere Del Lenzi 560 THB", "\t[LenziTuscan] Il crudo del Lenzi 1800 THB", "\t[LenziTuscan] Minestra della Garfagnana 350 THB", "\t[LenziTuscan] Insalata mista 350 THB \n",
                                          "\t[LaScarpettaBangkok] Insalata Cesare 250 THB", "\t[LaScarpettaBangkok] Risotto ai Funghi Porcini aromatizzato al Tartufo 260 THB", "\t[LaScarpettaBangkok] Lasagna Classica 280 THB", "\t[LaScarpettaBangkok] Tagliatelle alla Bolognese 240 THB", "\t[LaScarpettaBangkok] Vongole 260 THB"};
        for (int i = 0; i < italianRestaurant.length; i++) {
        System.out.println(italianRestaurant[i]);
    }
        }
        return randomizing3;
    }
   
    public static String randomFunctionChaineseRes() {
        Scanner scn4 = new Scanner(System.in);
        System.out.print("\nDo you want to go to the RanDomFood! function ([y] = randomfunction / [n] = norandom but show all menus) \n--> ");
        String randomizing4 = scn4.nextLine();
        if ("y".equals(randomizing4)) {
            System.out.println("\n! Random Function activate ! \n");

            String[] randomfoodChainese = {"\t[Ruenros] Abalone in Oyster Sauce 2200 THB", "\t[Ruenros] Braised Goat Meat in Red Sauce 300 THB", "\t[Ruenros] Fried scallops with XO sauce 700 THB", "\t[Ruenros] Fried Snow Fish with Soy Sauce 300 THB", "\t[Ruenros] Baked River Prawn with Glass Noodles 325 THB \n",
                                           "\t[HuaSengHong] Barbecued suckling pig 1600 THB", "\t[HuaSengHong] Roasted Duck Tube Noodle 89 THB", "\t[HuaSengHong] Shrimp Dumpling 59 THB", "\t[HuaSengHong] Banana Shrimp Fried with Garlic 350 THB", "\t[HuaSengHong] Abalone Shark Fin Soup 899 THB \n",
                                           "\t[TowPochana] Stir Fried Kale with Salted Fish 130 THB", "\t[TowPochana] Stir Fried Squid 180 THB", "\t[TowPochana] Stir Fried Morning Glory 80 THB", "\t[TowPochana] Stir Fried Snakehead Fish with Celery Leaves 180 THB", "\t[TowPochana] Stewed duck 480 THB"};
            Random Chainese = new Random();
            int randomfunctionChainese = Chainese.nextInt(randomfoodChainese.length);
            System.out.println(randomfoodChainese[randomfunctionChainese]);
        }
        if ("n".equals(randomizing4)) {
            String[] chaineseRestaurant = {"\t[Ruenros] Abalone in Oyster Sauce 2200 THB", "\t[Ruenros] Braised Goat Meat in Red Sauce 300 THB", "\t[Ruenros] Fried scallops with XO sauce 700 THB", "\t[Ruenros] Fried Snow Fish with Soy Sauce 300 THB", "\t[Ruenros] Baked River Prawn with Glass Noodles 325 THB \n",
                                           "\t[HuaSengHong] Barbecued suckling pig 1600 THB", "\t[HuaSengHong] Roasted Duck Tube Noodle 89 THB", "\t[HuaSengHong] Shrimp Dumpling 59 THB", "\t[HuaSengHong] Banana Shrimp Fried with Garlic 350 THB", "\t[HuaSengHong] Abalone Shark Fin Soup 899 THB \n",
                                           "\t[TowPochana] Stir Fried Kale with Salted Fish 130 THB", "\t[TowPochana] Stir Fried Squid 180 THB", "\t[TowPochana] Stir Fried Morning Glory 80 THB", "\t[TowPochana] Stir Fried Snakehead Fish with Celery Leaves 180 THB", "\t[TowPochana] Stewed duck 480 THB"};
        for (int i = 0; i < chaineseRestaurant.length; i++) {
        System.out.println(chaineseRestaurant[i]);
    }
        }
        return randomizing4;
    }
    
    public static String randomFunctionAmericanRes() {
        Scanner scn5 = new Scanner(System.in);
        System.out.print("\nDo you want to go to the RanDomFood! function ([y] = randomfunction / [n] = norandom but show all menus) \n--> ");
        String randomizing5 = scn5.nextLine();
        if ("y".equals(randomizing5)) {
            System.out.println("\n! Random Function activate ! \n");

            String[] randomfoodAmerican = {"\t[McdonaldsRama2] Doube Summer Samurai 279 THB", "\t[McdonaldsRama2] Cheese Burger Set 145 THB", "\t[McdonaldsRama2] McFish Set 165 THB", "\t[McdonaldsRama2] French fries 74 THB", "\t[McdonaldsRama2] McNuggets 145 THB \n",
            "\t[ROASTcoffee&eatery] Eggs Benedict 320 THB", "\t[ROASTcoffee&eatery] Pastrami Hash 380 THB", "\t[ROASTcoffee&eatery] Roast Breakfast 420 THB", "\t[ROASTcoffee&eatery] Jerk Chicken 380 THB", "\t[ROASTcoffee&eatery] Bolognese 300 THB \n",
            "\t[AuntieAnne's] Original Pretzel 35 THB", "\t[AuntieAnne's] Chessy Chicken Bites 62 THB", "\t[AuntieAnne's] Almond Stix 49 THB", "\t[AuntieAnne's] Almond Choco Ball 49 THB", "\t[AuntieAnne's] Grilled Smoked Chicken Pretzel  79 THB"};
            Random American = new Random();
            int randomfunctionAmerican = American.nextInt(randomfoodAmerican.length);
            System.out.println(randomfoodAmerican[randomfunctionAmerican]);
        }
        if ("n".equals(randomizing5)) {
            String[] americanRestaurant = {"\t[McdonaldsRama2] Doube Summer Samurai 279 THB", "\t[McdonaldsRama2] Cheese Burger Set 145 THB", "\t[McdonaldsRama2] McFish Set 165 THB", "\t[McdonaldsRama2] French fries 74 THB", "\t[McdonaldsRama2] McNuggets 145 THB \n",
            "\t[ROASTcoffee&eatery] Eggs Benedict 320 THB", "\t[ROASTcoffee&eatery] Pastrami Hash 380 THB", "\t[ROASTcoffee&eatery] Roast Breakfast 420 THB", "\t[ROASTcoffee&eatery] Jerk Chicken 380 THB", "\t[ROASTcoffee&eatery] Bolognese 300 THB \n",
            "\t[AuntieAnne's] Original Pretzel 35 THB", "\t[AuntieAnne's] Chessy Chicken Bites 62 THB", "\t[AuntieAnne's] Almond Stix 49 THB", "\t[AuntieAnne's] Almond Choco Ball 49 THB", "\t[AuntieAnne's] Grilled Smoked Chicken Pretzel  79 THB"};
        for (int i = 0; i < americanRestaurant.length; i++) {
        System.out.println(americanRestaurant[i]);
    }
        }
        return randomizing5;
    }

}
