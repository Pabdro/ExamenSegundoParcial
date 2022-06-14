package ejr3;

public class Notificaciones {
    private String publicacionesDeVideos;
    private String imagenes;
    private String elementos;


    public Notificaciones(String publicacionesDeVideos, String imagenes) {
        this.publicacionesDeVideos = publicacionesDeVideos;
        this.imagenes = imagenes;
        this.elementos = elementos;
    }

    public String getPublicacionesDeVideos() {
        return publicacionesDeVideos;
    }

    public void setPublicacionesDeVideos(String publicacionesDeVideos) {
        this.publicacionesDeVideos = publicacionesDeVideos;
    }

    public String getImagenes() {
        return imagenes;
    }

    public void setImagenes(String imagenes) {
        this.imagenes = imagenes;
    }

    public String getElementos() {
        return elementos;
    }

    public void setElementos(String elementos) {
        this.elementos = elementos;
    }

    public void showInfo(){
        System.out.println("**** Nueva notificacion ***** ");
        System.out.println("Publicaciones de videos: " + publicacionesDeVideos);
        System.out.println("Imagenes:" + imagenes);
        System.out.println();
    }
}