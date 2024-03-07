package Actividad4Pokemon;

public class PokemonFuego extends Pokemon {

	public PokemonFuego(String nombreP, int healthPoints, int fuerzaAtaque) {
		super(nombreP, healthPoints, fuerzaAtaque);
	}

	public void atacar(Pokemon pokemon) {

		if (pokemon instanceof PokemonPlanta) {

			this.setFuerzaAtaque(getFuerzaAtaque() * 2);

			System.out.println("El atacante es: " + this.getNombreP() + " y está atacanado a: " + pokemon.getNombreP()
					+ " con fuerza de ataque de: " + this.getFuerzaAtaque());
			pokemon.setHealthPoints(pokemon.gethealthPoints() - this.getFuerzaAtaque());
		}

		if ((pokemon instanceof PokemonAgua) || ((pokemon instanceof PokemonFuego))) {
			this.setFuerzaAtaque(getFuerzaAtaque() / 2);

			System.out.println("El atacante es: " + this.getNombreP() + " y está atacnado a: " + pokemon.getNombreP()
					+ " con fuerza de ataque de: " + this.getFuerzaAtaque());
			pokemon.setHealthPoints(pokemon.gethealthPoints() - this.getFuerzaAtaque());
		}

		if ((!(pokemon instanceof PokemonPlanta)) || !(pokemon instanceof PokemonAgua) || !(pokemon instanceof PokemonFuego)) {

			System.out.println("El atacante es: " + this.getNombreP() + " y está atacnado a: " + pokemon.getNombreP()
					+ " con fuerza de ataque de: " + this.getFuerzaAtaque());
			pokemon.setHealthPoints(pokemon.gethealthPoints() - this.getFuerzaAtaque());
		}

		System.out.println("LA VIDA DE: " + pokemon.getNombreP() + " ES DE: " + pokemon.gethealthPoints());
	}
}