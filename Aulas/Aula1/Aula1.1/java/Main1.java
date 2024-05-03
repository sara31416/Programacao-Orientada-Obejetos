import java.util.*;
public class Main1 {
    private static final Scanner SCAN = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Digite a idade do nadador que para saber sua classificação");
        int recebeIdadeNadador = Integer.parseInt(SCAN.nextLine());
        System.out.println(classificarNadador(recebeIdadeNadador));
    }
    private static String classificarNadador(int idadeNadador){ 
        
        if(idadeNadador < 12){
            return "infantil";
        }
        else if(idadeNadador <= 14){
            return "juvenil A";
        }
        else if(idadeNadador <= 17){
            return "juvenil B";
        }
        else{
            return "Adulto";
        }
    }
}
