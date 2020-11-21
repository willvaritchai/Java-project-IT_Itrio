
import java.util.Scanner;

public class FitnessApp {

    public static void main(String[] args) {
        int select;
        int countmenu1 = 0;
        int countmenu2 = 0;
        Member member1 = null, member2 = null, member3 = null, member4 = null, member5 = null;
        String information = "Welcome to application ''";
        String menuStr = "\n1. add member \n"
                + "2. show all members\n"
                + "3. edit member \n"
                + "0. exit";
        Scanner scn = new Scanner(System.in);

        System.out.println(menuStr);

        do {
            System.out.print("\n" + "--------------------"+"\n"+"Select menu : ");
            select = scn.nextInt();
            scn.nextLine();
            switch (select) {

//----------------case1 section!------------------------------//              
                case 1:
                    System.out.println("you select : " + select);

                    switch (countmenu1) {
                        case 0:
                            countmenu1++;
                            member1 = new Member(getNameFromKeyboad(scn), getIdFromKeyboad(scn));
                            System.out.println("\n"+"----------------------" + "\n" + menuStr);
                            break;
                        case 1:
                            countmenu1++;
                            member2 = new Member(getNameFromKeyboad(scn), getIdFromKeyboad(scn));
                                                        System.out.println("\n"+"----------------------" + "\n" + menuStr);
                            break;
                        case 2:
                            countmenu1++;
                            member3 = new Member(getNameFromKeyboad(scn), getIdFromKeyboad(scn));
                            System.out.println("\n"+"----------------------" + "\n" + menuStr);
                            break;
                        case 3:
                            countmenu1++;
                            member4 = new Member(getNameFromKeyboad(scn), getIdFromKeyboad(scn));
                            System.out.println("\n"+"----------------------" + "\n" + menuStr);
                            break;
                        case 4:
                            countmenu1++;
                            member5 = new Member(getNameFromKeyboad(scn), getIdFromKeyboad(scn));
                            System.out.println("\n"+"----------------------" + "\n" + menuStr);
                            break;
                    }
//-------------------------------------------------------------
                case 3:

                    break;
                case 2:
                    if (member1 != null) {
                        System.out.println("you select : " + select + "\n" + "\n" + "'Show all members'" + "\n" + member1.toString());
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
        System.out.print("Input Id : ");
        return input.nextLong();
    }

}
