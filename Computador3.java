package uninters;

import java.util.Random;

public class Computador3 extends Computador{                           // importa randow herda da classe computador
	
	public  void jogadaComputador(char [][] tabuleiro){
								/*método que realiza jogada do computuador, sorteia um número, com o objeto randow que escolhe
							      um número aleatório de 0 a 10, porém é acrescido de +2 nesse caso para sortear a partir do 3 e não do 0
							      ou seja essa lógica nunca vai jogar na casa 1*/

		Random sort = new Random();
	    int movimento = sort.nextInt(9)+2;

        boolean resultado = jogador.movimentoValido(movimento,tabuleiro);
        
															        /*booleano que acessa o método movimento valido da classe jogador
															        e retorna se verdadeiro ou falso, se falso looping de sortear
															        novamente se inicia*/

        while(!resultado){
    	
    	movimento = sort.nextInt(9)+2;
        resultado = jogador.movimentoValido(movimento, tabuleiro);
        }
														        /*imprimi mensagem onde computador jogou e acessa método de atualizar
														        tabuleiro da classe tabuleiro, atualizando-o*/

	System.out.println("Computador jogou em: "+ movimento);
    tabu.atualizaTabuleiro(movimento,2,tabuleiro);
   
    }

}