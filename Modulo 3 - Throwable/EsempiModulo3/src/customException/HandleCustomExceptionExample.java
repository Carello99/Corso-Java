package customException;

public class HandleCustomExceptionExample {

	/**
	 * Method to sum two Integer values
	 * 
	 * @param x first argument
	 * @param y second argument
	 * @return the sum of x and y
	 * @throws CustomCheckedException if x or y are null
	 */
	public static Integer sumChecked(Integer x, Integer y) throws CustomCheckedException {
		if (x == null)
			throw new CustomCheckedException("x");
		if (y == null)
			throw new CustomCheckedException("y");
		return Integer.sum(x, y);
	}

	/**
	 * Method to sum two Integer values
	 * 
	 * @param x first argument
	 * @param y second argument
	 * @return the sum of x and y
	 */
	public static Integer sumUnchecked(Integer x, Integer y) {
		if (x == null)
			throw new CustomUncheckedException("x");
		if (y == null)
			throw new CustomUncheckedException("y");
		return Integer.sum(x, y);
	}
	
	public static void main(String[] args) {
		Integer x = 10;
		Integer y = null;

		try {
			System.out.println(sumChecked(x, y));
		} catch (CustomCheckedException e) {
			// eventuali operazioni custom
			System.out.println("La variabile " + e.getNomeVariabile() + " ha fatto un bordello");
			e.printStackTrace();
		}

		x = null;
		System.out.println(sumUnchecked(x, y));
		
	}

}
