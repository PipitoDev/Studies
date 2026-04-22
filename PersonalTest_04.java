package PersonalTests_01;

import java.util.Random;
import java.util.Scanner;

public class PersonalTest_04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random random=new Random();
        int numPlayer, numSystem, condition, numGame;
        char loop;
        do {
            System.out.println("Jogo com números e condições!");
            System.out.println("Insira um número de 0 a 100:");
            numPlayer=scan.nextInt();
            while(numPlayer<0||numPlayer>100){
                System.out.println("""
                        Um número inválido foi inserido.
                        Tente novamente apenas com valores de 0 a 100:""");
                numPlayer=scan.nextInt();
            }
            numSystem=random.nextInt(0, 101);
            condition=random.nextInt(1, 5);
            numGame=random.nextInt(0, 101);
            switch (condition){
                case 1-> System.out.println("A condição é: O maior número vence!");
                case 2-> System.out.println("A condição é: O menor número vence!");
                case 3-> System.out.printf("A condição é: O número mais próximo de %d vence!%n", numGame);
                case 4-> System.out.printf("A condição é: O número mais distante de %d vence!%n", numGame);
            }
            System.out.printf("O jogador escolheu %d!%n", numPlayer);
            System.out.printf("O sistema escolheu %d!%n", numSystem);
            System.out.println(". . .");
            if(condition==1){
                if(numPlayer>numSystem){
                    System.out.printf("O jogador ganhou! %d é maior que %d!%n", numPlayer, numSystem);
                } else if(numSystem>numPlayer) {
                    System.out.printf("O sistema ganhou! %d é maior que %d!%n", numSystem, numPlayer);
                } else {
                    System.out.println("Empate! Os dois números são iguais!");
                }
            }
            if(condition==2){
                if(numPlayer<numSystem){
                    System.out.printf("O jogador ganhou! %d é menor que %d!%n", numPlayer, numSystem);
                } else if(numSystem<numPlayer){
                    System.out.printf("O sistema ganhou! %d é menor que %d!%n", numSystem, numPlayer);
                } else {
                    System.out.println("Empate! Os dois números são iguais!");
                }
            }
            if(condition==3){
                int playerDiff=Math.abs(numGame-numPlayer);
                int systemDiff=Math.abs(numGame-numSystem);
                if(playerDiff<systemDiff){
                    System.out.printf("O jogador ganhou! %d é mais próximo de %d do que o %d!%n", numPlayer, numGame, numSystem);
                } else if(systemDiff<playerDiff){
                    System.out.printf("O sistema ganhou! %d é mais próximo de %d do que o %d!%n", numSystem, numGame, numPlayer);
                } else {
                    System.out.println("Empate! Os dois números são próximos igualmente!");
                }
            }
            if(condition==4){
                int playerDiff=Math.abs(numGame-numPlayer);
                int systemDiff=Math.abs(numGame-numSystem);
                if(playerDiff>systemDiff){
                    System.out.printf("O jogador ganhou! %d é mais distante de %d do que o %d!%n", numPlayer, numGame, numSystem);
                } else if(systemDiff>playerDiff){
                    System.out.printf("O sistema ganhou! %d é mais distante de %d do que o %d!%n", numSystem, numGame, numPlayer);
                } else {
                    System.out.println("Empate! Os dois números são distantes igualmente!");
                }
            }
            System.out.println("Repetir? S/N");
            loop=scan.next().charAt(0);
            while(loop!='S'&&loop!='N'){
                System.out.println("Resposta inválida, use apenas S ou N:");
                loop=scan.next().charAt(0);
            }
            if(loop=='S'){
                System.out.println("""
                        . . .
                        . . .
                        . . .""");
            }
        } while(loop!='N');
        scan.close();
    }
}
