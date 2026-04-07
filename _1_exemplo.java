import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Locale;

public class _1_exemplo {
    public static void main(String[] args) {

        String product1="Computer";
        String product2="Office desk";
        int age=30;
        int code=5290;
        char gender='F';
        double price1=2100.0;
        double price2=650.50;
        double measure=53.234567;
        System.out.println("\n" +
                           "Products: "+product1+", which price is $"+price1+"\n" +
                           ""+product2+", which price is $"+price2+"\n" +
                           "\n" +
                           "\n" +
                           "Record: "+age+" years old, code "+code+" and gender: "+gender+"\n" +
                           "\n" +
                           "Measure with eight decimal places: "+measure);
        System.out.printf("Rouded(three decimal places): %.3f \n" +
                          "", measure);
        System.out.printf("US decimal format: %.3f \n" +
                          "", measure); Locale.setDefault(Locale.US);
    }
}
