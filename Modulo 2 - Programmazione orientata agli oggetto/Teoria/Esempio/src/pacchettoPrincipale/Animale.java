package pacchettoPrincipale;

//1. Classe base: Animale
public class Animale {
	// Incapsulamento: Attributi privati per nascondere i dati
	private String nome;
	private int età;

	// Costruttore per inizializzare l'oggetto
	public Animale(String nome, int età) {
		this.nome = nome;
		this.età = età;
	}

	// Getter e setter per accedere ai dati in modo controllato
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEtà() {
		return età;
	}

	public void setEtà(int età) {
		this.età = età;
	}

	// Metodo generale per fare un suono (può essere sovrascritto nelle sottoclassi)
	public void emetteSuono() {
		System.out.println(nome + " emette un suono generico.");
	}
}