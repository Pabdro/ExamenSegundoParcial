package ejr2;


public class Estudiante extends Persona {
    private String matricula;
    private int numero;

    public Estudiante(Mediator mediator) {
        super(mediator);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void send(String msg) {
        mediator.send(msg,this);
    }

    @Override
    public void received(String msg) {
        System.out.println("nombre "+getNombre()+ "matricula: "+getMatricula()+ "numero "+getNumero());
        System.out.println("received: "+msg);
    }
}