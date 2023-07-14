
public class PokemonX extends Pokemon {

	public PokemonX(String NombrePokemon, int numPokedex, double pesoPokemon, String sexo, int temporada, String tipo) {
		super(NombrePokemon, numPokedex, pesoPokemon, sexo, temporada, tipo);
	}

	@Override
	public void atacarPlacaje() {
		System.out.println("Soy " + super.NombrePokemon + " y este mi ataque Placaje");
		
	}

	@Override
	public void atacarAraniazo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atacarMordizco() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
