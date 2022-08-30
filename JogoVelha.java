package uninters;

import java.util.Scanner;  //importando Scanner

public class JogoVelha{
	static String nomes;    //criando string nomes para receber o nome do usuário e ser usado em outra classe



	public static void main(String[] args) {
		Tabuleiro tabu = new Tabuleiro();    //criando objeto para acessar  classe Tabuleiro	
		Jogador jogador = new Jogador();      //criando objeto para acessar classe Jogador
		
			
		
		Scanner teclado = new Scanner(System.in);   
		System.out.println("Olá, Qual é o seu nome?");    //pegando nome digitado pelo usuário
		String nome = teclado.nextLine();
		nomes = nome;
		
	
		
		System.out.println();		
		System.out.println("Você está prestes a jogar o Jogo da velha");                          
		System.out.println();       //imprimindo mensagens na tela e guardando opção de dificuldade escolhida pelo usuário
		System.out.println(nome+", escolha a dificuldade: Digite '1', '2'  ou '3' !");
		
		int opcao = teclado.nextInt();
		Computador comp = null;
		
		
		while(opcao !=1 && opcao !=2 && opcao!=3) { //verificando se opção escolhida pelo usuário é válida, se inválida loop retorna e pergunta novamente
			System.out.println("Número inválido. Tente novamente:  Digite '1', '2'  ou '3'");
			opcao = teclado.nextInt();
		}
		if (opcao==1) {
			System.out.println("Nível 1 escolhido");    //dependendo da escolha do usuário 'comp' recebe a classe condizente
			 comp = new Computador();
		}
		
		if (opcao==2) {
			System.out.println("Nível 2 escolhido");
			 comp = new Computador2();
		}
		
		if (opcao==3) {
			System.out.println("Nível 3 escolhido");
			 comp = new Computador3();
		}
		
		
		System.out.println();                   //print vazio para não ficar junto e chma método que mostra o tabuleiro da classe tabuleiro
		tabu.mostraTabuleiro(tabu.tabuleiro);


		
		boolean fimJogo = false;  
	    boolean novaJogada = true;

	    while(novaJogada) {                          /*enquanto o booleano nova jogada for verdadeiro, e o fim de jogo falso, jogo entra em 
	                                                looping acessa método de jogadas do jogador e computador em suas respectivas classes, e o 
	                                                método que verifica vencedor na classe Tabuleiro, verifica se computador ou jogador venceram, 
	                                                se sim, jogo acaba e continua o código */  		                                                 
	      while (!fimJogo) {
	          jogador.jogadorJogada(tabu.tabuleiro);
	          fimJogo = tabu.VerificaVencedor(tabu.tabuleiro);
	          if (fimJogo) {
	              break;
	          }
	          
	          comp.jogadaComputador(tabu.tabuleiro);
	          fimJogo = tabu.VerificaVencedor(tabu.tabuleiro);
	          if (fimJogo) {
	              break;
	          }
	      }
	       System.out.println();
	       System.out.println("Gostaria de jogar Novamente? Digite 's' para sim ou 'n' para não.");
      
	       String resultado = teclado.nextLine();
	       
		                        /*saindo do looping anterior, ou seja com o fim de jogo, pergunta se deseja um novo jogo
                                 atribui a resposta a resultado e se a resposta for sim, nova jogada recebe verdadeiro
                                 de jogo rolando, chama método de resetar o teclado da classe tabuleiro, fim de jogo recebe
                                 falso, e chama método de mostrar tabuleiro da classe tabuleiro, se não imprimi mensagem de 
                                 agradecimento e encerra código, se outra letra, imprimi e computa novamente digitação de usuário, até ser válido.*/
																											      
																	
           switch (resultado){
           case "s":
           case "S":
        	  novaJogada = true;
              System.out.println();
        	  System.out.println("Legal, Divirta-se");
              tabu.resetaTeclado(tabu.tabuleiro);
              fimJogo = false;
              tabu.mostraTabuleiro(tabu.tabuleiro);
              break;

           case "n":
           case "N":
        	  novaJogada = false;
              System.out.println();
        	  System.out.println("Obrigado por jogar !");
          default:
				break;
        	  }
        }
    }
}
