public class Conversa {
    String tempodeduracao;
    String assunto;
    String participantes;

    public void começar() {
        System.out.println("Começamos uma conversa");
    }

    public void novoparticipante() {
        System.out.println("Um novo partipante entrou na conversa");
    }

    public void imprimirconversa() {
        System.out.println(String.format(
            """
              A conversa durou %s 
            """,
           tempodeduracao
        ));
        System.out.println(String.format(
            """
              A conversa foi sobre %s 
            """,
           assunto
        ));
        System.out.println(String.format(
            """
            Os participantes da conversa são %s 
            """,
          participantes
        ));
    }
}
