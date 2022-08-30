package uninters;

import java.util.Iterator;
import java.util.Scanner;

public class Tabuleiro {
	JogoVelha jog = new JogoVelha();       //criando objeto jog para acessar conteúdo classe jogo velha

	public char [][] tabuleiro = {{'_', '|','_','|','_'} , {'_', '|','_','|','_'} , {' ', '|',' ','|',' '}};
	                                                        /*criando tabuleiro _ | _ | _      [0][0] , [0][2] , [0][4]
                                                                                _ | _ | _      [1][0] , [1][2] , [1][4]
                                                                                  |   |        [2][0] , [2][2] , [2][4]
                                                                                 */
	
	public void mostraTabuleiro(char[][] tabuleiro) {  /*método que vai mostrar tabuleiro,obtém um array e vai imprimir o conteúdo do array no console. 
	                                                     usando um loop for aninhado. O primeiro loop diz que, para 
	                                                     cada linha dentro do tabuleiro , faça o segundo loop.
                                                         O segundo loop diz que, para cada caractere dentro da linha, imprimi o caractere. 
                                                         No final de cada segundo loop, cria uma nova linha para evitar que os caracteres 
                                                         sejam impressos juntos na mesma linha.*/
		
		for (char[] linha : tabuleiro) {
			for(char c : linha) {
				System.out.print(c);
			}
			System.out.println();
		  }
	   }
	
	public  void atualizaTabuleiro(int posicao, int jogador, char[][] tabuleiro) {  /*método que vai atualizar o tabuleiro, coloca o sómbolo X para as
	                                                                                  jogadas do jogador e O para as jogadas do computador, a partir de
	                                                                                  1 ou 2, determina de quem é a vez e coloca o símbolo na casa 
	                                                                                  escolhida*/
	
	    char simbolo;
	
	    if (jogador == 1) {
	      simbolo = 'X';
	    } else {
	      simbolo = 'O';
	    }

    switch (posicao) {

    case 1:
      tabuleiro[0][0] = simbolo;
      mostraTabuleiro(tabuleiro);
      break;
    case 2:
      tabuleiro[0][2] = simbolo;
      mostraTabuleiro(tabuleiro);
      break;
    case 3:
      tabuleiro[0][4] = simbolo;
      mostraTabuleiro(tabuleiro);
      break;
    case 4:
      tabuleiro[1][0] = simbolo;
      mostraTabuleiro(tabuleiro);
      break;
    case 5:
      tabuleiro[1][2] = simbolo;
      mostraTabuleiro(tabuleiro);
      break;
    case 6:
      tabuleiro[1][4] = simbolo;
      mostraTabuleiro(tabuleiro);
      break;
    case 7:
      tabuleiro[2][0] = simbolo;
      mostraTabuleiro(tabuleiro);
      break;
    case 8:
      tabuleiro[2][2] = simbolo;
      mostraTabuleiro(tabuleiro);
      break;
    case 9:
      tabuleiro[2][4] = simbolo;
      mostraTabuleiro(tabuleiro);
      break;
        
    default:
      break;
    }
  }

