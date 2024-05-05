package Listas.lista02;

import java.util.Scanner;

public class quiz {
    private static int QUANTIDADE_PERGUNTAS = 3;
    private static String[] RESPOSTAS = new String[QUANTIDADE_PERGUNTAS];
    private static String[] GABARITO = new String[QUANTIDADE_PERGUNTAS];
    private static Scanner SCAN = new Scanner(System.in);
    public static void main(String[] args) {
    String recebeNome = receberNome();
       iniciarQuiz(recebeNome);
       pergunta1();
       pergunta2();
       pergunta3();
       apresentarResultado(recebeNome);
       agradecimento();
    }

    public static String formatarNome(String nomeRecebido) {
        nomeRecebido = nomeRecebido.trim();
        String[] nomeCompleto = nomeRecebido.split(" ");
        String primeiroNome = nomeCompleto[0];
        String pegarPrimeiraLetra = String.valueOf(primeiroNome.charAt(0));
        String nomeSemInicial = primeiroNome.substring(1);
        String nomeComFormatacao = pegarPrimeiraLetra.toUpperCase() + nomeSemInicial.toLowerCase();
        return nomeComFormatacao;
    }

    public static String receberNome() {

        System.out.println("Digite seu nome para começar o quiz");
        String nomeRecebido = SCAN.nextLine();
        return formatarNome(nomeRecebido);
    }

    public static void iniciarQuiz(String nomeDoUsuario) {
        System.out.println(String.format(
            """
              Olá %s seja bem-vindo(a) ao quiz 
              Você conhece a banda Nirvana?  
              Para iniciar o quiz basta clicar em Enter    
            """,
            nomeDoUsuario
        ));

        SCAN.nextLine();
    }
     
    public static void pergunta1(){
        String resposta = "";
         do{ 
            System.out.println(
                """
                1: Quem foram os membros originais da banda Nirvana?

                a) Kurt Cobain, Krist Novoselic e Dave Grohl
                b) Kurt Cobain, Ringo Starr e Paul McCartney
                c) Jimi Hendrix, Krist Novoselic e Dave Grohl      
                """
                    
            ); 
            resposta = SCAN.nextLine();
        }
        while(!validarResposta(resposta));

        GABARITO[0] = "a";
        RESPOSTAS[0] = resposta;
       
    }

    public static void pergunta2(){
        String resposta = "";
         do{ 
            System.out.println(
                """
                    2: Qual é o álbum mais vendido da banda Nirvana?

                    a) In Utero
                    b) Bleach
                    c) Nevermind   
                """
                    
            ); 
            resposta = SCAN.nextLine();
        }
        while(!validarResposta(resposta));

        GABARITO[1] = "c";
        RESPOSTAS[1] = resposta;
       
    }

    public static void pergunta3(){
        String resposta = "";
         do{ 
            System.out.println(
                """
                    3: Em que ano a banda Nirvana foi introduzida no Rock and Roll Hall of Fame?

                    a) 2011
                    b) 2014
                    c) 2016
                """
                    
            ); 
            resposta = SCAN.nextLine();
        }
        while(!validarResposta(resposta));

        GABARITO[2] = "b";
        RESPOSTAS[2] = resposta;
    }

    public static boolean validarResposta(String resposta) {
       if(resposta.isEmpty()||resposta.isBlank()) {
        System.out.println("Por favor Digite um valor");
        return false;
       }
       else {
        return true;
       }
    }

    public static void apresentarResultado(String nomeParticipante) {
        int quantidadeDeAcertos = 0;
            System.out.println(String.format(
                """
                  %s vamos ver o quanto você conhece sobre a banda nirvana 
                  Veja quais perguntas você acertou:      
                """,
                nomeParticipante
            ));

            for(int i = 0; i < QUANTIDADE_PERGUNTAS; i++) {
                System.out.println("Gabarito - " + GABARITO[i] + " Sua resposta - " + RESPOSTAS[i]);
                System.err.println(String.format(
                   "%s - %s",
                   (i + 1),
                   RESPOSTAS[i].equalsIgnoreCase(GABARITO[i]) ? "ACERTOU" : "ERROU"
                ));
                
            } 

            for(int i = 0; i < QUANTIDADE_PERGUNTAS; i++) {
                if(RESPOSTAS[i].equalsIgnoreCase(GABARITO[i])) {
                    quantidadeDeAcertos++;
                }
            }
            if(quantidadeDeAcertos == 0) {
                System.out.println(" 0 acertos: continue tentando e você vai melhorar!");
            }
            else if(quantidadeDeAcertos == 1) {
                System.out.println("1 acerto: Bom trabalho! Você acertou uma pergunta. Continue aprendendo e você vai melhorar ainda mais.");
            }
            else if(quantidadeDeAcertos == 2) {
                System.out.println("2 acertos: Ótimo trabalho! Você acertou duas perguntas. Você está quase lá, continue assim!");
            }
            else if(quantidadeDeAcertos == 3) {
                System.out.println("3 acertos: Parabéns! Você acertou todas as perguntas. Você realmente sabe muito sobre a banda Nirvana. ");
            }
    }

    public static void agradecimento() {
        System.out.println("Obrigada por ter participado do quiz");
    }
     
}
