package modulo3.soluzione.esercizio1;

import java.util.Scanner;

public class Divisione {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        boolean successo = false;

        while (!successo) {
            try {
                System.out.print("Inserisci il numeratore: ");
                int numeratore = scanner.nextInt();

                System.out.print("Inserisci il denominatore: ");
                int denominatore = scanner.nextInt();

                int risultato = numeratore / denominatore;
                System.out.println("Risultato: " + risultato);
                successo = true;  // Esce dal loop se la divisione è valida
            } catch (ArithmeticException e) {
                System.out.println("Errore: impossibile dividere per zero! Riprova.");
            } catch (Exception e) {
                System.out.println("Errore: input non valido. Usa solo numeri interi.");
                scanner.next();  // Pulisce l'input errato
            }
        }

        scanner.close();
	}

}
