package modulo3.esempio.checkedException;

import java.io.IOException;

public class CheckedExeptionExample {

	/**
	 * Method to sum two Integer values
	 * 
	 * @param x first argument
	 * @param y second argument
	 * @return the sum of x and y
	 * @throws IOException if x or y are null
	 */
	public static Integer sum(Integer x, Integer y) throws IOException {
		if (x == null)
			throw new IOException("Param x is null.");
		if (y == null)
			throw new IOException("Param y is null.");
		return Integer.sum(x, y);
	}

	public static void main(String[] args) {
		Integer x = 10;
		Integer y = null;

		// Rimuovere il commento seguente e osservare cosa succede.
		// System.out.println(sum(x,y));

		System.out.println("Questo output viene stampato?");
	}

}
