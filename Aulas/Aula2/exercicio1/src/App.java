import java.util.Scanner;

public class App {
    private static final Scanner SCAN = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
      System.out.println("Digite uma frase");
      String frase = SCAN.nextLine();
      String[] palavras = frase.split(" ");
      for(int i = 0; i < palavras.length; i++) {
        if(i != palavras.length - 1) {
            System.out.println(palavras[i]);
        }
        else {
            modificaNome(palavras[i]);
        }
      }
    }

    public static void modificaNome(String nome) {
        char[] characteres = nome.toCharArray();
       
        for(char character : characteres) {
            System.out.println(character);
        }
    }
}
