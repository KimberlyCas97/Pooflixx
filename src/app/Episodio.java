package app;

public class Episodio extends Temporada {

    public double duracion;
    public String nombre;
    public int numero;

    public void reproducir(){
         System.out.println("Reproduciendo episodio " + this.numero + "" + this.nombre);

    }

}