package com.udemy.java.outrosTopicosJava.funcoes;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite 3 números: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int result = maiorNumero(a,b,c);
        mostrarResultado(result);
        
    

        scan.close();
    }

    public static int maiorNumero(int num1, int num2, int num3){
        int resultado;
        if (num1 > num2 && num1> num3 ) {
           
            resultado = num1;
            
        }else if (num2 > num3) {
            resultado = num2;
            
        }else{
            resultado = num3;
            
        }

        return resultado;


    }

    public static void mostrarResultado(int valor){
        System.out.println("Maior: " + valor);

    }
    
}
