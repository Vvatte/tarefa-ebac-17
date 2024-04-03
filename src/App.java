import br.com.vvatte.*;

import java.util.ArrayList;

public class App {

    public static void main(String[] args){
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Honda("Civic", "Azul", 2012));
        cars.add(new Volvo("EX90", "Preto", 2024));
        cars.add(new Toyota("Corolla", "Branco", 2018));
        cars.add(new Mercedes("C 200", "Dourado", 2008));
        imprimir(cars);
    }
    public static <T> void imprimir(ArrayList<T> lista) {
        for (T st : lista) {
            System.out.println(st);
        }
    }
}
