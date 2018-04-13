import java.util.*;


/*
 * @author Matheus Lima Ferreira
 * @date 15/04/2018
 * 
 */
public class Conjuntos {

	ArrayList<Intervalo> conjunto = new ArrayList<>();

	// classe intervalo, que possui ts e tf como atributos

	public ArrayList<Intervalo> getConjunto() {
		return conjunto;
	}

	public ArrayList<Intervalo> geraIntervalo() {
		Random n = new Random();

		for (int i = 0; i < 5; i++) { // i = quantidade de intervalos no
										// conjunto
			conjunto.add(i, new Intervalo());
		}

		for (int i = 0; i < conjunto.size(); i++) {
			int ts = n.nextInt(1000); // seta o random
			int tf = n.nextInt(1000);

			if (ts < tf) { // faz a verifica��o para que ts < tf
				conjunto.get(i).setTs(ts); // TS recebe o random
				conjunto.get(i).setTf(tf);
			} else if (tf < ts) {
				conjunto.get(i).setTs(tf); // TS recebe o random
				conjunto.get(i).setTf(ts);

			}
		}
		return conjunto;
	}

	/*
	 * @param  Um conjunto de intervalos
	 * @return retorna um subconjunto com um resultado subOtimo sobre os intervalos de cada conjunto.
	 */
	public ArrayList<Intervalo> subOtimo(Conjuntos c) { // TS em order crescente ou menor intervalo

		Collections.sort(c.getConjunto(), new Comparator<Object>() {
			public int compare(Object o1, Object o2) {
				Intervalo p1 = (Intervalo) o1;
				Intervalo p2 = (Intervalo) o2;
				return p1.getTs() < p2.getTs() ? -1 : (p1.getTs() > p2.getTs() ? +1 : 0);
			}
		});

		c.getConjunto().stream().sorted();
		
		ArrayList<Intervalo> subOtimo = new ArrayList<>();

		for (int i = 0; i < c.getConjunto().size(); i++) {

			subOtimo.add(c.getConjunto().get(i));
			System.out.println("adicionado: " + c.getConjunto().get(i));
		}

		return subOtimo;
	}

	/*
	 * @param  Um conjunto de intervalos
	 * @return retorna um subconjunto com um resultado otimo sobre os intervalos de cada conjunto.
	 */
	public static ArrayList<Intervalo> otimo(Conjuntos c) { // ordenar TF em ordem crescente

		Collections.sort(c.getConjunto(), new Comparator<Object>() {
			public int compare(Object o1, Object o2) {
				Intervalo p1 = (Intervalo) o1;
				Intervalo p2 = (Intervalo) o2;
				return p1.getTf() < p2.getTf() ? -1 : (p1.getTf() > p2.getTf() ? +1 : 0);
			}
		});

		ArrayList<Intervalo> otimo = new ArrayList<>();

		c.getConjunto().stream().sorted();

		for (int i = 0; i < c.getConjunto().size(); i++) {

			otimo.add(c.getConjunto().get(i));
			System.out.println("adicionou: " + c.getConjunto().get(i));
		}

		return otimo;
	}

}
