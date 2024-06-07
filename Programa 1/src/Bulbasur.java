public class Bulbasur extends Pokemon {
        protected String Placaje = "Placaje = baja 10 puntos de vida a su rival";
        protected String Drenadoras = "Drenadoras = inflinge 10 puntos de daño a su rival y la mitad la usara Bulbasaur para regenerar pts. de vida" ;
        protected String Grunido = "Gruñido = debilita el ataque de su rival";
        protected String PolvoVeneno = "Polvo veneno = su rival pierde 6.25% de vida y cada 4 turnos su rival pierde 1 punto de vida";
        private String name;

        public Bulbasur(String name,String tipo, String pokemon, String color, String evolucion){
            super(tipo, pokemon,color, evolucion);
            this.name = name;
        }

        @Override
        public String MostrarPokemon(){
            return name +"\n"+"\nTipo: "+ tipo +"\nPokemon: "+ pokemon +"\nColor: "+color +"\nEvoluciones: "+ evolucion + "Ataques...."+"\n Placaje"+ Placaje +"\nDrenadoras" + Drenadoras + "\nGruñodo" +Grunido+"\nPolvo Veneno" + PolvoVeneno ;
        }

}

//         protected String tipo = "Planta/Veneno";
//         protected String pokemon = "Semilla";
//         protected String color = "Verde con manchas oscuras";
//         protected String evolucion = "Ivysaur y Venusaur";