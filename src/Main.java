import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        initialMessage();

        Player player = new Player();
        Enemy enemy = new Enemy();

        //LÓGICA DE TURNOS
        do {
            ShowHealth(player, enemy);
            //RANDOM NUMBERS
            Random normal = new Random();
            int randomNumberForNormalAttack = normal.nextInt(5);

            Random allOut = new Random();
            int randomNumberForAllOutAttack = allOut.nextInt(10);

            Random heal = new Random();
            int randomNumberForHeal = heal.nextInt(8);
            //END RANDOM NUMBERS


            //TURNO JUGADOR
            //START MENU SELECTION LOGIC
            System.out.println("1. Normal Attack: " + player.stringNormalAttack(randomNumberForNormalAttack));
            System.out.println("2. All Out Attack: " + player.stringAllOutAttack(randomNumberForAllOutAttack));
            System.out.println("3. Heal: " + player.stringHeal());

            Scanner menuSelection = new Scanner(System.in);
            int menuSelectionInput = menuSelection.nextInt();

            while (menuSelectionInput != 1 && menuSelectionInput != 2 && menuSelectionInput != 3) {
                System.out.println("1. Normal Attack: " + player.stringNormalAttack(randomNumberForNormalAttack));
                System.out.println("2. All Out Attack: " + player.stringAllOutAttack(randomNumberForAllOutAttack));
                System.out.println("3. Heal: " + player.stringHeal());

                menuSelection = new Scanner(System.in);
                menuSelectionInput = menuSelection.nextInt();
            }
            //END MENU SELECTION LOGIC

            switch (menuSelectionInput) {
                case 1:
                    enemy.TakeDamage(player.intNormalAttack(randomNumberForNormalAttack));
                    break;

                case 3:
                    if (randomNumberForHeal % 2 == 0) player.Heal(player.intHeal(randomNumberForHeal));
                    else player.TakeDamage(player.intHeal(randomNumberForHeal));
                    break;

                default:
                    int allOutMinimumPossibleDamage = player.intAllOutAttack(randomNumberForAllOutAttack);
                    Random allOutMaximumPossibleNumber =  new Random();
                    enemy.TakeDamage(allOutMaximumPossibleNumber.nextInt(20000 - allOutMinimumPossibleDamage + 1) + allOutMinimumPossibleDamage);
                    break;
            };

            //FIN TURNO JUGADOR
            //TURNO ENEMIGO
            if(enemy.health > 5000){
                player.TakeDamage(enemy.DoDamage());
            }else{
                enemy.Heal();
            }
            //FIN TURNO ENEMIGO

        }while (player.health > 0 && enemy.health > 0);

        if(player.health < 0){
            System.out.println("Tu vida ha llegado a 0 y has perdido la batalla. A practicar matematicas y seguir adelante!");
        }else{
            System.out.println("Tu enemigo cae y su arma choca contra el suelo. Eres el justo ganador de esta pelea.");
        }
    }

    public static void initialMessage(){
        System.out.println("""
                Hello! This is really simple game, it's part of Calculus I. The idea behind is that this is an RPG battle. Like from any other RPG, \
                but the damage done to your enemy and heal done to yourself are calculated by functions.
                 \
                NORMAL ATTACK: this attack is calculated by random functions but the input will always be f(5) and the output damage will be the result of the function.
                 \
                ALL OUT ATTACK: this attack is calculated by an inequality with an x. The output will always be x > n, which means that the output damage done will be > x.
                 \
                HEAL: the heal has 75% of actually healing, and a 25% chance of damaging you. It works with a function and x can take a value between 2, 4, 5, 6, 7, 8, 10 and 12. If the number randomly picked is even, the heal will work, healing you the output amount. But, if the number is odd, the work won't heal, and it will actually hurt you.
                Your enemy works exactly like you do, but he always goes all out, except when he finds himself in trouble. Then, he will try to heal. \
                His heal works the same was as you do, so he can heal or kill himself trying.
                Knowing this, good luck! And thank you for playing!""");
    }

    static void ShowHealth(Player player, Enemy enemy){
        System.out.println("Tu vida restante: " + player.health);
        System.out.println("Enemigo vida restante: " + enemy.health);
    }


}