package runtimeException;

import java.util.Scanner;

public class Test{

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("--------------------");

        System.out.println("Digite un número");
        int numero = entrada.nextInt();

        System.out.println("--------------------");

        System.out.println("El número es: " + numero);
    
    }

}