import java.util.Random;

import static java.lang.Math.pow;

public class Enemy {

    int health = 100000;

    public int DoDamage(){

        Random rand = new Random();
        int damage = rand.nextInt(10);

        //ALL OUT INT INECUATIONS
        int enemyAllOutAttackInecuation1 = 598;
        int enemyAllOutAttackInecuation2 = 1280;
        int enemyAllOutAttackInecuation3 = 1962;
        int enemyAllOutAttackInecuation4 = 2647;
        int enemyAllOutAttackInecuation5 = 3272;
        int enemyAllOutAttackInecuation6 = 4000;
        int enemyAllOutAttackInecuation7 = 4669;
        int enemyAllOutAttackInecuation8 = 5333;
        int enemyAllOutAttackInecuation9 = 6000;
        int enemyAllOutAttackInecuation10 = 9000;
        int[] enemyAllOutAttackInecuations = {enemyAllOutAttackInecuation1, enemyAllOutAttackInecuation2, enemyAllOutAttackInecuation3, enemyAllOutAttackInecuation4, enemyAllOutAttackInecuation5, enemyAllOutAttackInecuation6, enemyAllOutAttackInecuation7, enemyAllOutAttackInecuation8, enemyAllOutAttackInecuation9, enemyAllOutAttackInecuation10};

        return enemyAllOutAttackInecuations[damage];
    }

    public void Heal(){
        Random healRand = new Random();
        int randomNumberForHeal = healRand.nextInt(8);
        int[] healingNumbers = {2, 4, 6, 8, 10, 12, 5, 7};
        int healNumber = healingNumbers[randomNumberForHeal];
        int healingFunction = (int) (1000 + 2000 * (pow(2, (healNumber - 2) /4) - 1));
        this.health += healingFunction;
    }

    public void TakeDamage(int damage){
        this.health -= damage;
    }
}
