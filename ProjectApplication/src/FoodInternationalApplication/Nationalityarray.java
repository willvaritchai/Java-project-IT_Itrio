package FoodInternationalApplication;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author Asus
 */
public class Nationalityarray {

    public static void main(String[] args) {

        String[] nationality = {"Italianfood", "Japanesefood", "Thaifood", "Chinesefood", "Americanfood"};
        for (int i = 0; i < nationality.length; i++) {
        System.out.println(nationality[i]);
    }
        //--Thai Restaurants--//

        String[] randomfoodTamleungtong = {"Pork Satay 70 THB", "Fried Fish Wonton 120 THB", "Roasted Pork 120 THB", "Steamed Sea Bass with Lemon 350 THB", "Sour Soup with Prawn & Mixed Vegetables 150 THB"};
        Random a = new Random();
        int randomfunctionA = a.nextInt(randomfoodTamleungtong.length);
        System.out.println(randomfoodTamleungtong[randomfunctionA]);

        String[] randomfood94Phochana = {"Stewed duck 130 THB", "Fried Sea Bass with Fish Sauce 320 THB", "Grouper with Chili Sauce 240 THB", "Wing Bean Salad 109 THB", "Pad Thai with fresh shrimp 60 THB"};
        Random b = new Random();
        int randomfunctionB = b.nextInt(randomfood94Phochana.length);
        System.out.println(randomfood94Phochana[randomfunctionB]);

        String[] randomfoodKaysornrestaurant  = {"Simmered crab 600 THB", "Chicken with liquor 650 THB", "Steamed Curry Seafood in Young Coconut 350 THB", "Steamed Squid with Lemon 450 THB", "Thai papaya salad 200 THB"};
        Random c = new Random();
        int randomfunctionC = c.nextInt(randomfoodKaysornrestaurant .length);
        System.out.println(randomfoodKaysornrestaurant [randomfunctionC]);
        
        //--Japanese Restaurants--//

        String[] randomfoodFujiRestaurant  = {"Fuji Bento Sashimi Set 350 THB", "Makimono Moriawase 180 THB", "Salmon Ikura Don 320 THB", "Onigiri 60 THB", "Tempura Set 180 THB"};
        Random d = new Random();
        int randomfunctionD = d.nextInt(randomfoodFujiRestaurant .length);
        System.out.println(randomfoodFujiRestaurant [randomfunctionD]);

        String[] randomfoodSushiHiro = {"Salmon Duo Sashimi 120 THB", "(Salmon Toro Karaage Tataki 179 THB", "Shiurauo Kari Kari Salad 220 THB", "Hokkaido Cheesecake 120 THB", "Tempura Moriawase 380 THB"};
        Random e = new Random();
        int randomfunctionE = e.nextInt(randomfoodSushiHiro.length);
        System.out.println(randomfoodSushiHiro[randomfunctionE]);

        String[] randomfoodZenRestaurant = {"VEGETARIAN INARI ROLL 150 THB", "UNAGI MAKI 250 THB", "KAISEN DON 395 THB", "SALMON ABURI SUSHI 65 THB", "SHIMA HOKKE 390 THB"};
        Random f = new Random();
        int randomfunctionF = f.nextInt(randomfoodZenRestaurant.length);
        System.out.println(randomfoodZenRestaurant[randomfunctionF]);

        //--Italian Restaurants--//

        String[] randomfoodBigmamaPizzeria  = {"Tuna Salad 273 THB", "Big Mama Salad 279 THB", "Pizza Salmon 412 THB", "Crab Spaghetti 343 THB", "Mussels Baked With Cheese 380 THB"};
        Random g = new Random();
        int randomfunctionG = g.nextInt(randomfoodBigmamaPizzeria .length);
        System.out.println(randomfoodBigmamaPizzeria [randomfunctionG]);

        String[] randomfoodLenziTuscanKitchen = {"Pancetta Toscana 290 THB", "Tagliere Del Lenzi 560 THB", "Il crudo del Lenzi 1800 THB", "Minestra della Garfagnana 350 THB", "Insalata mista 350 THB"};
        Random h = new Random();
        int randomfunctionH = h.nextInt(randomfoodLenziTuscanKitchen.length);
        System.out.println(randomfoodLenziTuscanKitchen[randomfunctionH]);

        String[] randomfoodLaScarpettaBangkok = {"Insalata Cesare 250 THB", "Risotto ai Funghi Porcini aromatizzato al Tartufo 260 THB", "Lasagna Classica 280 THB", "Tagliatelle alla Bolognese 240 THB", "Vongole 260 THB"};
        Random i = new Random();
        int randomfunctionI = i.nextInt(randomfoodLaScarpettaBangkok.length);
        System.out.println(randomfoodLaScarpettaBangkok[randomfunctionI]);

        //--Chinese Restaurants--//

        String[] randomfoodRuenrosRestaurant  = {"Abalone in Oyster Sauce 2200 THB", "Braised Goat Meat in Red Sauce 300 THB", "Fried scallops with XO sauce 700 THB", "Fried Snow Fish with Soy Sauce 300 THB", "Baked River Prawn with Glass Noodles 325 THB"};
        Random j = new Random();
        int randomfunctionJ = j.nextInt(randomfoodRuenrosRestaurant .length);
        System.out.println(randomfoodRuenrosRestaurant [randomfunctionJ]);

        String[] randomfoodHUASENGHONG = {"Barbecued suckling pig 1600 THB", "Roasted Duck Tube Noodle 89 THB", "Shrimp Dumpling 59 THB", "Banana Shrimp Fried with Garlic 350 THB", "Abalone Shark Fin Soup 899 THB"};
        Random k = new Random();
        int randomfunctionK = k.nextInt(randomfoodHUASENGHONG.length);
        System.out.println(randomfoodHUASENGHONG[randomfunctionK]);

        String[] randomfoodTowpochana  = {"Stir Fried Kale with Salted Fish 130 THB", "Stir Fried Squid 180 THB", "Stir Fried Morning Glory 80 THB", "Stir Fried Snakehead Fish with Celery Leaves 180 THB", "Stewed duck 480 THB"};
        Random l = new Random();
        int randomfunctionL = l.nextInt(randomfoodTowpochana.length);
        System.out.println(randomfoodTowpochana[randomfunctionL]);

        //--American Restaurants--//

        String[] randomfoodMcDonaldsMParkRama2 = {"Double Summer Samurai 279 THB", "Cheese Burger Set 145 THB", "McFish Set 165 THB", "French fries 74 THB", "McNuggets 145 THB"};
        Random m = new Random();
        int randomfunctionM = m.nextInt(randomfoodMcDonaldsMParkRama2.length);
        System.out.println(randomfoodMcDonaldsMParkRama2[randomfunctionM]);

        String[] randomfoodROASTcoffeeeatery = {"Eggs Benedict 320 THB", "Pastrami Hash 380 THB", "Roast Breakfast 420 THB", "Jerk Chicken 380 THB", "Bolognese 300 THB"};
        Random n = new Random();
        int randomfunctionN = n.nextInt(randomfoodROASTcoffeeeatery.length);
        System.out.println(randomfoodROASTcoffeeeatery[randomfunctionN]);

        String[] randomfoodAuntieAnnes  = {"Original Pretzel 35 THB", "Chessy Chicken Bites 62 THB", "Almond Stix 49 THB", "Almond Choco Ball 49 THB", "Grilled Smoked Chicken Pretzel  79 THB"};
        Random o = new Random();
        int randomfunctionO = o.nextInt(randomfoodAuntieAnnes.length);
        System.out.println(randomfoodAuntieAnnes [randomfunctionO]);
  }
}
