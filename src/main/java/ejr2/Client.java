package ejr2;

import javax.management.remote.JMXAddressable;

public class Client {

    public static void main(String[]args){
        Comunicacion mediator = new Comunicacion();

        Docentes c1 = new Docentes(mediator);
        c1.setCi("231234");
        c1.setNombre("Carlos");
        c1.setTipo("profesor");
        Estudiante c2 = new Estudiante(mediator);
        c2.setNumero(21312);
        c2.setCi("21312312");
        c2.setNombre("Jose");
        c2.setMatricula("holasas");
        Administrativos administrativos = new Administrativos(mediator);

        mediator.addToChat(c1);
        mediator.addToChat(c2);
        mediator.addToChat(administrativos);

        c1.send("este mensaje es para el C2 ---> pregunta");
        c2.send("mensaje claro --> respuesta");
    }

}