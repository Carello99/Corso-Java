package modulo2.esempio;

//Sottoclasse Cane che estende la classe Animale
public class Cane extends Animale {

	// Costruttore che chiama il costruttore della superclasse
	public Cane(String nome, int età) {
		super(nome, età);
	}

	// Metodo specifico del cane
	public void abbaia() {
		System.out.println(getNome() + " abbaia: Bau bau!");
	}

	// Sovrascrittura del metodo emetteSuono
	@Override
	public void emetteSuono() {
		System.out.println(getNome() + " fa: Bau bau!");
	}
}
