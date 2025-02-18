package checkedException;

import java.io.IOException;

public class TryCatchFinallyExample {

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

		// qua viene lanciata eccezione, ma la catturiamo
		try {
			System.out.println(sum(x, y));
		} catch (IOException e) {
			// eventuali operazioni custom
			e.printStackTrace();
		}

		// qua non viene lanciata eccezione
		y = 15;
		try {
			System.out.println(sum(x, y));
		} catch (IOException e) {
			// eventuali operazioni custom
			e.printStackTrace();
		}

		// qua viene lanciata eccezione
		y = null;
		try {
			System.out.println(sum(x, y));
		} catch (IOException e) {
			// eventuali operazioni custom
			e.printStackTrace();
		} finally {
			System.out.println("Finalmente stampiamo, anche dopo eccezione.");
		}

		// qua non viene lanciata eccezione
		y = 15;
		try {
			System.out.println(sum(x, y));
		} catch (IOException e) {
			// eventuali operazioni custom
			e.printStackTrace();
		} finally {
			System.out.println("Finalmente stampiamo, anche senza eccezione.");
		}

	}

}
