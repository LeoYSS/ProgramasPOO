import java.util.Scanner;

public class App {
    public class Inicio {
        String name;
        // metodos
        public static void seleccion(){
            String[] pokemon = new String[4];
            pokemon[0]="Charmander";
            pokemon[1]="Bulbasur";
            pokemon[2]="Squirtle";
            pokemon[3]="Pikachu";
            System.out.println("Los pokemones son: ");
            for(int i = 0; i<=pokemon.length; i++){
                System.out.println(pokemon[i]);
            }
        }
        // Constructor
        
        
    }
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("BIENVENIDO AL MUNDO POKEMON");
        System.out.println("Vamos a inicar la aventura seleccionando uno de los 4 pokemones");
        // Llama el metodo de la clase padre
        Inicio.seleccion();
        System.out.println("Seleccione uno");
        String us1 = teclado.nextLine();

    }
    
}
