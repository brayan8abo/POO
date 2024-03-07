package Actividad4Pokemon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainPokemon {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		ArrayList<Pokemon> pokemones = new ArrayList<>();

		PokemonFuego Chispa = new PokemonFuego("Chispa", 2500, 3000);
		PokemonAgua Cascada = new PokemonAgua("Cascada", 3000, 4000);
		PokemonPlanta Arbusto = new PokemonPlanta("Arbusto", 4500, 4000);

		pokemones.add(Arbusto);
		pokemones.add(Cascada);
		pokemones.add(Chispa);

		for (Pokemon atacantes : pokemones) {
			System.out.println("[" + atacantes.getNombreP() + "]");
		}
		System.out.println("Elije el pokemon con el que vamos atacar");
		String primeraEleccion = leer.nextLine();

		System.out.println("\nAhora elije al contrincante");
		for (Pokemon atacados : pokemones) {

			if (!atacados.getNombreP().equalsIgnoreCase(primeraEleccion)) {
				System.out.println("[" + atacados.getNombreP() + "]");
			}
		}
		String segundaEleccion = leer.nextLine();

		boolean isBattle = true;

		for (int i = 0; i < pokemones.size(); i++) {
			if (pokemones.get(i).getNombreP().equalsIgnoreCase(primeraEleccion)) {
				for (int j = 0; j < pokemones.size(); j++) {
					if (pokemones.get(j).getNombreP().equalsIgnoreCase(segundaEleccion)) {

						do {
							pokemones.get(i).atacar(pokemones.get(j));
							isBattle = pokemones.get(j).isDead();

							if (pokemones.get(j).isDead()) {
								break;

							}
							pokemones.get(j).atacar(pokemones.get(i));
							isBattle = pokemones.get(i).isDead();

						} while (!isBattle);
					}

				}

			}

		}

	}

}
