package video.juegos;

import java.util.Date;


public class VideoJuegosCristianos extends VideoJuegos {

    public VideoJuegosCristianos(
            String nombre,
            int numeroDeConsolas,
            String nombreVideojuego,
            Boolean juegosDeSegunda,
            Date fechaDeLanzamiento,
            String juego) {
        super(nombre, numeroDeConsolas, nombreVideojuego, juegosDeSegunda, fechaDeLanzamiento, juego);
    }

    private String calificacionPorPapa;
    private String referenciasBiblicas;
    private Boolean esCristiano;

    public VideoJuegosCristianos(
            String calificacionPorPapas,
            String referenciasBiblicas,
            Boolean esCristiano,
            String nombre,
            int numeroDeConsolas,
            String nombreVideojuego,
            Boolean juegosDeSegunda,
            Date fechaDeLanzamiento,
            String juego) {
        super(nombre, numeroDeConsolas, nombreVideojuego, juegosDeSegunda, fechaDeLanzamiento, juego);
        this.calificacionPorPapa = calificacionPorPapa;
        this.referenciasBiblicas = referenciasBiblicas;
        this.esCristiano = esCristiano;
    }

    public void AptoParaCristianos() {
        this.calificacionPorPapa += 7;
        this.esCristiano = true;
    }
    
    public void VendidoEnIglesias() {
        this.referenciasBiblicas += 78;
        this.calificacionPorPapa += 1;
        this.esCristiano = false;
        
    }
    
    public String getCalificacionPorPapa() {
        return calificacionPorPapa;
    }

    public void setCalificacionPorPapa(String calificacionPorPapa) {
        this.calificacionPorPapa = calificacionPorPapa;
    }

    public String getReferenciasBiblicas() {
        return referenciasBiblicas;
    }

    public void setReferenciasBiblicas(String referenciasBiblicas) {
        this.referenciasBiblicas = referenciasBiblicas;
    }

    public Boolean getEsCristiano() {
        return esCristiano;
    }

    public void setEsCristiano(Boolean esCristiano) {
        this.esCristiano= esCristiano;
    }
 
    
    
}
