package ejr2;


public class Administrativos extends Persona {
    private String cargo;
    public Administrativos(Mediator mediator) {
        super(mediator);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void send(String msg) {
        mediator.send(msg,this);
    }

    @Override
    public void received(String msg) {
        System.out.println("nombre "+getNombre()+ "cargo: "+getCargo());
        System.out.println(" received: "+msg);
    }
}