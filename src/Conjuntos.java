import java.util.*;

public class Conjuntos implements Comparable<Conjuntos>{

	ArrayList<Intervalo> conjunto = new ArrayList<>();

	// classe intervalo, que possui ts e tf como atributos
	class Intervalo {

		private int ts, tf;

		public int getTs() {
			return ts;
		}

		public void setTs(int ts) {
			this.ts = ts;
		}

		public int getTf() {
			return tf;
		}

		public void setTf(int tf) {
			this.tf = tf;
		}

		@Override
		public String toString() {

			return "Intervalo [ts=" + ts + ", tf=" + tf + "] \n";
		}
	}

	public ArrayList<Intervalo> geraIntervalo() {
		Random n = new Random();

		for (int i = 0; i < 1000000; i++) { // i = quantidade de intervalos no conjunto
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
	
	
	
	
	

	public ArrayList<Intervalo> subOtimo(Conjuntos c) { // ts crescente ou menor intervalo
		
		c.geraIntervalo();
		
		
		
		ArrayList<Intervalo> subOtimo = new ArrayList<>();

		for (int i = 0; i < c.geraIntervalo().size(); i++) {

			subOtimo.add(c.geraIntervalo().get(i));
		}

		return subOtimo;
	}
	
	
	public ArrayList<Intervalo> otimo(Conjuntos c) { // ordenar TF em ordem crescente
		ArrayList<Intervalo> otimo = new ArrayList<>();

		c.geraIntervalo().sort(null);
		for (int i = 0; i < c.geraIntervalo().size(); i++) {
			
			otimo.add(c.geraIntervalo().get(i));
//
//			Intervalo aux = c.geraIntervalo().get(i);
//			Intervalo aux2 = c.geraIntervalo().get(i);
//			if (aux.getTf() < aux2.getTf()) {
//				otimo.add(aux);
//			}
//			
		}

		return otimo;
	}

	@Override
	public int compareTo(Conjuntos o) {
		
		
		if(o.geraIntervalo()) {
			return -1;
		}
		if()
		return 0;
	}

}
