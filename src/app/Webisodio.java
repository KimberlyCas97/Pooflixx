package app;

public class Webisodio extends Episodio {
    
    public String direccion = "";
    @Override
    public void reproducir(){
        System.out.println("Reproduciendo websodio " + nombre + "   " + direccion);
    }



}