    import java.util.Scanner;

    public class exercicio02 {
        private static final Scanner SCAN = new Scanner (System.in);
        static boolean[][] matriz = new boolean[4][4];
        public static void main(String[] args) throws Exception {
            prencherMatriz(matriz);
            System.out.println("Digite as cordenadas para ativar a torre\nDigite a linha correspondente a localização da torre");
            int linha = Integer.parseInt(SCAN.nextLine());
            System.out.println("Digite a coluna correspondente a a localização da torre");
            int coluna = Integer.parseInt(SCAN.nextLine());
        localizcaoJogador(matriz, linha, coluna);
            imprimirMatriz(matriz);

        }

        public static void prencherMatriz(boolean[][] matriz) {
            for(int i = 0; i < matriz.length; i++) {
                for(int j = 0; j < matriz.length; j++) {
                    matriz[i][j] = false;
                }
            }
        }

        public static boolean localizcaoJogador(boolean[][] matriz, int linha, int coluna) {
            for(int i = 0; i < matriz.length; i++) {
                for(int j = 0; j < matriz.length; j++) {
                    if(matriz[i][j] == matriz[linha][coluna]) {
                        return matriz[linha][coluna] = true;
                    }
                }
            }
            return false;
        }
        public static void imprimirMatriz(boolean[][] matriz) {
            for(int i = 0; i < matriz.length; i++) {
                for(int j = 0; j < matriz.length; j++) {
                    
                if(matriz[i][j]) {
                    System.out.print("|O");  

                }
                else {
                    System.out.print("|X");
                }
                }
                System.out.println("|");
            }
        }
    }
 