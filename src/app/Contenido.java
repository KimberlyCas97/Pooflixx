package app;

import java.util.ArrayList;
import java.util.List;

public class Contenido {

    public String titulo;
    public double tiempoVisto;

    public List<Premios> premios;

    public List<Genero> generos = new ArrayList<>();

    public static List<Actor> actores = new ArrayList<>();

    public Director director;

    // Metodos

    public boolean visto() {
        System.out.println("VISTO");
        return true;

    }

    public void reproducir() {
        System.out.println("Reproduciendo " + this.titulo);

    }

    public void pausar() {
        System.out.println("Pausado " + this.titulo);
    }
}