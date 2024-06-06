import java.util.Scanner;

public class App {

    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        String[] pokemon = {"Pikachu (1)","Charmander (2)","Squirtle (3)","Bulbasur (4)"};
            
        System.out.println("BIENVENIDO AL MUNDO POKEMON");
        System.out.println("Vamos a inicar la aventura seleccionando uno de los 4 pokemones");
        System.out.println("Los pokemones son: ");
        for(int i=0; i< pokemon.length; i++){
            System.out.println("-> "+ pokemon[i]+ " ");
        }
        System.out.println("SELECCIONE UNO");
        int opcion = teclado.nextInt();
        String name;
        // System.out.println("Mostrando caracteristicas...");
        switch (opcion) {
                case 1:
                        // this.opcion = name;
                break;
                case 2:
                    // this.opcion = name;
                break;
                case 3:
                    name = "Squirtle";
                    PokemonIn usuario = new PokemonIn(name);
                    
                break;
                case 4:
                    //  name = ;
                break;
            default:
                System.out.println("ERROR");
                break;
        }

    }
    
}
// clase padre
class PokemonIn {
    protected String name;
    public PokemonIn(String name) {
        this.name = name;
    }
    
    
}
class Acciones extends PokemonIn{
    public Acciones(String name) {
        super(name);
    }

}
class Squirtle{
    // atributos
    protected String tipo = "Agua";
    protected String Pokemon = "Tortuga";
    protected String color = "Azul";
    protected String evolucion = "Wartortle y Blastoise";
    // metodos
    public void PlacajeTackle(){
        System.out.println("Placaje Tackle = baja de un 10 a 20 % de vida del rival");
    }
    public void LatigoTailwhip(){
        System.out.println("Latigo Tailwhip = baja la resistencia del rival en un 10 al 15%");
    }
    public void PistolaDeAgua(){
        System.out.println("Pistola De Agua = baja un 10% de vida del rival y disminuye ataques de fuego");
    }
    public void RefugioWithdraw(){
        System.out.println("Refugio Withdraw = aumenta la resistencia en un 15%");
    }
}

class Bulbasaur{
    protected String tipo = "Planta/Veneno";
    protected String pokemon = "Semilla";
    protected String color = "Verde con manchas oscuras";
    protected String evolucion = "Ivysaur y Venusaur";

    public void Placaje(){
        System.out.println("Placaje = baja 10 puntos de vida a su rival");
    }
    public void Drenadoras(){
        System.out.println("Drenadoras = inflinge 10 puntos de daño a su rival y la mitad la usara Bulbasaur para regenerar pts. de vida");
    }
}
