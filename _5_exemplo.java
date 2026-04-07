package exemplos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _5_exemplo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);//função de receber dados externos
        String text;
        int numb;
        double point;

        System.out.println("Digite seu nome:");
        text = scan.nextLine();
        System.out.println("Digite sua idade:");
        numb=scan.nextInt();
        if (numb<18) System.out.println("Menor de idade.");
                else System.out.println("Maior de idade");
        System.out.println("Digite sua altura:");
        point = scan.nextDouble();
        System.out.printf("Resumo de tudo: "+text+", "+numb+", %.2f", point);
        scan.close();

        /*
        scan.nextLine();//recebe tipo texto(String), sem o Line, não será possível dar espaço
        scan.nextInt();//recebe tipo inteiro(int)
        scan.nextDouble();//recebe tipo decimal(double)
        */


    }
}
