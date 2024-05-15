package Listas.lista03;

import java.util.Scanner;

public class exercici01 {
    public static final int anoAtual = 2024;

    private static final Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Para saber a idade que você terá até o final do ano digite o ano de seu nascimento");
        int anoDeNascimento = Integer.parseInt(SCAN.nextLine());
        int resultado = idadeAteFinalDoAno(anoDeNascimento);
        System.out.println("Até o final de " + anoAtual + " você terá " + resultado + " anos");
    }

    public static int idadeAteFinalDoAno(int anoDeNascimento) {
       int resultado = anoAtual - anoDeNascimento;
        return resultado;
    }
}
