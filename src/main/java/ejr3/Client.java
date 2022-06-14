package ejr3;

public class Client {
    public static void main(String[] args){
        Facebook paginaWeb = new Facebook();
        paginaWeb.attach(new UserFacebook("publicaciones y tambien imagenes ", new Persona("2343214", "Miguel")));
        paginaWeb.attach(new UserFacebook("publicaciones y tambien imagenes ", new Persona("54634", "Gabriel")));
        paginaWeb.attach(new UserFacebook("publicaciones y tambien imagenes ", new Persona("8755875", "Richard")));
        paginaWeb.attach(new UserFacebook("publicaciones y tambien imagenes ", new Persona("9858", "Joseph")));
        paginaWeb.attach(new UserFacebook("publicaciones y tambien imagenes ", new Persona("34634", "Marcos")));

        paginaWeb.noti(new Notificaciones("nuevo video", " 5 imagenes"));
    }
}