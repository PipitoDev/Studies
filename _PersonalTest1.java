import java.util.Scanner;

public class _PersonalTest1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
    int num, num1;
    String operator, repeat;
    boolean loop=false;
    boolean loop1=false;
    do{
        System.out.println("Calculadora simples de 2 valores\n" +
                "Informe o primeiro valor:");
        num=scan.nextInt();
        System.out.println("Informe o segundo valor:");
        num1=scan.nextInt();
        System.out.println("Informe o operador da expressão:\n" +
                "+: para somar, -: para subtrair, x: para multiplicar, /: para dividir");
        do{
            operator=scan.next();
            if(operator.equals("+")||operator.equals("-")||operator.equals("x")||operator.equals("/")){
                loop=true;
            } else{
                System.out.println("Um operador inválido foi inserido.\n" +
                        "Por favor, tente novamente :\n" +
                        "+: para somar, -: para subtrair, x: para multiplicar, /: para dividir");
            }
        }while(loop==false);
        if(operator.equals("+")){
            System.out.println("O resultado da operação é: "+ (num+num1));
        } else if (operator.equals("-")) {
            System.out.println("O resultado da operação é: "+ (num-num1));
        } else if (operator.equals("x")) {
            System.out.println("O resultado da operação é: "+ (num*num1));
        } else if (operator.equals("/")) {
            System.out.println("O resultado da operação é: "+ (num/num1));
        }
        System.out.println("Deseja repetir o programa ? S/N");
        do{
            repeat=scan.next();
            if(repeat.equals("S")||repeat.equals("N")){
                System.out.println("Resposta aceita!");
                loop1=true;
            } else{
                System.out.println("Resposta inadequada, tente novamente: S/N");
            }
        }while(loop1==false);
    }while(repeat.equals("S"));
    }
}
