package Aulas.Aula4.primeira

import java.util.ArrayList;

casse.src;

public class Musica {
    String melodia;
    String cifra;
    boolean temLetra;
    String letra;
    ArrayList<Musico> musicos;

    public void ouvir() {
       for(int i = 0; i < musicos.size(); i++) {
            musicos.get().tocarMusica();

            if(musicos.get(i).ehCantor) {
                musicos.get(i).cantar();
            }
       }
    }
}
