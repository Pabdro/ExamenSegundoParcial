package ejr3;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements IFacebook {
    private List<Notificaciones> notificacionesList = new ArrayList<>();
    private List<IUser> users = new ArrayList<>();

    public Facebook() {
    }

    public void noti(Notificaciones notificaciones) {
        notificacionesList.add(notificaciones);
        notifyObservers(notificaciones);
    }

    @Override
    public void attach(IUser observer) {
        users.add(observer);
    }

    @Override
    public void detach(IUser observer) {
        users.remove(observer);

    }

    @Override
    public void notifyObservers(Notificaciones notificaciones) {
        for (IUser user : users) {
            if (user.getPreferenciasNotificaciones().equals(notificaciones.getElementos())) {
                user.update("tienes nuevas notificaciones", notificaciones);
            } else {
                user.update2("nuevas notificaciones", notificaciones);
            }

        }
    }
}