package Listas.lista03;

import java.util.Scanner;

public class exercicio2 {
    
    private static int[] NOTAS = new int[3];
    private static Scanner SCAN = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
      recebeNotas();
     int media = calcularMedia();

     System.out.println("A média das notas do filme é: " + media);
    } 

    public static void recebeNotas() {
        for(int i = 0; i < NOTAS.length; i++) {
            System.out.println("Digite a nota do filme");
            NOTAS[i] =  Integer.parseInt(SCAN.nextLine());
        }
    }

    public static int calcularMedia() {
        int somatorio = 0;
        for(int i = 0; i < NOTAS.length; i++) {
        somatorio += NOTAS[i];
        }
    int mediaDasNotas = somatorio / NOTAS.length;
        return mediaDasNotas ;
}
}

