package Listas.lista03;
import java.util.Scanner;
public class exercicio3 {

  private static final Scanner SCAN = new Scanner(System.in);
  public static void main(String[] args) throws Exception{
    System.out.println("Digite a primeira palavra");
    String palavra1 = SCAN.nextLine(); 

    System.out.println("Digite a primeira palavra");
    String palavra2 = SCAN.nextLine();

    compararNome(palavra1, palavra2);
  }  

  public static void compararNome(String palavra1, String palavra2) {
   if(palavra1.equals(palavra2)) {
    System.out.println("As palavras são identicas");
   }
   else if(palavra1.equalsIgnoreCase(palavra2)) {
    System.out.println("As palavras são iguais ignorando maiusculo e minusculo");
   }
   else {
    System.out.println("As palavras são diferentes");
   }
  }
}
