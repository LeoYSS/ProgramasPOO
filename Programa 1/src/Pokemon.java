// clase padre
public class Pokemon {
    protected String tipo;
    protected String pokemon;
    protected String color;
    protected String evolucion;

    public Pokemon(String tipo, String pokemon, String color, String evolucion){
        this.tipo = tipo ;
        this.pokemon = pokemon;
        this.color = color;
        this.evolucion = evolucion;
    }

    public String gettipo(){
        return tipo;
    }
    public String getpokemon(){
        return pokemon;
    }
    public String getcolor(){
        return color;
    }
    public String getevolucion(){
        return evolucion;
    }
    public String MostrarPokemon(){
        return "\nTipo: "+ tipo +"\nPokemon: "+ pokemon +"\nColor: "+color +"\nEvoluciones: "+ evolucion;
    }
}