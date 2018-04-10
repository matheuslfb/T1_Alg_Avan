import java.util.ArrayList;
import java.util.Random;

public class app {

	private int ts, tf;

	private static ArrayList<Intervalo> conjunto = new ArrayList<>();
	static Random n = new Random();

	private static void gerador() {

		for (int i = 0; i < 999999; i++) {			
			conjunto.add(i, new Intervalo());
//			System.out.println(conjunto.get(i).toString());
		}
		
		

		for (int i = 0; i < conjunto.size(); i++) {
			int num = n.nextInt(1000); // seta o random

			conjunto.get(i).setTs(num); // TS recebe o random

			if (num < conjunto.get(i).getTs()) { // verifica se TS < TF
				conjunto.get(i).setTf(num); //
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 gerador();
		for (Intervalo x : conjunto) {
			System.out.println("TS: " + x.getTs());
			System.out.println("TF: " + x.getTf());
		}

	}

}
