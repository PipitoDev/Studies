package PersonalTests_01;

import java.util.Scanner;

public class PersonalTest_03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //Teste de um esquema de repetição básico com S ou N e outras coisas.
        char loop;
        do {
            System.out.println("Deseja repetir o programa ? S/N");
            loop=scan.next().charAt(0);
            while(loop!='S' && loop!='N'){
                System.out.println("Resposta inválida, use apenas S ou N.");
                loop=scan.next().charAt(0);
            }
            if(loop=='S'){
                System.out.println("Testando com S no 'if'!");
            } else {
                System.out.println("Testando com N no 'if'!");
            }
            switch(loop){
                case 'S'-> System.out.println("Testando com S no 'switch'!");
                default -> System.out.println("Testando com N no 'switch'!");
            }
        } while(loop!='N');
        scan.close();
    }
}
