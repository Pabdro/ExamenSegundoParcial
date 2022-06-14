package ejr3;

public class UserFacebook implements  IUser{

    String catalizador;
    Persona persona;

    public UserFacebook(String elementos, Persona persona) {
        this.catalizador = elementos;
        this.persona = persona;
    }

    @Override
    public void update(String msg, Notificaciones newNotificaciones) {
        System.out.println("***** Notificaciones: " + msg+ "******");
        System.out.println("Persona: " +persona.getName());
        System.out.println("Preferencia: "+ catalizador);
        newNotificaciones.showInfo();
    }

    @Override
    public void update2(String msg, Notificaciones newNotificaciones) {
        System.out.println("***** Notificaciones: " + msg+ "******");
        System.out.println("Persona: " +persona.getName());
        System.out.println("Preferencia: "+ catalizador);
        newNotificaciones.showInfo();
    }

    @Override
    public String getPreferenciasNotificaciones(){
        return catalizador;
    }

    public Persona getPersona(){
        return persona;
    }
}