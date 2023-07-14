
public class Bulbasaur extends Pokemon implements IPlanta {
	
	private int numPokedex;
	private String NombrePokemon;
	private double pesoPokemon;
	private String sexo;
	private int temporada;
	private String tipo;
	
	public Bulbasaur(){
		this.NombrePokemon = "Bulbasaur";
		this.numPokedex = 1;
		this.pesoPokemon = 6.9;
		this.sexo="N/A";
		this.tipo = "Planta";
		this.temporada= 1;
	}

	@Override
	public void atacarPlacaje() {
		System.out.println("Soy Bulbasaur y este mi ataque Placaje");

	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Soy Bulbasaur y este mi ataque Arañazo");

	}

	@Override
	public void atacarMordizco() {
		System.out.println("Soy Bulbasaur y este mi ataque Mordizco");

	}

	@Override
	public void atacarParalizar() {
		System.out.println("Soy Bulbasaur y este mi ataque Paralizar");
		
	}

	@Override
	public void atacarDrenaje() {
		System.out.println("Soy Bulbasaur y este mi ataque Drenaje");
		
	}

	@Override
	public void atacarHojaAfilada() {
		System.out.println("Soy Bulbasaur y este mi ataque Hoja Afilada");
		
	}

	@Override
	public void atacarLatigoCepa() {
		System.out.println("Soy Bulbasaur y este mi ataque Latigo Cepa");
		
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
