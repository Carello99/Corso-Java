package customException;

public class CustomUncheckedException extends RuntimeException {

	/*
	 * Nome della variabile che causa eccezione
	 */
	private final String nomeVariabile;

	/**
	 * @param nomeVariabile
	 */
	public CustomUncheckedException(String nomeVariabile) {
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
