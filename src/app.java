import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/*
 * 1) Desenvolva um gerador aleatï¿½rio de intervalos. Use uma distribuiï¿½ï¿½o uniforme para escolher
 *	 os tempos iniciais e finais. Certifique-se de que para todo intervalo i gerado tsi < tfi.
 * 
 * 2) Use o gerador para criar 10 conjuntos com 10^6 intervalos
 *  cada tal que tf de cada intervalo nï¿½o exceda 1000.
 * 
 * 3) Escolha e implemente uma estratï¿½gia gulosa sub-ï¿½tima e a estratï¿½gia gulosa ï¿½tima.
 * 
 * 4) Compare os dois algoritmos nos 10 conjuntos de intervalos criados.
 *  A comparaï¿½ï¿½o pode ser feita atravï¿½s da mï¿½dia e do desvio padrï¿½o 
 *	 de cada execuï¿½ï¿½o.
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
			System.out.println("ótimo: \n" + c.otimo(c));
			System.out.println("Sub-ótimo: \n" + c.subOtimo(c));
			sub.add((double) c.subOtimo(c).size()); // armazena em um vetor o tamanho de cada subconjunto sub-otimo
			otimo.add((double) c.otimo(c).size()); //armazena em um vetor o tamanho de cada subconjunto otimo
			countOtimo = countOtimo + c.otimo(c).size(); //somatório dos subconjuntos otimos
			subOtimo = subOtimo + c.subOtimo(c).size(); //somatório dos subconjuntos sub-otimos
		}
		
		
			double v = 0;
			for(Double x : sub) {
				v+= Math.pow(x, 2);
			}
			
		
		
		
		
		System.out.println("Média do número elementos dos subconjuntos otimos: " + countOtimo/10);
		System.out.println("Média do número de elementos dos subconjuntos sub-ótimos: "+ subOtimo/10);

		// SUBOTIMO
		// System.out.println(c.geraIntervalo());
		// System.out.println("ótimo: \n" + c.subOtimo(c));
		// System.out.println("ordinariooo: \n" + c.getConjunto());

		// ÓTIMO
		// System.out.println(c.geraIntervalo());
		// System.out.println("ótimo: \n" + c.otimo(c));
		// System.out.println("ordinariooo: \n" + c.getConjunto());

		
	
	}

}
