import java.util.Scanner;

public class app2 { private static final Scanner SCAN = new Scanner (System.in);
    public static final String DISCURSO = 
    """
        Voce nao vai acreditar. Mas voce cabia aqui. 
    Eu segurava voce e dizia "Esse menino vai ser o melhor menino do mundo. 
    Esse menino vai ser melhor do que qualquer um que conhecemos.". 
    E voce cresceu bom, maravilhoso.

    Ai chegou a hora de voce ser adulto e conquistar o mundo. E conquistou.
    Mas em algum ponto desse percurso, voce mudou. Voce deixou de ser voce.

    Agora deixa as pessoas botarem o dedo na sua cara e dizer que voce nao e bom.
    Eu vou te dizer uma coisa que voce ja sabe: O mundo nao e um grande arco-iris.
    E um lugar sujo, e um lugar cruel. Que nao quer saber o quanto voce e duro.
    Vai botar voce de joelhos e voce vai ficar de joelhos para sempre se voce deixar.

    Voce, eu, ninguem vai bater tao duro como a vida. Mas nao se trata de bater duro.
    Se trata de quanto voce aguenta apanhar e seguir em frente.
    O quanto voce e capaz de aguentar e continuar tentando.
    E assim que se consegue vencer.=

    Agora se voce sabe o seu valor, entao va atras do que voce merece.
    Mas tem que ter disposicao para apanhar.
    E nada de apontar dedos, dizer que voce nao consegue por causa dele,
    dela ou de quem seja. So covardes fazem isso e voce nao e covarde.
    Voce e melhor do que isso!
        
    """;
    public static void main(String[] args) {
        System.out.println("Digite a palavra que deseja verificar");
        String palavra = SCAN.nextLine();
        if(!validarString(palavra)) {
            System.out.println("A palavra deve ter mais de três letras e não deve conter espaço");
            return;
        }
        if(!estaNoDiscurso(palavra)) {
            System.out.println(String.format("A palavra %s não está presente no discurso", palavra.toUpperCase()));
            return;
        }
            System.out.println(String.format("A palavra %s está presente no discurso", palavra));
        
    }
        
    public static boolean validarString(String parametro) {
            parametro =  parametro.trim(); 
                       
            if(parametro.contains(" ")) {
                return false;
            }

            if(parametro.length() < 3) {
                return false;
            }
            return true;
        }

        public static boolean estaNoDiscurso(String palavra) {
          return DISCURSO.contains(palavra);
        }
}
