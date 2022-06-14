package ejr4;

public class Client {
    public static void main(String[] args) {
        BaseDeDatos baseDeDatos=new BaseDeDatos();
        baseDeDatos.addLibro(new Libro("1111","lalaland","juegos"));
        baseDeDatos.addLibro(new Libro("2222","lalaland","juegos"));

        baseDeDatos.setEstrategia(new Estrategia1());
        baseDeDatos.iniciarEstrategia();
    }
}
