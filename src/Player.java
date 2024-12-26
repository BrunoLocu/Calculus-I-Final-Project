import java.util.Random;

public class Player {
    int health = 100000;


    public int intNormalAttack(int randomNumber){
        int constant = 5;

        int intNormalAttackFunction1 = (6 * constant + 11) * 9 - 10 + 141;
        int intNormalAttackFunction2 = (1 * constant + 7) * 4 - 8 + 960;
        int intNormalAttackFunction3 = (4 * constant + 8)  * 5 - 4 + 1364;
        int intNormalAttackFunction4 = (10 * constant + 1) * 5 - 7 + 1752;
        int intNormalAttackFunction5 = (4 * constant + 7) * 9 - 10 + 2267;
        int[] intNormalAttackFunctions = {intNormalAttackFunction1, intNormalAttackFunction2, intNormalAttackFunction3, intNormalAttackFunction4, intNormalAttackFunction5};

        return intNormalAttackFunctions[randomNumber];
    }

    public String stringNormalAttack(int randomNumber){

        String stringNormalAttackFunction1 = "(6 * constant + 11) * 9 - 10 + 141";
        String stringNormalAttackFunction2 = "(1 * constant + 7) * 4 - 8 + 960";
        String stringNormalAttackFunction3 = "(4 * constant + 8)  * 5 - 4 + 1364";
        String stringNormalAttackFunction4 = "(10 + constant + 1) * 5 - 7 + 1752";
        String stringNormalAttackFunction5 = "(4 * constant + 7) * 9 - 10 + 2267";
        String[] stringNormalAttackFunctions = {stringNormalAttackFunction1, stringNormalAttackFunction2, stringNormalAttackFunction3, stringNormalAttackFunction4, stringNormalAttackFunction5};

        return stringNormalAttackFunctions[randomNumber];
    }

    public int intAllOutAttack(int randomNumber){
        int intAllOutAttackInecuation1 = 598;
        int intAllOutAttackInecuation2 = 1280;
        int intAllOutAttackInecuation3 = 1962;
        int intAllOutAttackInecuation4 = 2647;
        int intAllOutAttackInecuation5 = 3272;
        int intAllOutAttackInecuation6 = 4000;
        int intAllOutAttackInecuation7 = 4669;
        int intAllOutAttackInecuation8 = 5333;
        int intAllOutAttackInecuation9 = 6000;
        int intAllOutAttackInecuation10 = 9000;
        int[] intAllOutAttackInecuations = {intAllOutAttackInecuation1, intAllOutAttackInecuation2, intAllOutAttackInecuation3, intAllOutAttackInecuation4, intAllOutAttackInecuation5, intAllOutAttackInecuation6, intAllOutAttackInecuation7, intAllOutAttackInecuation8, intAllOutAttackInecuation9, intAllOutAttackInecuation10};

        return intAllOutAttackInecuations[randomNumber];
    }

    public String stringAllOutAttack(int randomNumber){
        String stringAllOutAttackInecuation1 = "(3x+15)/2-5 < 900";
        String stringAllOutAttackInecuation2 = "5x-10+x/4 < 1800";
        String stringAllOutAttackInecuation3 = "2x+50-x/5 < 2700";
        String stringAllOutAttackInecuation4 = "(4x-30)/3+15 < 3600";
        String stringAllOutAttackInecuation5 = "7x-x/2+20 < 4500";
        String stringAllOutAttackInecuation6 = "(8x+10)/4-25 < 5400";
        String stringAllOutAttackInecuation7 = "3x+x/3-50 < 6300";
        String stringAllOutAttackInecuation8 = "6x+x/4+10 < 7200";
        String stringAllOutAttackInecuation9 = "(10x+20)/5-100 < 8100";
        String stringAllOutAttackInecuation10 = "4x-15+x/6 < 9000";
        String[] stringAllOutAttackInecuations = {stringAllOutAttackInecuation1, stringAllOutAttackInecuation2, stringAllOutAttackInecuation3, stringAllOutAttackInecuation4, stringAllOutAttackInecuation5, stringAllOutAttackInecuation6, stringAllOutAttackInecuation7, stringAllOutAttackInecuation8, stringAllOutAttackInecuation9, stringAllOutAttackInecuation10};

        return stringAllOutAttackInecuations[randomNumber];
    }

    public int intHeal(int randomNumber){
        int[] healingNumbers = {2, 4, 6, 8, 10, 12, 5, 7};

        return (int) (1000 + 2000 * (Math.pow(2, (double) (healingNumbers[randomNumber] - 2) /4) - 1));
    }

    public String stringHeal(){
        return "f(x) = 1000+2000(2^(x-2)/4-1)";
    }

    public int DoDamage(int damage){
        return damage;
    }

    public void Heal(int heal){
        this.health += heal;
    }

    public void TakeDamage(int damage){
        this.health -= damage;
    }
}

