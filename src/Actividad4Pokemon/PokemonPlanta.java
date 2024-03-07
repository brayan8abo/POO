package Actividad4Pokemon;

public class PokemonPlanta extends Pokemon {

	public PokemonPlanta(String nombre, int healthPoints, int fuerzaDeAtaque) {
		super(nombre, healthPoints, fuerzaDeAtaque);

	}

	public void atacar(Pokemon pokemon) {

		if (pokemon instanceof PokemonAgua) {

			this.setFuerzaAtaque(getFuerzaAtaque() * 2);
			System.out.println(
					this.getNombreP() + " ATACA A: " + pokemon.getNombreP() + " CON: " + this.getFuerzaAtaque());
			pokemon.setHealthPoints(pokemon.gethealthPoints() - this.getFuerzaAtaque());
		}

		if ((pokemon instanceof PokemonFuego) || ((pokemon instanceof PokemonPlanta))) {
			this.setFuerzaAtaque(getFuerzaAtaque() / 2);
			System.out.println(
					this.getNombreP() + " ATACA A: " + pokemon.getNombreP() + " CON: " + this.getFuerzaAtaque());
			pokemon.setHealthPoints(pokemon.gethealthPoints() - this.getFuerzaAtaque());
		}

		else {
			System.out.println(
					this.getNombreP() + " ATACA A: " + pokemon.getNombreP() + " de :" + this.getFuerzaAtaque());
			pokemon.setHealthPoints(pokemon.gethealthPoints() - this.getFuerzaAtaque());
		}

		System.out.println("LA VIDA DE: " + pokemon.getNombreP() + " ES DE: " + pokemon.gethealthPoints());
		
	}

}
