
public class Charmander extends Pokemon implements IFuego {
	private int numPokedex;
	private String NombrePokemon;
	private double pesoPokemon;
	private String sexo;
	private int temporada;
	private String tipo;
	
	public Charmander(){
		this.NombrePokemon = "Charmander";
		this.numPokedex = 4;
		this.pesoPokemon = 8.5;
		this.sexo="N/A";
		this.tipo = "Fuego";
		this.temporada= 1;
	}

	@Override
	public void atacarPlacaje() {
		System.out.println("Soy Charmander y este mi ataque Placaje");

	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Soy Charmander y este mi ataque Arañazo");

	}

	@Override
	public void atacarMordizco() {
		System.out.println("Soy Charmander y este mi ataque Mordizco");

	}

	@Override
	public void atacarPunioFuego() {
		System.out.println("Soy Charmander y este mi ataque Puño Fuego");
		
	}

	@Override
	public void atacarAscuas() {
		System.out.println("Soy Charmander y este mi ataque Ascuas");
		
	}

	@Override
	public void atacarLanzallamas() {
		System.out.println("Soy Charmander y este mi ataque Lanza Llamas");
		
	}

	public int getNumPokedex() {
		return numPokedex;
	}

	public String getNombrePokemon() {
		return NombrePokemon;
	}

	public double getPesoPokemon() {
		return pesoPokemon;
	}

	public String getSexo() {
		return sexo;
	}

	public int getTemporada() {
		return temporada;
	}

	public String getTipo() {
		return tipo;
	}

	
	

}
