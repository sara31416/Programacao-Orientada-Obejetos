import Aulas.Aula4.primeira.Musica;

public class App {
    public static void main(String[] args) throws Exception {
       Musica musica = new Musica();
       musica.melodia = "do re mi fa sol lá ci dó";
       musica.cifra = "G D EM C";
        musica.temLetra = true;
        musica.letra = "joao roubou pao na casa do joao";
        System.out.println(String.format( "%s %s %s", musica.melodia, musica.cifra, musica.letra));
    }
}
