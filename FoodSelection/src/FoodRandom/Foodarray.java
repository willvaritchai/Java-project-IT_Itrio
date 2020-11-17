/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodRandom;

import java.util.Random;

/**
 *
 * @author Student
 */
public class Foodarray {

    public static void main(String[] args) {

        String[] randomfoodItalian1 = {"Tuna Salad 273 THB", "Big Mama Salad 279 THB", "Pizza Salmon 412 THB", "Crab Spaghetti 343 THB", "Mussels Baked With Cheese 380 THB"};
        Random r = new Random();
        int randomfunction = r.nextInt(randomfoodItalian1.length);
        System.out.println(randomfoodItalian1[randomfunction]);

    }
}
