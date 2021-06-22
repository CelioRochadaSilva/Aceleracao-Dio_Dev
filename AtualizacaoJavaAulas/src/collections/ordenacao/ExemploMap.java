package collections.ordenacao;

import java.util.Collection;
import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário adicione seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("Susbstitua o consumo do Gol por 15.2 km litros"); // vai alterar para 15.2 ("Gol" , 15.2)
        carrosPopulares.put("Gol", 15.1);
        System.out.println(carrosPopulares.toString());

        System.out.println("Confira se o modelo Tucson foi adicionado no dicionário ? " + carrosPopulares.containsKey("Tucson"));
        // se tive na lista sera exibido true

        System.out.println("Exiba o consumo do Uno");
        System.out.println(carrosPopulares.get("Uno") + " Km/Litros");

        System.out.println("Exiba os modelos adicionado no dicionario");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba o consumo dos carros");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Carro que nemos consome");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente " + modeloMaisEficiente + " consuno: " + consumoMaisEficiente + " litro/km");
            }
        }
        System.out.println("Exiba o modelo menos econômico e seu consumo");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for ( Map.Entry<String, Double> entry : carrosPopulares.entrySet()){
            if(entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo nemos eficiente é " + modeloMenosEficiente + " consome: " + consumoMenosEficiente + " litros/km");
            }

        }
        System.out.println("Exiba a soma dos consumos");

    }
}

