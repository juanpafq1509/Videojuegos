package video.juegos;

import java.util.Date;


public class VideoJuegosTerror extends VideoJuegos {

    public VideoJuegosTerror(
            String nombre,
            int numeroDeConsolas,
            String nombreVideojuego,
            Boolean juegosDeSegunda,
            Date fechaDeLanzamiento,
            String juego) {
        super(nombre, numeroDeConsolas, nombreVideojuego, juegosDeSegunda, fechaDeLanzamiento, juego);
    }

    private String numeroScreamers;
    private Boolean recomendadoEpilepticos;
    private Boolean esRealidadVirtual;

    public VideoJuegosTerror(
            String numeroScreamers,
            Boolean recomendadoEpilepticos,
            Boolean esRealidadVirtual,
            String nombre,
            int numeroDeConsolas,
            String nombreVideojuego,
            Boolean juegosDeSegunda,
            Date fechaDeLanzamiento,
            String juego) {
        super(nombre, numeroDeConsolas, nombreVideojuego, juegosDeSegunda, fechaDeLanzamiento, juego);
        this.numeroScreamers = numeroScreamers;
        this.recomendadoEpilepticos = recomendadoEpilepticos;
        this.esRealidadVirtual = esRealidadVirtual;
    }

    public void aptoParaCardiacos() {
        this.numeroScreamers += 5;
        this.esRealidadVirtual = true;
    }
    
    public void peligrosoParaLaGente() {
        this.recomendadoEpilepticos = false;
        this.esRealidadVirtual = false;
        
    }
    
    public String getNumeroScreamers() {
        return numeroScreamers;
    }

    public void setNumeroScreamers(String numeroScreamers) {
        this.numeroScreamers = numeroScreamers;
    }

    public Boolean getRecomendadoEpilepticos() {
        return recomendadoEpilepticos; 
    }

    public void setRecomendadoEpilepticos(Boolean recomendadoEpilepticos) {
        this.recomendadoEpilepticos = recomendadoEpilepticos;
    }

    public Boolean getEsRealidadVirtual() {
        return esRealidadVirtual;
    }

    public void setEsRealidadVirtual(Boolean esRealidaadVirtual) {
        this.esRealidadVirtual = esRealidadVirtual;
    }
 
    
    
}