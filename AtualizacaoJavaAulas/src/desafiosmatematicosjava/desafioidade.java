package desafiosmatematicosjava;
import java.io.IOException;
import java.util.Scanner;

public class desafioidade {
        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);
            int cont = 0;
            int soma = 0;
            int n = 0;
            do {
                n = scanner.nextInt();
                if (n > 0) {
                    cont++;
                    soma += n;
                }
            } while (n > 0);

            double media = (double) soma / cont;
            System.out.println(String.format("%.2f", media));

            scanner.close();
        }
    }

