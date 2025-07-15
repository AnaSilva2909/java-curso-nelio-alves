package com.udemy.java.estruturaSequencial.saidaDados;
import java.util.Locale;

public class SaidaDados {
    public static void main(String[] args) {
        int y = 32;
        double x = 10.35784;

        //Limitar casas decimais e utilizando o printf:
        System.out.printf("%.3f%n", x);

        //Trocar , por .:
        Locale.setDefault(Locale.US);
        System.out.printf("%.3f%n", x);

        //Concatenando vários elemetos usando o printf:
        System.out.printf("Resultado = %.2f metros%n", x);

        //Concatenando vários elementos em um mesmo comando de escrita:
        String nome= "Maria";
        int idade= 24;
        double salario = 4.000;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, salario);


    }
    
}
