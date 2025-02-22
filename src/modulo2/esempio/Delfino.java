package modulo2.esempio;

//Classe Delfino che estende Animale e implementa AnimaleMarino
public class Delfino extends Animale implements AnimaleMarino {

	// Costruttore
	public Delfino(String nome, int età) {
		super(nome, età);
	}

	// Implementazione del metodo nuota dell'interfaccia
	@Override
	public void nuota() {
		System.out.println(getNome() + " sta nuotando nel mare.");
	}

	// Sovrascrittura del metodo emetteSuono
	@Override
	public void emetteSuono() {
		System.out.println(getNome() + " emette suoni simili a click.");
	}
}
