package app;

import java.util.ArrayList;
import java.util.List;

public class Temporada extends Serie {

    public List<Episodio> episodios = new ArrayList<Episodio>();





    public int numero;

    public Episodio getEpisodio(int numero){
        for(Episodio ep : this.episodios){
            if(ep.numero == numero)
            {
                return ep;
            }
        }
        return null; 
    }


}