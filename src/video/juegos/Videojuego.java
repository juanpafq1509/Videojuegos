package video.juegos;

import java.util.Date;


public class VideoJuegos {

   private String nombre;//Nombre del local de videojuegos
   private int numeroDeConsolas;
   private String nombreVideojuego;
   private Boolean juegosDeSegunda;
   private Date fechaDeLanzamiento; 
   private String juego;

    public VideoJuegos(String nombre, int numeroDeConsolas, String nombreVideojuego, Boolean juegosDeSegunda, Date fechaDeLanzamiento, String juego) {
        this.nombre = nombre;
        this.numeroDeConsolas = numeroDeConsolas;
        this.nombreVideojuego = nombreVideojuego;
        this.juegosDeSegunda = juegosDeSegunda;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.juego = juego;
    }

   public void aumentarProducto(){
       this.numeroDeConsolas +=5;
       this.juegosDeSegunda = false;
   } 
   
   public void E3 (
           String nuevoJuego, 
           String nuevaFechaDeLanzamiento){
       this.juego = nuevoJuego;
       this.fechaDeLanzamiento = nuevaFechaDeLanzamiento;
   }
   
   public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeConsolas() {
        return numeroDeConsolas;
    }

    public void setNumeroDeConsolas(int numeroDeConsolas) {
        this.numeroDeConsolas = numeroDeConsolas;
    }

    public String getNombreVideojuego() {
        return nombreVideojuego;
    }

    public void setNombreVideojuego(String nombreVideojuego) {
        this.nombreVideojuego = nombreVideojuego;
    }

    public Boolean getJuegosDeSegunda() {
        return juegosDeSegunda;
    }

    public void setJuegosDeSegunda(Boolean juegosDeSegunda) {
        this.juegosDeSegunda = juegosDeSegunda;
    }

    public Date getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(Date fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public String getJuego() {
        return juego;
    }

    public void setJuego(String juego) {
        this.juego = juego;
    }
   
   
   
   public static void main(String[] args){
      VideoJuegos videoJuegosUno = new VideoJuegos(
              "Fercho Gaming",
              5,
              "crash el topo que gira",
              false,
              new Date(),
              "aventura");
   VideoJuegos videoJuegosDos = new VideoJuegos(
              "Parawas Gaming",
              6,
              "Pepe el de las Bombas",
              true,
              new Date(),
              "accion");
       System.out.println(videoJuegosUno.getNombre());
       System.out.println(videoJuegosUno.getJuegosDeSegunda());
       System.out.println(videoJuegosUno.getNumeroDeConsolas());
       
       videoJuegosUno.aumentarProducto();
       
       System.out.println(videoJuegosUno.getNombre());
       System.out.println(videoJuegosUno.getJuegosDeSegunda());
       System.out.println(videoJuegosUno.getNumeroDeConsolas());
   }
}
