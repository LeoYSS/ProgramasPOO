public class Squirtle extends Pokemon {
    private String name;
    public Squirtle(String name,String tipo, String pokemon, String color, String evolucion) {
        super(tipo, pokemon, color, evolucion);
        this.name = name;
    }
  // Variables de Ataque
    protected String PlacajeTackle = "Placaje Tackle = baja de un 10 a 20 % de vida del rival";
    protected String LatigoTailwhip ="Latigo Tailwhip = baja la resistencia del rival en un 10 al 15%";
    protected String PistolaDeAgua = "Pistola De Agua = baja un 10% de vida del rival y disminuye ataques de fuego";
    protected String RefugioWithdraw = "Refugio Withdraw = aumenta la resistencia en un 15%";
    
    @Override
    public String MostrarPokemon(){
        return name +"\n" +"\nTipo: "+ tipo +"\nPokemon: "+ pokemon +"\nColor: "+color +"\nEvoluciones: "+ evolucion+ "\nAtaques..."+ "\n Placaje :" + PlacajeTackle+"\n Latigo :"+ LatigoTailwhip + "\nPistola de Agua: "+ PistolaDeAgua +"\nRefugio: "+ RefugioWithdraw + "\n";
    }
}
//  tipo = "Agua";
//  Pokemon = "Tortuga";
//  color = "Azul";
//  evolucion = "Wartortle y Blastoise";