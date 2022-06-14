package ejr3;

public interface IFacebook {
    void attach(IUser observer);
    void detach(IUser observer);
    void notifyObservers(Notificaciones notificaciones);
}