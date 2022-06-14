package ejr4;

public class Libro {
    private String id;
    private String titulo;
    private String categoria;

    public Libro(String id, String titulo, String categoria) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void info(){
        System.out.println("id: "+id);
        System.out.println("titulo: "+titulo);
        System.out.println("categoria: "+categoria);
        System.out.println();
    }
}
