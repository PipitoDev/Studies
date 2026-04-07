package exemplos;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int hours;

        System.out.println("Digite a hora do dia:");
        hours=scan.nextInt();
        if (hours>=1&&hours<=11){
            System.out.println("Bom dia !");
        } else if (hours>=12&&hours<=18) {
            System.out.println("Boa tarde !");
        } else if (hours>=19&&hours<=23||hours==0) {
            System.out.println("Boa noite !");
        } else{
            System.out.println("O horário informado é inválido.");
        }
    }
}
