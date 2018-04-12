import java.util.ArrayList;
import java.util.Random;

/*
 * 1) Desenvolva um gerador aleat�rio de intervalos. Use uma distribui��o uniforme para escolher
 *	 os tempos iniciais e finais. Certifique-se de que para todo intervalo i gerado tsi < tfi.
 * 
 * 2) Use o gerador para criar 10 conjuntos com 10^6 intervalos
 *  cada tal que tf de cada intervalo n�o exceda 1000.
 * 
 * 3) Escolha e implemente uma estrat�gia gulosa sub-�tima e a estrat�gia gulosa �tima.
 * 
 * 4) Compare os dois algoritmos nos 10 conjuntos de intervalos criados.
 *  A compara��o pode ser feita atrav�s da m�dia e do desvio padr�o 
 *	 de cada execu��o.
 */

public class app {

	public static void main(String[] args) {

//		for(int i = 0; i<10; i++){
//			Conjuntos c = new Conjuntos();
//			System.out.println(c.geraIntervalo());
//		}
//		
		Conjuntos c = new Conjuntos();
		c.geraIntervalo();
		
		System.out.println(c.otimo(c));
		
		

	}

}
