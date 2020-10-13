package video.juegos;

import java.util.Date;


public class VideoJuegosDeAccion extends VideoJuegos {

    public VideoJuegosDeAccion(
            String nombre,
            int numeroDeConsolas,
            String nombreVideojuego,
            Boolean juegosDeSegunda,
            Date fechaDeLanzamiento,
            String juego) {
        super(nombre, numeroDeConsolas, nombreVideojuego, juegosDeSegunda, fechaDeLanzamiento, juego);
    }

    private String calificacion;
    private String numeroDeVentas;
    private Boolean dificultadAlta;

    public VideoJuegosDeAccion(
            String calificacion,
            String numeroDeVentas,
            Boolean dificultadAlta,
            String nombre,
            int numeroDeConsolas,
            String nombreVideojuego,
            Boolean juegosDeSegunda,
            Date fechaDeLanzamiento,
            String juego) {
        super(nombre, numeroDeConsolas, nombreVideojuego, juegosDeSegunda, fechaDeLanzamiento, juego);
        this.calificacion = calificacion;
        this.numeroDeVentas = numeroDeVentas;
        this.dificultadAlta = dificultadAlta;
    }

    public void estadisticaDeLosJuegos() {
        this.calificacion += 18;
        this.dificultadAlta = true;
    }
    
    public void exitoAnual() {
        this.numeroDeVentas += 7850;
        this.calificacion += 10;
        this.dificultadAlta = false;
        
    }
    
    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getNumeroDeVentas() {
        return numeroDeVentas;
    }

    public void setNumeroDeVentas(String numeroDeVentas) {
        this.numeroDeVentas = numeroDeVentas;
    }

    public Boolean getDificultadAlta() {
        return dificultadAlta;
    }

    public void setDificultadAlta(Boolean dificultadAlta) {
        this.dificultadAlta = dificultadAlta;
    }
 
    
    
}