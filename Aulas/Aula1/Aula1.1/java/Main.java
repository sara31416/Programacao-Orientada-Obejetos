import java.util.* ;

public class Main {

   private static final Scanner READ = new Scanner(System.in);
    public static void main(String[] args) {
     System.out.println("Digite um inteiro maior que 1");
     int numeroRecebido = Integer.parseInt(READ.nextLine());
     contarRegressivamente((numeroRecebido));
  }
  private static void contarRegressivamente(int numero){
   while(numero >= 0){
      System.out.println(numero);
      numero--;
     }
  }
}