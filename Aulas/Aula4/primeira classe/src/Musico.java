package Aulas.Aula4.primeira casse.src;

public class Musico {
    String nome;
    int idade;
    String instrumento;
    boolean ehcantor;

    public void tocarMusica() {
        System.out.println("Tirando um som!!!");
    }

    public void cantar() {
        if(ehcantor) {
            System.out.println("lalaia lalaia laia");
        }
        else {
            System.out.println("ACEGHJLNPRT");
        }
    }
}
