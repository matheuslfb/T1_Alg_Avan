import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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

	public static <T> void main(String[] args) {

		int countOtimo = 0;
		int subOtimo = 0;
		
		
		ArrayList<Double> sub = new ArrayList<>(); 

		ArrayList<Double> otimo = new ArrayList<>(); 
		
		for (int i = 0; i < 10; i++) {
			Conjuntos c = new Conjuntos();
			
//			c.geraIntervalo();
//			c.otimo(c);
//			c.subOtimo(c);
			
			System.out.println(c.geraIntervalo());
			System.out.println("�timo: \n" + c.otimo(c));
			System.out.println("Sub-�timo: \n" + c.subOtimo(c));
			sub.add((double) c.subOtimo(c).size()); // armazena em um vetor o tamanho de cada subconjunto sub-otimo
			otimo.add((double) c.otimo(c).size()); //armazena em um vetor o tamanho de cada subconjunto otimo
			countOtimo = countOtimo + c.otimo(c).size(); //somat�rio dos subconjuntos otimos
			subOtimo = subOtimo + c.subOtimo(c).size(); //somat�rio dos subconjuntos sub-otimos
		}
		
		
			double v = 0;
			for(Double x : sub) {
				v+= Math.pow(x, 2);
			}
			
		
		
		
		
		System.out.println("M�dia do n�mero elementos dos subconjuntos otimos: " + countOtimo/10);
		System.out.println("M�dia do n�mero de elementos dos subconjuntos sub-�timos: "+ subOtimo/10);

		// SUBOTIMO
		// System.out.println(c.geraIntervalo());
		// System.out.println("�timo: \n" + c.subOtimo(c));
		// System.out.println("ordinariooo: \n" + c.getConjunto());

		// �TIMO
		// System.out.println(c.geraIntervalo());
		// System.out.println("�timo: \n" + c.otimo(c));
		// System.out.println("ordinariooo: \n" + c.getConjunto());

		
	
	}

}
