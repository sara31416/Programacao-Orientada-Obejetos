public class App {
    public static void main(String[] args) throws Exception {
       Porta minhaporta = new Porta();
       
       minhaporta.largura = "80 cm";
       minhaporta.altura = "2.10";
       minhaporta.cor = "Branca";

       minhaporta.abrir();
       minhaporta.fechar();
       minhaporta.imprimirporta();

    }
}
