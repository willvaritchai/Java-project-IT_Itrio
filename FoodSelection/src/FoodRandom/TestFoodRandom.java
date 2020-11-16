package FoodRandom;

import java.util.Scanner;

public class TestFoodRandom {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("<< Welcome to application --What to eat ?-- >>");
        System.out.println("");
        System.out.println("Select the nationality of food you are interested in.");
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
                System.out.println("---List of Italianfoods---");
                System.out.println("1.Big mama Pizzeria [Location : 139 ซอย สุขุมวิท 21 North Klongtoey sub-district, เขตวัฒนา กรุงเทพมหานคร 10110]");
                System.out.println("2.Lenzi Tuscan Kitchen [Location : 69/1-2 Ruamruedee 2 ถนน วิทยุ 10330]");
                System.out.println("3.La Scarpetta Bangkok [Location : 1495 ถนน เจริญกรุง แขวง สีลม เขตบางรัก กรุงเทพมหานคร 10500]");
                System.out.println("--------------------------");
                int num2 = FoodSelection.readNumSecond();
                System.out.println("You selected : " + FoodSelection.secondSelection(num2));
                break;
            case 2:
                System.out.println("---List of Japanesefoods---");
                System.out.println("1.Fuji Restaurant [Location : อาคารศูนย์การค้าเซ็นทรัล พลาซ่า พระราม 2 ชั้น 4 ถ.พระราม 2 แสมดำ บางขุนเทียน กรุงเทพมหานคร 10150]");
                System.out.println("2.Sushi Hiro [Location : ถนน บรมราชชนนี กรุงเทพมหานคร (ร้านตั้งอยู่ที่ชั้น1 คอมมูนิตี้มอล โครงการ the sense ปิ่นเกล้า ข้างๆ เซนทรัลปิ่นเกล้า)]");
                System.out.println("3.Zen Restaurant [Location : 160 ถ. พระราม 2 แขวงแสมดำ เขตบางขุนเทียน กรุงเทพมหานคร 10150]");
                System.out.println("--------------------------");
                int num3 = FoodSelection.readNumThird();
                System.out.println("You selected :" + FoodSelection.thirdSelection(num3));
                break;
            case 3:
                System.out.println("---List of Thaifood---");
                System.out.println("1.Tam leung tong [Location : แขวง ทุ่งครุ เขตทุ่งครุ กรุงเทพมหานคร 10140]");
                System.out.println("2.94 Phochana [Location : 618 ซอย ประชาอุทิศ 84/3 แขวง ทุ่งครุ เขตทุ่งครุ กรุงเทพมหานคร 10140]");
                System.out.println("3.Kaysorn restaurant [Location : 559 18 ถนน เจริญราษฎร์ แขวง บางโคล่ เขตบางคอแหลม กรุงเทพมหานคร 10120]");
                System.out.println("--------------------------");
                int num4 = FoodSelection.readNumFourth();
                System.out.println("You selected :" + FoodSelection.fourthSelection(num4));
                break;
            case 4:
                System.out.println("---List of Chinesefood---");
                System.out.println("1.Ruenros Restaurant [Location : 762/2 โครงการบางกอกสแควร์ ถ. พระรามที่ 3 แขวง บางโพงพาง เขต ยานนาวา กรุงเทพมหานคร 10120]");
                System.out.println("2.HUA SENG HONG [Location : เซ็นทรัลพระราม 2 ชั้นที่ 4 ห้องเลขที่ 403, ถนน พระรามสอง แขวง แสมดำ เขตบางขุนเทียน กรุงเทพมหานคร 10150]");
                System.out.println("3.Tow pochana [Location : 69 ซอย ราษฏร์บูรณะ16 (สุขสวัสดิ์ 25 ถ. สุขสวัสดิ์ แขวง บางปะกอก เขตราษฎร์บูรณะ กรุงเทพมหานคร 10140]");
                System.out.println("--------------------------");
                int num5 = FoodSelection.readNumFifth();
                System.out.println("You selected :" + FoodSelection.fifthSelection(num5));
                break;
            case 5:
                System.out.println("---List of Americanfood---");
                System.out.println("1.McDonalds M-Park Rama2 [Location : 119/1 ถ. พระราม 2 แสมดำ บางขุนเทียน กรุงเทพมหานคร 10150]");
                System.out.println("2.ROAST coffee&eatery [Location : The COMMONS 335 ซอย ทองหล่อ 17 แขวง คลองตันเหนือ เขตวัฒนา กรุงเทพมหานคร 10110]");
                System.out.println("3.Auntie Anne's [Location : 160 ถนนพระราม 2 กรุงเทพมหานคร (ห้างเซ็นทรัลพระราม 2 ชั้น 1 ห้อง K 07/1)]");
                System.out.println("--------------------------");
                int num6 = FoodSelection.readNumSixth();
                System.out.println("You selected :" + FoodSelection.sixthSelection(num6));
            default:
                System.out.println("Please select 1 to 3");
                break;
        }

    }

}
