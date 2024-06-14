public class App2 {
  public static void main(String[] args) throws Exception {
    Conversa conversa = new Conversa();
    conversa.tempodeduracao = "2 horas";
    conversa.assunto = "Música";
    conversa.participantes = "Diana, Vinicius e Sara.";

    conversa.começar();
    conversa.novoparticipante();
    conversa.imprimirconversa();
}
}
