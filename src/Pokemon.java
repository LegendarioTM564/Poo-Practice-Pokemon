
public abstract class Pokemon {
	
	protected int numPokedex;
	protected String NombrePokemon;
	protected double pesoPokemon;
	protected String sexo;
	protected int temporada;
	protected String tipo;
	
	public Pokemon(String NombrePokemon, int numPokedex, double pesoPokemon, String sexo, int temporada, String tipo) {
		this.NombrePokemon = NombrePokemon;
		this.numPokedex = numPokedex;
		this.pesoPokemon = pesoPokemon;
		this.sexo = sexo;
		this.temporada = temporada;
		this.tipo = tipo;
		
	}
	
	public Pokemon() {
		
	}
	
	public abstract void atacarPlacaje();
	
	public abstract void atacarAraniazo();
	
	public abstract void atacarMordizco();

	
	
}
