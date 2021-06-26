package desafiosmatematicosjava;

import java.util.Scanner;

public class Impares {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        if (a % 2 == 0) {
            a++;
        }
        int cont=0;
        while (cont < 6) {
            System.out.println( cont + a);
            a=a+1;
            cont++;

        } // falta concluir
    }
}

