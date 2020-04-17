package app;

import java.util.ArrayList;
import java.util.List;

public class Pooflix {

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();

    public Contenido buscarPorTitulo(String titulo) {

        return null;
    }

    public Serie buscarSerie(String titulo) {
        for (Serie s : this.series) {
            if (s.titulo.equals(titulo))
                return s;
        }
        return null;

    }

    public Pelicula buscarPelicula(String titulo) {
        for (Pelicula p : this.peliculas) {
            if (p.titulo.equals(titulo))
                return p;
        }
        return null;

    }

    public Serie buscarSerie(Actor actor) {
        return null;
    }

    public void inicializarCatalogo() {
        this.agregarComoConociATuMadre();
        this.agregarBreakingBad();
        this.agregarWalkingDead();
    }

    public void agregarBreakingBad() {
        Serie breakingB = new Serie();
        breakingB.titulo = "Breaking Bad";

        Genero genero = new Genero();
        genero.nombre = "Drama";
        breakingB.generos.add(genero);

        Temporada t5 = new Temporada();
        t5.numero = 5;

        Episodio ep = new Episodio();

        ep.numero = 7;
        ep.nombre = "Say my name";
        ep.duracion = 43;

        t5.episodios.add(ep);

        Episodio epOtro = new Episodio();

        epOtro.numero = 5;
        epOtro.nombre = "Ozymandias";
        epOtro.duracion = 41;

        t5.episodios.add(epOtro);
        breakingB.temporadas.add(t5);
        this.series.add(breakingB);
    }

    public void agregarComoConociATuMadre(){
        Serie comoConociATuMadre = new Serie();
        comoConociATuMadre.titulo = "Como Conoci a Tu Madre";

        Genero genero1 = new Genero();
        genero1.nombre = "Comedia";
        comoConociATuMadre.generos.add(genero1);

        Temporada t1 = new Temporada();
        t1.numero = 1;

        Episodio epi1 = new Episodio();
        epi1.nombre = "Piloto";
        epi1.numero = 1;
        epi1.duracion = 23; 

        t1.episodios.add(epi1);

        Episodio epi2 = new Episodio();
        epi2.nombre = "Marshall se compromete";
        epi2.numero = 2; 
        epi2.duracion = 22; 

        t1.episodios.add(epi2);
        
        comoConociATuMadre.temporadas.add(t1);
        this.series.add(comoConociATuMadre);

    
    }
    public void agregarWalkingDead(){
        Serie walkingDead = new Serie();
        walkingDead.titulo = "Walking Dead";
        
        Genero genero2 = new Genero();
        genero2.nombre = "Acción";
        walkingDead.generos.add(genero2);

        Temporada t3 = new Temporada();
        t3.numero = 3;
        
        Episodio epi1 = new Episodio();
        epi1.nombre = "Semilla"; 
        epi1.numero = 1;
        epi1.duracion = 43;

        t3.episodios.add(epi1);
        walkingDead.temporadas.add(t3);

        Episodio epi5 = new Episodio();
        epi5.nombre = "Da la orden";
        epi5.numero = 5; 
        epi5.duracion = 43;

        t3.episodios.add(epi5);
        walkingDead.temporadas.add(t3);
        this.series.add(walkingDead);

        Webisodio web1 = new Webisodio();
        web1.nombre = "A New Day";
        web1.numero = 1;
        web1.duracion = 3;
        web1.direccion = "hppt/A New Day/.";

        t3.webisodios.add(web1);



        

    
    }

}
