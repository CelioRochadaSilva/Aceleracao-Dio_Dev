package desafiosmatematicosjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class contagemRepetidaNumeros {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int valores = scr.nextInt();
        Map<Integer, Integer> numeros = new HashMap<>();

        for (int i = 0; i < valores; i++) {
            var numero = scr.nextInt();

            if(((HashMap<?, ?>) numeros).containsKey(numero)) {
                var qtde = numeros.get(numero);
                numeros.put(numero, ++qtde);
            } else {
                numeros.put(numero, 1);
            }
        }

        numeros.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " aparece " + e.getValue() + " vez(es)"));
    }
}