public class Gato {
    String cor;
    int idade;
    boolean nome;

    public void temnome(boolean nome) {
        if(nome) {
            System.out.println("O gato posui nome");
        }
        else {
            System.out.println("O gato não possui nome");
        }
    }

    public void miar() {
        System.out.println("Miau Miau");
}

    public void imprimirgato() {
        System.out.println("A cor do gato é " + cor);
        System.out.println(String.format(
            """
              O gato tem %s anos
            """,
            idade
        ));

    }
}