	public boolean VerificaVencedor(char[][] tabuleiro){   /*método que retorna um booleano, verificando se alguém venceu
	                                                         acessa as posições das casas e verifica se está vazia, ou se obtém um símbolo
	                                                         se sim, continua verificando (precisam de três casas marcadas com o mesmo símbolo
	                                                         para ganhar, verdadeiro), se falso vai para próximo padrão possível vitorioso*/
	    //Verifica vitoria de X na:
	    //Vertical
	    if(tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro [2][0] == 'X'){
		     System.out.println();
			 System.out.println(jog.nomes+" Ganhou !");
	        return true;
	    }
	     else if(tabuleiro[1][0] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[1][4] == 'X'){
	    	 System.out.println();
	    	 System.out.println(jog.nomes+" Ganhou !");
	        return true;
	     }
	     else if(tabuleiro[2][0] == 'X' && tabuleiro[2][2] == 'X' && tabuleiro[2][4] == 'X'){
	    	 System.out.println();
	    	 System.out.println(jog.nomes+" Ganhou !");
	        return true;
	    }
	
	     //Horizontal
	     else if(tabuleiro[0][0] == 'X' && tabuleiro[0][2] == 'X' && tabuleiro[0][4] == 'X'){
		    System.out.println();
		    System.out.println(jog.nomes+" Ganhou !");
	    return true;
	    }
	    else if(tabuleiro[1][0] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[1][4] == 'X'){
		    System.out.println();
		    System.out.println(jog.nomes+" Ganhou !");
	    return true;
	    } 
	    else if(tabuleiro[2][0] == 'X' && tabuleiro[2][2] == 'X' && tabuleiro[2][4] == 'X'){
		    System.out.println();
		    System.out.println(jog.nomes+" Ganhou !");
	    return true;
	    }
	    //Diagonal
	    else if(tabuleiro[0][0] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][4] == 'X'){
		    System.out.println();
		    System.out.println(jog.nomes+" Ganhou !");
	    return true;
	    }
	    else if(tabuleiro[0][4] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][0] == 'X'){
		    System.out.println();
		    System.out.println(jog.nomes+" Ganhou !");
	    return true;
	    }
	    //Verifica vitoria de O na:
	    //Vertical
	    if(tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O'){
		    System.out.println();
		    System.out.println("Computador ganhou !");
	    return true;
	    }
	    else if(tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O'){
		    System.out.println();
		    System.out.println("Computador ganhou !");
	    return true;
	    }
	    else if(tabuleiro[0][4] == 'O' && tabuleiro[1][4] == 'O' && tabuleiro[2][4] == 'O'){
		    System.out.println();
		    System.out.println("Computador ganhou !");
	    return true;
	    }
	
	    //Horizontal
	    if(tabuleiro[0][0] == 'O' && tabuleiro[0][2] == 'O' && tabuleiro[0][4] == 'O'){
		    System.out.println();
		    System.out.println("Computador ganhou !");
	    return true;
	    }
	    else if(tabuleiro[1][0] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[1][4] == 'O'){
		    System.out.println();
		    System.out.println("Computador ganhou !");
	    return true;
	    }
	    else if(tabuleiro[2][0] == 'O' && tabuleiro[2][2] == 'O' && tabuleiro[2][4] == 'O'){
		    System.out.println();
		    System.out.println("Computador ganhou !");
	    return true;
	    }
	
	    //Diagonal
	    if(tabuleiro[0][0] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][4] == 'O'){
		    System.out.println();
		    System.out.println("Computador ganhou !");
	    return true;
	    }
	    else if(tabuleiro[0][4] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][0] == 'O'){
		    System.out.println();
		    System.out.println("Computador ganhou !");
	    return true; 
	    }
	    if(tabuleiro[0][0] != '_' && tabuleiro[0][2] != '_' && tabuleiro[0][4] != '_' && tabuleiro[1][0] !='_'&&
	        	tabuleiro[1][2] != '_' && tabuleiro[1][4] != '_' && tabuleiro[2][0] != ' ' && tabuleiro[2][2] != ' ' && tabuleiro[2][4] != ' '){
		        System.out.println();    
		    	System.out.println("Deu velha - Empatou !");
	            return true;
	    }
	
	    return false;
	  }
	public  void resetaTeclado(char [][] tabuleiro){   //método que apaga inserções voltando o tabuleiro ao seu estado de início
	    tabuleiro[0][0] = '_';
	    tabuleiro[0][2] = '_';
	    tabuleiro[0][4] = '_';
	    tabuleiro[1][0] = '_';
	    tabuleiro[1][2] = '_';
	    tabuleiro[1][4] = '_';
	    tabuleiro[2][0] = ' ';
	    tabuleiro[2][2] = ' ';
	    tabuleiro[2][4] = ' ';
	}
}