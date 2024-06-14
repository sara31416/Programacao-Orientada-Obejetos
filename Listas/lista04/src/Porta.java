public class Porta {
    String largura;
    String altura;
    String cor;

    public void abrir() {
        System.out.println("Abrindo porta");
    }

    public void fechar() {
        System.out.println("Fechando porta");
    }

    public void imprimirporta() {
        System.out.println(String.format(
            """
              A largura da porta é de %s 
            """,
          largura
        ));
        System.out.println(String.format(
            """
            A altura da porta é %s        
            """,
          altura
        ));
        System.out.println(String.format(
            """
            A cor da porta é %s        
            """,
         cor
        ));
    }
}
