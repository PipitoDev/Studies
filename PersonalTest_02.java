package PersonalTests_01;

import java.util.Scanner;

public class PersonalTest_02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double num1, num2, result=0;
        char operator;
        System.out.println("Digite o primeiro número:");
        num1=scan.nextDouble();
        System.out.println("Digite o segundo número:");
        num2=scan.nextDouble();
        System.out.println("""
                Digite o operador:
                Útilize apenas '+' para somar, '-' para subtrair, 'x' para múltiplicar,
                '/' para dividir e '^' para elevar.""");
        operator=scan.next().charAt(0);
        while(operator!='+' && operator!='-' && operator!='x' && operator!='/' && operator!='^'){
            System.out.println("""
                    Um operador inválido foi inserido.
                    Tente novamente apenas com '+' para somar, '-' para subtrair, 'x' para múltiplicar,
                    '/' para dividir e '^' para elevar.""");
            operator=scan.next().charAt(0);
        }
        switch (operator){
            case '+'-> result=num1+num2;
            case '-'-> result=num1-num2;
            case 'x'-> result=num1*num2;
            case '/'-> result=num1/num2;
            case '^'-> result=(Math.pow(num1, num2));
        }
        System.out.printf("""
                Resultado do cálculo: %f
                Resultado sem casa decimal: %d""", result, (int)result);
        scan.close();
    }
}
