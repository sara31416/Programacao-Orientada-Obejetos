public class App1 {
    public static void main(String[] args) throws Exception {
    Gato gato = new Gato();

    gato.idade = 17;
    gato.cor = "preto";
    gato.nome = true;

    gato.temnome(gato.nome);
    gato.miar();
    gato.imprimirgato();
}
}
