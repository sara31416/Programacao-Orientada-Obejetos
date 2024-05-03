import java.util.Scanner;

public class App {
  private static final Scanner SCAN = new Scanner(System.in);
    private static final int DISCIPLINAS = 3;
    public static void main(String[] args) throws Exception {
      final int quantidadeDeAlunos = receberQuantidadedeAlunos();
      int[][] alunos = new int[quantidadeDeAlunos][DISCIPLINAS];
      solicitarNotaAlunos(alunos, quantidadeDeAlunos);
      apresentarNotasAlunosComStatus(alunos, quantidadeDeAlunos);
    }
       
    public static int receberQuantidadedeAlunos(){
        System.out.println("Digite a quantidade de alunos: ");
        return Integer.parseInt(SCAN.nextLine());
    }
    public static void solicitarNotaAlunos(int[][] alunos, int quantidadeDeAlunos){
      for(int i = 0; i < quantidadeDeAlunos; i++) {
        System.out.println("Aluno: " + i + 1);
        for(int j = 0; j <  DISCIPLINAS; j++){
            System.out.println("Digite a nota da " + (j+1) + "ª disciplina");
            int notas = Integer.parseInt(SCAN.nextLine());
          alunos[i][j] = notas;
      } 
      System.out.println("\n");
    }
}
public static void apresentarNotasAlunosComStatus(int[][] alunos, int quantidadedeAlunos){
    for(int i = 0; i < quantidadedeAlunos; i++){
        System.out.println("Aluno: " + (i + 1));
        double somaDasNotas = 0.0;
        for(int j = 0; j < DISCIPLINAS; j++){
            somaDasNotas = somaDasNotas + alunos[i][j];
        }
          double media = somaDasNotas / DISCIPLINAS;
          boolean status;
          if(media >= 5){
            status = true;
          }
          else{
            status = false;
          }
          if(status){
            System.out.println("Media = " + media + " Status:Aprovado");
            System.out.println();
          }
          else{
            System.out.println("Media = " + media + " Status: Reprovado");
            System.out.println();
          }
        }
    }
}
