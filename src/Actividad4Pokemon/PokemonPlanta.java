package Actividad4Pokemon;

public class PokemonPlanta extends Pokemon {

	public PokemonPlanta(String nombre, int healthPoints, int fuerzaDeAtaque) {
		super(nombre, healthPoints, fuerzaDeAtaque);

	}

	public void atacar(Pokemon pokemon) {

		if (pokemon instanceof PokemonAgua) {

			this.setFuerzaAtaque(getFuerzaAtaque() * 2);
			System.out.println("El atacante es: " + this.getNombreP() + " y está atacanado a: " + pokemon.getNombreP()
					+ " con fuerza de ataque de: " + this.getFuerzaAtaque());
			pokemon.setHealthPoints(pokemon.gethealthPoints() - this.getFuerzaAtaque());
		}

		if ((pokemon instanceof PokemonFuego) || ((pokemon instanceof PokemonPlanta))) {
			this.setFuerzaAtaque(getFuerzaAtaque() / 2);
			System.out.println("El atacante es: " + this.getNombreP() + " y está atacnado a: " + pokemon.getNombreP()
					+ " con fuerza de ataque de: " + this.getFuerzaAtaque());
			pokemon.setHealthPoints(pokemon.gethealthPoints() - this.getFuerzaAtaque());
		}

//		else {
//			System.out.println("El atacante es: " + this.getNombreP() + " y está atacnado a: " + pokemon.getNombreP()
//					+ " con fuerza de ataque de: " + this.getFuerzaAtaque());
//			pokemon.setHealthPoints(pokemon.gethealthPoints() - this.getFuerzaAtaque());
//		}

		System.out.println("LA VIDA DE: " + pokemon.getNombreP() + " ES DE: " + pokemon.gethealthPoints());

	}

}
