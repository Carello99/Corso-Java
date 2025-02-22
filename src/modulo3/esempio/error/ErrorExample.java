package modulo3.esempio.error;

public class ErrorExample {

	public static void funny() {
		funny();
	}
	
	/*
	 * Cosa mai accadra'?
	 */
	public static void main(String[] args) {
		funny();
	}

}
