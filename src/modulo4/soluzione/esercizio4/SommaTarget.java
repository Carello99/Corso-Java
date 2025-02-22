package modulo4.soluzione.esercizio4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SommaTarget {
	public static int[] trovaCoppia(int[] numeri, int target) {
        Map<Integer, Integer> mappa = new HashMap<>();

        for (int i = 0; i < numeri.length; i++) {
            int complemento = target - numeri[i];

            if (mappa.containsKey(complemento)) {
                return new int[]{mappa.get(complemento), i}; // Restituisce gli indici
            }

            mappa.put(numeri[i], i);
        }

        return new int[]{-1, -1}; // Nessuna coppia trovata
    }

    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int target = 9;
        int[] risultato = trovaCoppia(array, target);

        System.out.println("Indici trovati: " + Arrays.toString(risultato));
    }

}
