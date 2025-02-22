package modulo1.esercizio.analisi;

/**
 * Classe utilizzata per poter fare degli esercizi di analisi.
 * Bisogna comprendere cosa fa ogni singolo metodo statico.
 */
public class Esercizi {

	public static boolean verifica(String codice) {
		if (codice.length() == 11)
			return true;
		if (codice.length() == 16)
			return true;
		return false;
	}

	public static boolean verifica2(String codice) {
		if (codice == null || codice.trim().isEmpty()) {
			return false;
		}
		codice = codice.toUpperCase().replaceAll(" ", "");
		int lunghezza = codice.length();
		return lunghezza == 27 && codice.startsWith("IT") && codice.substring(2, 4).matches("[0-9]{2}")
				&& codice.substring(4).matches("[A-Z0-9]+");
	}

	public static float elabora(int numero1, int numero2) {
		return (float) numero1 / numero2;
	}

	public static int calcola(int a, int b, int c, int d) {
		return a + a + c + d;
	}

	public boolean elabora2(int[] vettore, int numero) {
		int x = 10;
		int numero2 = numero;
		boolean domanda = false;
		for (int i = 0; i < vettore.length; i++) {
			if (vettore[i] == numero || vettore[i] == numero2)
				domanda = true;
		}
		return domanda;
	}

	// Da qua si possono richiamare i metodo della classe Esercizi per testare
	public static void main(String[] args) {

	}
}
