package app;

import java.util.ArrayList;
import java.util.List;

public class Temporada extends Serie {

    public List<Episodio> episodios = new ArrayList<Episodio>();
    public List<Webisodio> webisodios = new ArrayList<Webisodio>();

 

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

    
    public Webisodio getWebisodio(int numero){
        for(Webisodio web1 : this.webisodios){
            if (web1.numero == numero)
            {
            return web1;
        
            }

        }
        return null; 

    }


}