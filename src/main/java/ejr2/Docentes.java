package ejr2;


public class Docentes extends Persona {


    public Docentes(Mediator mediator) {
        super(mediator);
    }


    @Override
    public void send(String msg) {
        mediator.send(msg,this);
    }

    @Override
    public void received(String msg) {
        System.out.println("nombre "+getNombre()+ "ci: "+getCi());
        System.out.println("received: "+msg);
    }
}