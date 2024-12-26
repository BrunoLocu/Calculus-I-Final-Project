import java.util.Random;
import java.util.Scanner;

public class Menu {
    //Cada vez que se abre el menu, se seleccionarán los valores random para seleccionar las funciones del ataque normal
    public void MenuSelection(int menuSelectionNumber){

        //NORMAL ATTACK
        Random normalAttackRand = new Random();
        int randomNumberForNormalAttack = normalAttackRand.nextInt(5);
        int constant = 5;

//        //NORMAL INT FUNCTIONS
//        int intNormalAttackFunction1 = (6 * constant + 11) * 9 - 10 + 141;
//        int intNormalAttackFunction2 = (1 * constant + 7) * 4 - 8 + 960;
//        int intNormalAttackFunction3 = (4 * constant + 8)  * 5 - 4 + 1364;
//        int intNormalAttackFunction4 = (10 * constant + 1) * 5 - 7 + 1752;
//        int intNormalAttackFunction5 = (4 * constant + 7) * 9 - 10 + 2267;
//        int[] intNormalAttackFunctions = {intNormalAttackFunction1, intNormalAttackFunction2, intNormalAttackFunction3, intNormalAttackFunction4, intNormalAttackFunction5};
//
//        //NORMAL STRING FUNCTIONS
//        String stringNormalAttackFunction1 = "(6 * constant + 11) * 9 - 10 + 141";
//        String stringNormalAttackFunction2 = "(1 * constant + 7) * 4 - 8 + 960";
//        String stringNormalAttackFunction3 = "(4 * constant + 8)  * 5 - 4 + 1364";
//        String stringNormalAttackFunction4 = "(10 + constant + 1) * 5 - 7 + 1752";
//        String stringNormalAttackFunction5 = "(4 * constant + 7) * 9 - 10 + 2267";
//        String[] stringNormalAttackFunctions = {stringNormalAttackFunction1, stringNormalAttackFunction2, stringNormalAttackFunction3, stringNormalAttackFunction4, stringNormalAttackFunction5};
//        //END NORMAL ATTACK

//        //ALL OUT ATTACK
//        Random allOutAttackRand = new Random();
//        int randomNumberForAllOutAttack = allOutAttackRand.nextInt(10);
//
//        //ALL OUT INT INECUATIONS
//        int intAllOutAttackInecuation1 = 598;
//        int intAllOutAttackInecuation2 = 1280;
//        int intAllOutAttackInecuation3 = 1962;
//        int intAllOutAttackInecuation4 = 2647;
//        int intAllOutAttackInecuation5 = 3272;
//        int intAllOutAttackInecuation6 = 4000;
//        int intAllOutAttackInecuation7 = 4669;
//        int intAllOutAttackInecuation8 = 5333;
//        int intAllOutAttackInecuation9 = 6000;
//        int intAllOutAttackInecuation10 = 9000;
//        int[] intAllOutAttackInecuations = {intAllOutAttackInecuation1, intAllOutAttackInecuation2, intAllOutAttackInecuation3, intAllOutAttackInecuation4, intAllOutAttackInecuation5, intAllOutAttackInecuation6, intAllOutAttackInecuation7, intAllOutAttackInecuation8, intAllOutAttackInecuation9, intAllOutAttackInecuation10};
//
//        //ALL OUT STRING INECUATIONS
//        String stringAllOutAttackInecuation1 = "(3x+15)/2-5 < 900";
//        String stringAllOutAttackInecuation2 = "5x-10+x/4 < 1800";
//        String stringAllOutAttackInecuation3 = "2x+50-x/5 < 2700";
//        String stringAllOutAttackInecuation4 = "(4x-30)/3+15 < 3600";
//        String stringAllOutAttackInecuation5 = "7x-x/2+20 < 4500";
//        String stringAllOutAttackInecuation6 = "(8x+10)/4-25 < 5400";
//        String stringAllOutAttackInecuation7 = "3x+x/3-50 < 6300";
//        String stringAllOutAttackInecuation8 = "6x+x/4+10 < 7200";
//        String stringAllOutAttackInecuation9 = "(10x+20)/5-100 < 8100";
//        String stringAllOutAttackInecuation10 = "4x-15+x/6 < 9000";
//        String[] stringAllOutAttackInecuations = {stringAllOutAttackInecuation1, stringAllOutAttackInecuation2, stringAllOutAttackInecuation3, stringAllOutAttackInecuation4, stringAllOutAttackInecuation5, stringAllOutAttackInecuation6, stringAllOutAttackInecuation7, stringAllOutAttackInecuation8, stringAllOutAttackInecuation9, stringAllOutAttackInecuation10};
//        //END ALL OUT ATTACK

        //START HEAL
//        Random healRand = new Random();
//        int randomNumberForHeal = healRand.nextInt(8);
//        int[] healingNumbers = {2, 4, 6, 8, 10, 12, 5, 7};
//        int healNumber = healingFunction(healingNumbers[randomNumberForHeal]);
//        String healFunction = "f(x) = 1000+2000(2^(x-2)/4-1)";
        //END HEAL


        //START MENU SELECTION LOGIC
//        System.out.println("1. Normal Attack: " + stringNormalAttackFunctions[randomNumberForNormalAttack]);
//        System.out.println("2. All Out Attack: " + stringAllOutAttackInecuations[randomNumberForAllOutAttack]);
//        System.out.println("3. Heal: " + healFunction);
//
//
//        while (menuSelectionNumber != 1 && menuSelectionNumber != 2 && menuSelectionNumber != 3) {
//            System.out.println("1. Normal Attack: " + stringNormalAttackFunctions[randomNumberForNormalAttack]);
//            System.out.println("2. All Out Attack: " + stringAllOutAttackInecuations[randomNumberForAllOutAttack]);
//            System.out.println("3. Heal: " + healFunction);
//            menuSelection = new Scanner(System.in);
//            menuSelectionInput = menuSelection.nextInt();
//        }
//        //END MENU SELECTION LOGIC

//        return switch (menuSelectionNumber) {
//            case 1 -> intNormalAttackFunctions[randomNumberForNormalAttack];
//            case 3 -> healNumber;
//            default -> intAllOutAttackInecuations[randomNumberForAllOutAttack];
//        };
    }

//    public static int healingFunction(int randomNumberForHeal) {
//        return 1000 + 2000 * (pow(2,(randomNumberForHeal-2)/4) - 1);
//    }
//
//    public static int pow(int base, int exponent){
//        int counter = 0;
//        for(int i = 1; i <= exponent; i++){
//            counter += base*base;
//        }
//        return counter;
//    }
}
