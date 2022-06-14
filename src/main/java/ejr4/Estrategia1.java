package ejr4;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Estrategia1 implements IStrategy{
    @Override
    public void execute(List<Libro> libros) {
        System.out.println("estrategia 1");
        for (Libro libro: libros){
            Collections.sort(libros, new Comparator<Libro>() {
                @Override
                public int compare(Libro o1, Libro o2) {
                    return libro.getId().compareToIgnoreCase(libro.getId());
                }
            });
            libro.info();
        }
    }
}
