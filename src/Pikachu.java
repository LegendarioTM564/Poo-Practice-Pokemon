
public class Pikachu extends Pokemon implements IElectrico  {
	
	private int numPokedex;
	private String NombrePokemon;
	private double pesoPokemon;
	private String sexo;
	private int temporada;
	private String tipo;
	
	public Pikachu(){
		this.NombrePokemon = "Pikachu";
		this.numPokedex = 25;
		this.pesoPokemon = 6.0;
		this.sexo="N/A";
		this.tipo = "Electrico";
		this.temporada= 1;
	}

	@Override
	public void atacarPlacaje() {
		System.out.println("Soy Pikachu y este mi ataque Placaje");

	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Soy Pikachu y este mi ataque Arañazo");

	}

	@Override
	public void atacarMordizco() {
		System.out.println("Soy Pikachu y este mi ataque Mordizco");

	}

	@Override
	public void atacarImpactrueno() {
		System.out.println("Soy Pikachu y este mi ataque Impactrueno");
		
	}

	@Override
	public void atacarPunioTrueno() {
		System.out.println("Soy Pikachu y este mi ataque Puño Trueno");
		
	}

	@Override
	public void atacarRayo() {
		System.out.println("Soy Pikachu y este mi ataque Rayo");
		
	}

	@Override
	public void atacarRayoCarga() {
		System.out.println("Soy Pikachu y este mi ataque Rayo Carga");
		
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


