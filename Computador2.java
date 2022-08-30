package uninters;

import java.util.Random;

public class Computador2 extends Computador{                  // importa randow herda da classe computador
	 
    
	public  void jogadaComputador(char [][] tabuleiro){
									/*método que realiza jogada do computuador, sorteia um número, com o objeto randow que escolhe
								      um número aleatório, porém nesse caso, sorteia 0 a 8, porém é acrescido de +1 para sortear a partir do 1 e não do 0
									  já que as casas do tabuleiro começam a partir de 1, ou seja nessa lógica nunca vai jogar na casa 9*/ 

		Random sort = new Random();
    	int movimento = sort.nextInt(8)+1;

	    boolean resultado = jogador.movimentoValido(movimento,tabuleiro);
																		    /*booleano que acessa o método movimento valido da classe jogador
																	        e retorna se verdadeiro ou falso, se falso looping de sortear
																	        novamente se inicia*/

	    while(!resultado){
	    	
	    	movimento = sort.nextInt(8)+1;
	        resultado = jogador.movimentoValido(movimento, tabuleiro);
	    }
																	    /*imprimi mensagem onde computador jogou e acessa método de atualizar
																        tabuleiro da classe tabuleiro, atualizando-o*/

		System.out.println("Computador jogou em: "+ movimento);
	    tabu.atualizaTabuleiro(movimento,2,tabuleiro);
	   
	}
}

