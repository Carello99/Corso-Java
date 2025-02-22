package modulo2.esempio;

//Classe principale per eseguire il programma
public class Main {
	public static void main(String[] args) {
		// Creazione di un oggetto Cane
		Cane cane = new Cane("Fido", 5);
		cane.emetteSuono(); // Output: Fido fa: Bau bau!
		cane.abbaia(); // Output: Fido abbaia: Bau bau!

		// Creazione di un oggetto Gatto
		Gatto gatto = new Gatto("Micia", 3);
		gatto.emetteSuono(); // Output: Micia fa: Miao!
		gatto.miagola(); // Output: Micia miagola: Miao!

		// Creazione di un oggetto Delfino
		Delfino delfino = new Delfino("Flipper", 7);
		delfino.emetteSuono(); // Output: Flipper emette suoni simili a click.
		delfino.nuota(); // Output: Flipper sta nuotando nel mare.

		// Polimorfismo: Un riferimento di tipo Animale che punta a un oggetto Cane
		Animale animalePolimorfico = new Cane("Rex", 4);
		animalePolimorfico.emetteSuono(); // Output: Rex fa: Bau bau!
	}
}
