
public class TestPokemos {

	
	public static void main(String[] args) {
		
		Pikachu pikachu = new Pikachu();
		Bulbasaur bulbasaur = new Bulbasaur();
		Charmander charmander = new Charmander();
		Squirtle squirtle = new Squirtle();
		Pokemon venusaur = new PokemonX("Venusaur", 4, 100.0, "N/A", 1, "Planta");
		
		System.out.println(pikachu.getNombrePokemon());
		System.out.println(bulbasaur.getNombrePokemon());
		System.out.println(charmander.getNombrePokemon());
		System.out.println(squirtle.getNombrePokemon());
		
		pikachu.atacarImpactrueno();
		bulbasaur.atacarDrenaje();
		charmander.atacarLanzallamas();
		squirtle.atacarHidroBomba();
		venusaur.atacarPlacaje();
		
		
	}
}
