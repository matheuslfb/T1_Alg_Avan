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

		for(int i = 0; i<10; i++){
		 Conjuntos c = new Conjuntos();
		 System.out.println(c.geraIntervalo());
		 System.out.println("ótimo: \n" + c.otimo(c));
		 System.out.println("Sub-ótimo: \n" + c.subOtimo(c));
		 }
		
		//SUBOTIMO
		//System.out.println(c.geraIntervalo());
		//System.out.println("ótimo: \n" + c.subOtimo(c));
		//System.out.println("ordinariooo: \n" + c.getConjunto());
		
		//ÓTIMO
		//System.out.println(c.geraIntervalo());
		//System.out.println("ótimo: \n" + c.otimo(c));
		//System.out.println("ordinariooo: \n" + c.getConjunto());
		
	
	}

}
