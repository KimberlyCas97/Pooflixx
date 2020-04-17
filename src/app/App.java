package app;

public class App {
    public static void main(String[] args) throws Exception {

        
        Pooflix miPooflix = new Pooflix();

        System.out.println("Iniciando Catalogo");

        miPooflix.inicializarCatalogo();

        Serie bb = miPooflix.buscarSerie("Como Conoci a Tu Madre");

        Temporada laMejorTemporada = bb.getTemporada(1);

        Episodio elTop;

        elTop = laMejorTemporada.getEpisodio(1);

        elTop.reproducir();
    }
}
        
    
