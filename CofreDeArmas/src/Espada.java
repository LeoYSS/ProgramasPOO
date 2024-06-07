public class Espada {
    protected String nombre;
    protected String color;
    protected String material;

    public Espada(String nombre, String color, String material) {
        this.nombre = nombre;
        this.color = color;
        this.material = material;
    }                   

    public String getnombre() {
        return nombre;
    }

    public String getcolor() {
        return color;
    }

    public String getmaterial() {
        return material;
    }

    public String MostrarDatos(){
        return "\nNombre:"+nombre+"\nColor: "+color+"\nMaterial: "+ material;
    }
}