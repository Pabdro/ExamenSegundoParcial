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
                } else if (emisor.getTipo().equals("estudiante") && p.getTipo().equals("estudiante")){
                    p.received(msg);
                } else if (emisor.getTipo().equals("profesor")&& p.getTipo().equals("profesor")){
                    p.received(msg);
                }
            }
        }
    }
}