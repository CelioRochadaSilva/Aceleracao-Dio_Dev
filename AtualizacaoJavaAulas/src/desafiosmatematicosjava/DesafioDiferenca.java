package desafiosmatematicosjava;

import java.io.IOException;
import java.util.Scanner;


public class DesafioDiferenca {

        public static void main(String[] args) throws IOException {
            Scanner leitor = new Scanner(System.in);
            int a = leitor.nextInt();
            int b = leitor.nextInt();
            int c = leitor.nextInt();
            int d = leitor.nextInt();
            //complete o codigo
            int DIFERENCA = ((a*b-c*d));
            System.out.println("DIFERENCA = " + DIFERENCA);
        }

    }

