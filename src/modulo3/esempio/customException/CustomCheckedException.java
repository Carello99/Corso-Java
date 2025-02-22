package modulo3.esempio.customException;

public class CustomCheckedException extends Exception {

	/*
	 * Nome della variabile che causa eccezione
	 */
	private final String nomeVariabile;

	/**
	 * @param nomeVariabile
	 */
	public CustomCheckedException(String nomeVariabile) {
		super("Param "+nomeVariabile+" is null.");
		this.nomeVariabile = nomeVariabile;
	}

	/**
	 * @return the nomeVariabile
	 */
	public String getNomeVariabile() {
		return nomeVariabile;
	}
	
}
