import MapRelated.MapOwner;
import MapRelated.OwnFuncTester;
import MapRelated.PremadeFuncTester;

import java.util.Scanner;

public class Executable {
    private static PremadeFuncTester premadeFuncTester = new PremadeFuncTester();
    private static OwnFuncTester ownFuncs = new OwnFuncTester();

    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu() {
        Scanner in = new Scanner(System.in);
        do {
            System.out.println(" 1- first part  2 - second part  3 - third part  other - exit");
            switch (in.nextInt()) {
                case 1:
                    firstMenu();
                    break;
                case 2:
                    secondMenu();
                    break;
                case 3:
                default:
                    return;
            }
        }while(true);
    }

    private static void firstMenu() {
        Scanner in = new Scanner((System.in));
        int exit = 0;
        do {
            System.out.println("1 - add  2 - delete  3 - see all  4 - go through all  other - exit");
            exit = in.nextInt();
            premadeFuncTester.basicFunctionality(exit);
        } while(exit != 0);
    }

    private static void secondMenu() {
        Scanner in = new Scanner((System.in));
        int exit = 0;
        do {
            System.out.println("1 - sort  2 - copy  other - exit");
            exit = in.nextInt();
            ownFuncs.ownFunctionality(exit);
        } while(exit != 0);
    }
}
