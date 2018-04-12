import java.util.ArrayList;
import java.util.Random;

/*
 * 1) Desenvolva um gerador aleatório de intervalos. Use uma distribuição uniforme para escolher
 *	 os tempos iniciais e finais. Certifique-se de que para todo intervalo i gerado tsi < tfi.
 * 
 * 2) Use o gerador para criar 10 conjuntos com 10^6 intervalos
 *  cada tal que tf de cada intervalo não exceda 1000.
 * 
 * 3) Escolha e implemente uma estratégia gulosa sub-ótima e a estratégia gulosa ótima.
 * 
 * 4) Compare os dois algoritmos nos 10 conjuntos de intervalos criados.
 *  A comparação pode ser feita através da média e do desvio padrão 
 *	 de cada execução.
 */

public class app {

	public static void main(String[] args) {

		for(int i = 0; i<10; i++){
			Conjuntos c = new Conjuntos();
			System.out.println(c.geraIntervalo());
		}
		

	}

}
