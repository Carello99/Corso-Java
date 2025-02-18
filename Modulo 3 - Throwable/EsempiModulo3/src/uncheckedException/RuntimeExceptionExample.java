package uncheckedException;

public class RuntimeExceptionExample {

	/**
	 * Method to sum two Integer values
	 * 
	 * @param x first argument
	 * @param y second argument
	 * @return the sum of x and y
	 * @throws IllegalArgumentException if x or y are null
	 */
	public static Integer sum(Integer x, Integer y) throws IllegalArgumentException {
		if (x == null)
			throw new IllegalArgumentException("Param x is null.");
		if (y == null)
			throw new IllegalArgumentException("Param y is null.");
		return Integer.sum(x, y);
	}

	public static void main(String[] args) {
		Integer x = 10;
		Integer y = null;

		System.out.println(sum(x, y));

		System.out.println("Questo output viene stampato?");
	}

}
