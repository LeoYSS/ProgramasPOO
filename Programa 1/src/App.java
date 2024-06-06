import java.util.Scanner;

public class App {

    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        String[] pokemon = {"Pikachu","Charmander","Squirtle","Bulbasur"};
            
        System.out.println("BIENVENIDO AL MUNDO POKEMON");
        System.out.println("Vamos a inicar la aventura seleccionando uno de los 4 pokemones");
        System.out.println("Los pokemones son: ");
        for(int i=0; i< pokemon.length; i++){
            System.out.println("-> "+ pokemon[i]+ " ");
        }
        System.out.println("SELECCIONE UNO");
        String opcion = teclado.nextLine();
        Interaccion usuario = new Interaccion(opcion);
    }
    
}

class Interaccion{
    protected String name;
    // constructor
    public Interaccion(String name){
        this.name = name;
    }
    
}