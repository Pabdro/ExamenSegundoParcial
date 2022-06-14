package ejr4;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Estrategia3 implements IStrategy{
    @Override
    public void execute(List<Libro> libros) {
        System.out.println("estrategia 3");
        for (Libro libro: libros){
            Collections.sort(libros, new Comparator<Libro>() {
                @Override
                public int compare(Libro o1, Libro o2) {
                    return libro.getCategoria().compareToIgnoreCase(libro.getCategoria());
                }
            });
            libro.info();
        }
    }
}
