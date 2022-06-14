package ejr4;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
    private List<Libro> libroList=new ArrayList<>();
    private IStrategy estrategia;
    public BaseDeDatos(){}

    public IStrategy getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(IStrategy estrategia) {
        this.estrategia = estrategia;
    }
    public void addLibro(Libro libro){
        libroList.add(libro);
    }
    public void iniciarEstrategia(){
        estrategia.execute(libroList);
    }
}
