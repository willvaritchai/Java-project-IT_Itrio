package FoodInternationalApplication;

import EnumForFoodSelection.NationalityFood;
import java.util.Scanner;

public class FoodInternationalApp {

    public static void main(String[] args) {
        int select;
        int countmenu1 = 0;
        Member member1 = null, member2 = null, member3 = null, member4 = null, member5 = null;
        String information = "Welcome to application << What do you want to eat ? >> \n"
                + "   * Purpose of this application is to introduce interesting international dishes\n     from popular restaurants in Thailand. Including information on restaurant location, food name and food price. * \n"
                + "   * By the outstanding features of this app are randomizing one menu of the restaurant's interesting food in order \n     to generate more excitement by random the recommended foods to you(you can skip random function by press 'n' to watch for all menus).\n     I hope you feel good with this app. * ";
        String menu = "\n--------------------" + "\n'MENU'\n1. add member \n"
                + "2. show all members\n"
                + "3. Interesting international food (and recommended food)\n"
                + "0. exit";
        Scanner scn = new Scanner(System.in);
        System.out.println(information);
        System.out.println(menu);

        do {
            System.out.print("--------------------" + "\n\nSelect menu : ");
            select = scn.nextInt();
            scn.nextLine();
            switch (select) {

//----------------case1 AddMember menu section!------------------------------//              
                case 1:
                    System.out.println("you select : [AddMember]");

                    switch (countmenu1) {
                        case 0:
                            countmenu1++;
                            member1 = new Member(getNameFromKeyboad(scn), getIdFromKeyboad(scn));
                            System.out.println(menu);
                            break;
                        case 1:
                            countmenu1++;
                            member2 = new Member(getNameFromKeyboad(scn), getIdFromKeyboad(scn));
                            System.out.println(menu);
                            break;
                        case 2:
                            countmenu1++;
                            member3 = new Member(getNameFromKeyboad(scn), getIdFromKeyboad(scn));
                            System.out.println(menu);
                            break;
                        case 3:
                            countmenu1++;
                            member4 = new Member(getNameFromKeyboad(scn), getIdFromKeyboad(scn));
                            System.out.println(menu);
                            break;
                        case 4:
                            countmenu1++;
                            member5 = new Member(getNameFromKeyboad(scn), getIdFromKeyboad(scn));
                            System.out.println(menu);
                            break;
                    }
                case 99:
//--Need to has this Special-Case because, if doesnot has this case "case 2 will not work  "--//              
                    break;

//----------------case2 ShowAllMembers menu section!------------------------------//              
                case 2:
                    if (member1 != null) {
                        System.out.println("you select : [ShowAllMembers]" + "\n\n" + member1.toString());
                    }

                    if (member2 != null) {
                        System.out.println(member2.toString());

                    }

                    if (member3 != null) {
                        System.out.println(member3.toString());

                    }
                    if (member4 != null) {
                        System.out.println(member4.toString());

                    }

                    if (member5 != null) {
                        System.out.println(member5.toString());
                    }

                case 100:
//--Need to has this Special-Case because, if doesnot has this case "case 3 will not work  "--//              
                    break;

//----------------case3 InternationalFood section!------------------------------//              
                case 3:
                    System.out.println("you select : [Interesting international food (and recommended food)]");
                    String[] nationality = {"\n'What nationality food do you want'", "1.Thaifood", "2.Japanesefood", "3.Italianfood", "4.Chinesefood", "5.Americanfood "};
                    for (int i = 0; i < nationality.length; i++) {
                        System.out.println(nationality[i]);
                    }

                    int num = FoodSelection.readNum();
                    NationalityFood SelectNationalityFood = FoodSelection.foodSelection(num);
                    System.out.println("you select [" + SelectNationalityFood + "]");

                    switch (num) {

                        case 1:
                            System.out.println("\n'List of Thai Restaurant'");
                            System.out.println("- Tam leung tong [Location : Thung Khru Sub-district, Thung Khru District, Bangkok 10140]");
                            System.out.println("- 94 Phochana [Location : 618 Soi Pracha Uthit 84/3, Thung Khru Subdistrict, Thung Khru District, Bangkok 10140]");
                            System.out.println("- Kaysorn restaurant [Location : 559 18 Charoen Rat Road, Bang Khlo, Bang Kho Laem, Bangkok 10120]");
                            System.out.println("--------------------------");
                            String randomizing = FoodSelection.randomFunctionThailandRes();
                            System.out.println("\n  \n  . \n  . \n  . \n\nThank you ! \nHope that you will choose to see the food menu of various restaurants. Happily !");
                            break;
                        case 2:
                            System.out.println("\n'List of Japanese Restaurant'");
                            System.out.println("- Fuji Restaurant [Location : Central Plaza Rama 2, 4th Floor, Rama 2 Road, Samae Dam, Bang Khun Thian, Bangkok 10150]");
                            System.out.println("- Sushi Hiro [Location : Borommaratchachonnani Road, Bangkok (The shop is located on the 1st floor Community Mall, the sense project Pinklao, next to Central Pinklao)]");
                            System.out.println("- Zen Restaurant [Location : 160 Rama 2 Road, Samae Dam, Bang Khun Thian, Bangkok 10150]");
                            System.out.println("--------------------------");
                            String randomizing2 = FoodSelection.randomFunctionJapaneseRes();
                            System.out.println("\n  \n  . \n  . \n  . \n\nThank you ! \nHope that you will choose to see the food menu of various restaurants. Happily !");
                            break;
                        case 3:
                            System.out.println("\n'List of Italian Restaurant'");
                            System.out.println("- Big mama Pizzeria [Location : 139 Soi Sukhumvit 21 North Klongtoey, Watthana, Bangkok 10110]");
                            System.out.println("- Lenzi Tuscan Kitchen [Location : 69/1-2 Ruamruedee 2 Wittayu Road 10330]");
                            System.out.println("- La Scarpetta Bangkok [Location : 1495 Charoenkrung Road, Silom, Bangrak, Bangkok 10500]");
                            System.out.println("--------------------------");
                            String randomizing3 = FoodSelection.randomFunctionItalianRes();
                            System.out.println("\n  \n  . \n  . \n  . \n\nThank you ! \nHope that you will choose to see the food menu of various restaurants. Happily !");
                            break;
                        case 4:
                            System.out.println("\n'List of Chinese Restaurant'");
                            System.out.println("- Ruenros Restaurant [Location : 762/2 Bangkok Square Project, Rama III Road, Bang Phong Pang, Yan Nawa, Bangkok 10120]");
                            System.out.println("- HUA SENG HONG [Location : Central Rama 2, 4th Floor, Room No. 403, Rama 2 Road, Samae Dam, Bang Khun Thian, Bangkok 10150]");
                            System.out.println("- Tow pochana [Location : 69 Soi Rat Burana 16 (Suksawat 25, Suksawat Rd., Bangpakok, Rat Burana, Bangkok 10140]");
                            System.out.println("--------------------------");
                            String randomizing4 = FoodSelection.randomFunctionChaineseRes();
                            System.out.println("\n \n  . \n  . \n  . \n\nThank you ! \nHope that you will choose to see the food menu of various restaurants. Happily !");
                            break;
                        case 5:
                            System.out.println("\n'List of American Restaurant'");
                            System.out.println("- McDonalds M-Park Rama2 [Location : 119/1 Rama 2 Road, Samae Dam, Bang Khun Thian, Bangkok 10150]");
                            System.out.println("- ROAST coffee&eatery [Location : The COMMONS 335 Soi Thonglor 17, Khlong Tan Nuea, Watthana, Bangkok 10110]");
                            System.out.println("- Auntie Anne's [Location : 160 Rama 2 Road, Bangkok (Central Rama 2, 1st floor, Room K 07/1)]");
                            System.out.println("--------------------------");
                            String randomizing5 = FoodSelection.randomFunctionAmericanRes();
                            System.out.println("\n  \n  . \n  . \n  . \n\nThank you ! \nHope that you will choose to see the food menu of various restaurants. Happily !");
                        default:
                            break;
                    }
                    break;
            }
        } while (select != 0);
        {
            System.out.println("\n<<Exit>>" + "\n   . \n   . \n   . \n\nThank you for using this application. !!!");
            System.out.println("\n  " + member1);
            System.out.println("  " + member2);
            System.out.println("  " + member3);
            System.out.println("  " + member4);
            System.out.println("  " + member5);
        }

    }

    public static String getNameFromKeyboad(Scanner input) {
        System.out.print("\n" + "Input member name : ");
        return input.nextLine();
    }

    public static long getIdFromKeyboad(Scanner input) {
        System.out.print("Input id : ");
        return input.nextLong();
    }

}
