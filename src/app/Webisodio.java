package app;

public class Webisodio extends Episodio {
    
    public String direccion = "";


    public Webisodio(int numero, String nombre){
        super(numero,nombre);
        this.direccion = "http//movies.com";
    }


    @Override
    public void reproducir(){
        System.out.println("Reproduciendo websodio " + nombre + "   " + direccion);
    }



}