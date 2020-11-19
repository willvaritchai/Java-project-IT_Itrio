/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FoodRandom;

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
        String[] randomfoodThai = {"Pork Satay 70 THB", "Fried Fish Wonton 120 THB", "Roasted Pork 120 THB", "Steamed Sea Bass with Lemon 350 THB", "Sour Soup with Prawn & Mixed Vegetables 150 THB"};
        Random a = new Random();
        int randomfunction = a.nextInt(randomfoodThai.length);
        System.out.println(randomfoodThai[randomfunction]);
  }
}
