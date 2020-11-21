import java.util.Scanner;
import java.util.Random;

public class FoodInternationalApp {

    public static void main(String[] args) {
        int select;
        int countmenu1 = 0;
        Member member1 = null, member2 = null, member3 = null, member4 = null, member5 = null;
        String information = "Welcome to application << What do you want to eat ? >> \n"
                + "   * Purpose of this application is to introduce interesting international dishes\n     from popular restaurants in Thailand. Including information on restaurant location, food name and food price. * \n"
                + "   * By the outstanding features of this app are randomizing one menu of the restaurant's interesting food in order \n     to generate more excitement by random the recommended foods to you. I hope you feel good with this app. * ";
        String menu = "\n--------------------" + "\n'MENU'\n1. add member \n"
                + "2. show all members\n"
                + "3. Interesting international food (and recommended food)\n"
                + "0. exit";
        Scanner scn = new Scanner(System.in);
        System.out.println(information);
        System.out.println(menu);

        do {
            System.out.print("--------------------" + "\n" + "Select menu : ");
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
                            System.out.println("\n" + "----------------------" + "\n" + menu);
                            break;
                        case 1:
                            countmenu1++;
                            member2 = new Member(getNameFromKeyboad(scn), getIdFromKeyboad(scn));
                            System.out.println("\n" + "----------------------" + "\n" + menu);
                            break;
                        case 2:
                            countmenu1++;
                            member3 = new Member(getNameFromKeyboad(scn), getIdFromKeyboad(scn));
                            System.out.println("\n" + "----------------------" + "\n" + menu);
                            break;
                        case 3:
                            countmenu1++;
                            member4 = new Member(getNameFromKeyboad(scn), getIdFromKeyboad(scn));
                            System.out.println("\n" + "----------------------" + "\n" + menu);
                            break;
                        case 4:
                            countmenu1++;
                            member5 = new Member(getNameFromKeyboad(scn), getIdFromKeyboad(scn));
                            System.out.println("\n" + "----------------------" + "\n" + menu);
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

//----------------case3 InternationalFood section!------------------------------//              
                case 3:
                  System.out.println("you select : [Interesting international food (and recommended food)]");
                    String[] nationality = {"\n'What nationality food do you want'","1.Thaifood", "2.Japanesefood", "3.Italianfood", "4.Chinesefood", "5.Americanfood "};
                        for (int i = 0; i < nationality.length; i++) {
                    System.out.println(nationality[i]);
                    }
                        
                    System.out.println("\n! Random Function !");
                    
                    String[] randomfoodThai = {"Pork Satay 70 THB", "Fried Fish Wonton 120 THB", "Roasted Pork 120 THB", "Steamed Sea Bass with Lemon 350 THB", "Sour Soup with Prawn & Mixed Vegetables 150 THB"};
                        Random a = new Random();
                        int randomfunction = a.nextInt(randomfoodThai.length);
                        System.out.println(randomfoodThai[randomfunction]);
                    
                    System.out.println(menu);    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    break;
                    
                    
                  
                    
                    
                    
                    
            }
        } while (select != 0);
        {
            System.out.println("\n<<Exit>>" + "\nThank you !!!");
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
