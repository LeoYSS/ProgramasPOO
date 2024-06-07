public class App {

   
    public static void main(String[]args){
        Pokemon PokemonInicio [] = new Pokemon[3];
        PokemonInicio[0] = new Squirtle("SQUIRTLE","Agua", "Tortuga", "Azul", "Wartortle y Blastoise");
        PokemonInicio[1] = new Bulbasur("BULBASUR","Planta/Veneno", "Semilla", "Verde con manchas oscuras", "Ivysaur y Venusaur");
        PokemonInicio[2]=new Pikachu("PIKACHU","Electrico","Rata","Amarillo","Raichu");
        System.out.println("BIENVENIDO AL MUNDO POKEMON");
        System.out.println("Vamos a inicar la aventura seleccionando uno de los 4 pokemones");
        System.out.println("Los pokemones son: "+"\n");
        for(Pokemon Pokemon: PokemonInicio){
            System.out.println(Pokemon.MostrarPokemon());
        }
        
    }
    
}
