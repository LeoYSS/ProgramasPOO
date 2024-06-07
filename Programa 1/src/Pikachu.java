public class Pikachu extends Pokemon {
        protected String Campoelectrico ="Campo eléctrico = electrifica el terreno de combate durante 5 turnos";
        protected String Rayo = "Rayo = causa 15 de daño a su rival y tiene 10% de probabilidad para paralizarlo" ;
        protected String Colaferria = "Cola ferria= golpe fisico que causa 15 de daño a su rival";
        protected String Carga = "Carga = potencia el ataque de tu siguiente turno";
        private String name;

        public Pikachu(String name,String tipo, String pokemon, String color, String evolucion){
            super(tipo, pokemon,color, evolucion);
            this.name = name;
        }

        @Override
        public String MostrarPokemon(){
            return name+"\n" +"\nTipo: "+ tipo +"\nPokemon: "+ pokemon +"\nColor: "+color +"\nEvoluciones: "+ evolucion+ "\nAtaques..."+ "\n Campo eléctrico :" + Campoelectrico+"\n Rayo :"+ Rayo + "\nCola ferrea: "+ Colaferrea +"\nCarga: "+ Carga + "\n";
    }
}
