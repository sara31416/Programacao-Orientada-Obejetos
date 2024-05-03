import java.util.Scanner;

public class exercicio01 {
    private static final Scanner SCAN = new Scanner (System.in);
    static int[] vetor = new int[10];
     public static void  main(String[] args) throws Exception {
      prencherVetor(vetor); 
      System.out.println();
      System.out.println("Digite o número que deseja buscar no vetor");
      int numeroProcurado = Integer.parseInt(SCAN.nextLine());
     boolean resultado = buscarNumero(vetor, numeroProcurado);
      if(resultado){
        System.out.println("ACHEI");
      }
      else {
        System.out.println("NÃO ACHEI");
      }
     }
        
     public static void prencherVetor(int[] vetor) {
         for(int i = 0; i < vetor.length; i++) {
             System.out.println("Digite os número que deseja inserir no vetor");
             int prencheVetor = Integer.parseInt(SCAN.nextLine());
             vetor[i] = prencheVetor;
         } 
     }

     public static boolean buscarNumero(int[] vetor, int numero) {
        for(int i = 0; i < vetor.length; i++) {
         if(vetor[i] == numero) {
             return true;
        }
        }
        return false;
    }  
}
