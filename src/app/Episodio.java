package app;

public class Episodio extends Temporada {

    public double duracion;
    public String nombre;
    public int numero;

    public Episodio(){
        this.duracion = 40;

    }

    public Episodio(int numero, String nombre, double duracion){

        this.numero = numero;
        this.nombre = nombre;
        this.duracion = duracion;

    }

    public Episodio(int numero, String nombre){
        
        this();
        this.numero = numero;
        this.nombre = nombre;
    }

    

    public void reproducir(){
         System.out.println("Reproduciendo episodio " + this.numero + "" + this.nombre);

    }

}