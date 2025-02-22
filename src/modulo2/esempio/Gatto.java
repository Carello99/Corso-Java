package modulo2.esempio;

//Sottoclasse Gatto che estende la classe Animale
public class Gatto extends Animale {

	// Costruttore
	public Gatto(String nome, int età) {
		super(nome, età);
	}

	// Metodo specifico del gatto
	public void miagola() {
		System.out.println(getNome() + " miagola: Miao!");
	}

	// Sovrascrittura del metodo emetteSuono
	@Override
	public void emetteSuono() {
		System.out.println(getNome() + " fa: Miao!");
	}
}