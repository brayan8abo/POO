package Actividad4Pokemon;

public class PokemonAgua extends Pokemon {

	public PokemonAgua(String nombreP, int healthPoints, int fuerzaAtaque) {
		super(nombreP, healthPoints, fuerzaAtaque);
	}

	public void atacar(Pokemon pokemon) {

		if (pokemon instanceof PokemonFuego) {

			this.setFuerzaAtaque(getFuerzaAtaque() * 2);

			System.out.println("El atacante es: " + this.getNombreP() + " y está atacnado a: " + pokemon.getNombreP()
					+ " con fuerza de ataque de: " + this.getFuerzaAtaque());
		}

		if ((pokemon instanceof PokemonAgua) || ((pokemon instanceof PokemonPlanta))) {
			this.setFuerzaAtaque(getFuerzaAtaque() / 2);

			System.out.println("El atacante es: " + this.getNombreP() + " y está atacnado a: " + pokemon.getNombreP()
					+ " con fuerza de ataque de: " + this.getFuerzaAtaque());
		}

		else {
			System.out.println("El atacante es: " + this.getNombreP() + " y está atacnado a: " + pokemon.getNombreP()
					+ " con fuerza de ataque de: " + this.getFuerzaAtaque());
		}

		System.out.println("LA VIDA DE: " + pokemon.getNombreP() + " ES DE: " + pokemon.gethealthPoints());
	}

}
