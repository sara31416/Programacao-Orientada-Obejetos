import java.util.Scanner;

public class app1 {
    public static final String NOME = "MeuNomeNaoEhZelda";
    public static final String SENHA = "MeuNomeEHL1nk";
    private static final Scanner SCAN = new Scanner(System.in);
    public static void main(String[] args) {
        boolean resultado;
        do{
            System.out.println("Digite seu nome de usuario");
            String nomeDeUsuario = SCAN.nextLine();
            System.out.println("Digite sua senha");
            String senhaDoUsuario = SCAN.nextLine();
            resultado = comparaVariavel(nomeDeUsuario, senhaDoUsuario);
            if(!resultado) {
                System.out.println("Usuário e/ou senha invalidos!");
            }
            else {
                System.out.println(String.format("Seja bem-vindo %s!", NOME));
            }
        }
        while(!resultado);
    }

    public static boolean comparaVariavel(String nomeUsuario, String senhaUsuario) {
        if(!nomeUsuario.equalsIgnoreCase(NOME)) {
            return false;
        }
        if(!senhaUsuario.equals(SENHA)) {
            return false;
        }
        return true;
    }
}
