
public class Squirtle extends Pokemon implements IAgua {
	
	private int numPokedex;
	private String NombrePokemon;
	private double pesoPokemon;
	private String sexo;
	private int temporada;
	private String tipo;
	
	public Squirtle(){
		this.NombrePokemon = "Squirtle";
		this.numPokedex = 7;
		this.pesoPokemon = 9.0;
		this.sexo="N/A";
		this.tipo = "Agua";
		this.temporada= 1;
	}
	
	
	@Override
	public void atacarPlacaje() {
		System.out.println("Soy Squirtle y este mi ataque Placaje");
	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Soy Squirtle y este mi ataque Arañazo");

	}

	@Override
	public void atacarMordizco() {
		System.out.println("Soy Squirtle y este mi ataque Mordizco");

	}

	@Override
	public void atacarHidroBomba() {
		System.out.println("Soy Squirtle y este mi ataque Hidro Bomba");
		
	}

	@Override
	public void atacarPistolaAgua() {
		System.out.println("Soy Squirtle y este mi ataque Pistola de Agua");
		
	}

	@Override
	public void atacarBrubuja() {
		System.out.println("Soy Squirtle y este mi ataque Burbuja");
		
	}

	@Override
	public void atacarHidroPulso() {
		System.out.println("Soy Squirtle y este mi ataque Hidro Pulso");
		
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
