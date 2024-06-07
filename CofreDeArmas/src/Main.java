public class Main{
    public static void main (String[] args) {
       Espada misEspadas[]=new Espada[3];
       misEspadas[0]=new EspadaMadera(4,"espada de madera","cafe","maderas");
       misEspadas[1]=new EspadaDiamante( 8,"espada de Diamante","azul claro","Diamante");
       misEspadas[2]=new EspadaHierro(6,"espada de Hierro","gris","Hierros");
       for(Espada  Espadas: misEspadas){
           System.out.println(Espadas.MostrarDatos());
           
        }
    }
}