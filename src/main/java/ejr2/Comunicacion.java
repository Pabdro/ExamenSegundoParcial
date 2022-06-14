package ejr2;


import java.util.HashMap;
import java.util.Map;

public class Comunicacion implements Mediator {
    // necesitamos almacenar todos los colleague que se comunicaran

    Map<Persona, String> map =new HashMap<>();

    public void addToChat(Persona persona){
        map.put(persona, persona.getTipo());
    }

    @Override
    public void send(String msg, Persona persona) {
        Persona emisor=(Persona) persona;
        for (Persona p : map.keySet()){
            if(!emisor.getCi().equals(p.getCi())){
                if (emisor.getTipo().equals("administrador")){
                    p.received(msg);
                } else if ((emisor.getTipo().equals("estudiante")&&emisor.equals("estudiante"))||
                        (emisor.getTipo().equals("estudiante")&&emisor.equals("profesor"))||(emisor.getTipo().equals("estudiante")&&emisor.equals("administrador"))){
                    p.received(msg);
                } else if ((emisor.getTipo().equals("profesor")&& emisor.equals("profesor"))
                        ||(emisor.getTipo().equals("profesor")&&emisor.equals("estudiante"))){
                    p.received(msg);
                }
            }
        }
    }
}