package uninters;

import java.util.Random;

public class Computador {
	Jogador jogador = new Jogador();            // importa randow, criando jogador para acessar conteúdo classe jogador e tabu para acessar calsse tabuleiro
	Tabuleiro tabu = new Tabuleiro();

    
	
	public  void jogadaComputador(char [][] tabuleiro){ 
		
	                                          /*método que realiza jogada do computuador, sorteia um número, com o objeto randow que escolhe
	                                          um número aleatório, nesse caso de 0 a 9, porém é acrescido de +1 para sortear a partir do 1 e não do 0
	                                          já que as casas do tabuleiro começam a partir de 1*/ 
		Random sort = new Random();
    	int movimento = sort.nextInt(9)+1;	    
	    boolean resultado = jogador.movimentoValido(movimento,tabuleiro);     /*booleano que acessa o método movimento valido da classe jogador
	                                                                            e retorna se verdadeiro ou falso, se falso looping de sortear
	                                                                            novamente se inicia*/
	   
	    while(!resultado){
	    	
	    	movimento = sort.nextInt(9)+1;
	        resultado = jogador.movimentoValido(movimento, tabuleiro);
	    }

	    System.out.println("Computador jogou em: "+ movimento);                /*imprimi mensagem onde computador jogou e acessa método de atualizar
	                                                                             tabuleiro da classe tabuleiro, atualizando-o*/
	    tabu.atualizaTabuleiro(movimento,2,tabuleiro);
	}


}
