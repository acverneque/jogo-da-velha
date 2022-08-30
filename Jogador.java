package uninters;

import java.util.Scanner;

public class Jogador {
	Tabuleiro tabu = new Tabuleiro();             ///importa scanner e criando objeto tabu para acessar classe tabuleiro

     public void jogadorJogada(char[][] tabuleiro){   // método para leitura de jogada escolhida pelo usuário, testa se a jogada é valida com booleano
	                                               
	                                               
	                                                                                      
	  Scanner leitura = new Scanner(System.in);                  

	  System.out.println("Faça uma jogada: (1-9)");
	  int movimento = leitura.nextInt();
	 
	  
	  boolean resultado = movimentoValido(movimento,tabuleiro);  // acessando método booleano que verifica se a jogada é válida, se não for válida,
                                                          // entra em looping,imprimi mensagem, lê novamente e testa se é válida, se sim sai do looping
	  while(!resultado){
	      System.out.println("Jogada inválida, Tente novamente !");
	      movimento = leitura.nextInt();
	      resultado = movimentoValido(movimento,tabuleiro);
	  }

	  System.out.println("Jogador jogou em:  " + movimento);/*imprimi mensagem dizendo onde foi a jogada e acessa método de atualizar o tabuleiro da 
	                                                          classe tabuleiro*/
	  tabu.atualizaTabuleiro(movimento,1,tabuleiro);         
	 }
	 
	 public  boolean movimentoValido(int movimento, char[][] tabuleiro){     /*método que verifica se a casa do tabuleiro que o usuário escolheu
		                                                                       está vazia, se sim retorna verdadeiro, se não retorna falso, ou seja
		                                                                       a casa está ocupada e a jogada é inválida*/
		                                                                     

		    switch (movimento){
		        case 1:
		            if(tabuleiro[0][0] == '_'){
		                return true;
		            } else{
		                return false;
		            }
		        case 2:
		            if(tabuleiro[0][2] == '_'){
		                return true;
		            } else{
		                return false;
		            }
		        case 3:
		            if(tabuleiro[0][4] == '_'){
		                return true;
		            } else{
		                return false;
		            }

		        case 4:
		            if(tabuleiro[1][0] == '_'){
		                return true;
		            } else{
		                return false;
		            }
		        case 5:
		            if(tabuleiro[1][2] == '_'){
		                return true;
		            } else{
		                return false;
		            }
		        case 6:
		            if(tabuleiro[1][4] == '_'){
		                return true;
		            } else{
		                return false;
		            }
		        case 7:
		            if(tabuleiro[2][0] == ' '){
		                return true;
		            } else{
		                return false;
		            }
		        case 8:
		            if(tabuleiro[2][2] == ' '){
		                return true;
		            } else{
		                return false;
		            }
		        case 9:
		            if(tabuleiro[2][4] == ' '){
		                return true;
		            } else{
		                return false;
		            }

		        default:
		            return false;  
	     }
    }

}
