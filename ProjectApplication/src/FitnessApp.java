import java.util.Scanner;
public class FitnessApp {
    public static void main(String[] args) {
        int select;
        int count = 0;
        Member member1 = null, member2 = null, member3 = null, member4 = null, member5 = null;
        String menuStr = "1. add member \n"
                + "2. edit member \n"
                + "3. show all members\n"
                + "0. exit";
        Scanner scn = new Scanner(System.in);

        System.out.println(menuStr);

        do {
            System.out.print("Select menu: ");
            select = scn.nextInt();
            scn.nextLine();
            switch (select) {
                case 1:
//-------------------------------------------------------------

                    switch (count) {
                        case 0:
                            count++;
                            member1 = new Member(getNameFromKeyboad(scn), getWeightFromKeyboad(scn), getHeightFromKeyboad(scn));
                            break;
                        case 1:
                            count++;
                            member2 = new Member(getNameFromKeyboad(scn), getWeightFromKeyboad(scn), getHeightFromKeyboad(scn));
                            break;
                        case 2:
                            count++;
                            member3 = new Member(getNameFromKeyboad(scn), getWeightFromKeyboad(scn), getHeightFromKeyboad(scn));
                            break;
                    }

//-------------------------------------------------------------
                    break;
                case 2:
                    break;
                case 3:
                    if (member1 != null) {
                        System.out.println(member1.toString());
                    }

                    if (member2 != null) {
                        System.out.println(member2.toString());
                    }

                    if (member3 != null) {
                        System.out.println(member3.toString());
                    }
                    break;
            }
            System.out.println(select);
        } while (select != 0);
    }

    public static String getNameFromKeyboad(Scanner input) {
        System.out.print("Input member name : ");
        return input.nextLine();
    }

    public static int getWeightFromKeyboad(Scanner input) {
        System.out.print("Input weight(kg.) : ");
        return input.nextInt();
    }

    public static int getHeightFromKeyboad(Scanner input) {
        System.out.print("Input height(cm.) : ");
        return input.nextInt();
    }

}
