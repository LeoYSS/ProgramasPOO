public class EspadaMadera extends Espada {
    private int danio;

    public EspadaMadera(int danio, String nombre, String color, String material) {
        super(nombre, color, material);
        this.danio = danio;

    }

    public int getdanio() {
        return danio;
    }

    @Override
    public String MostrarDatos() {
        return "\nDaño: " + danio + "\nNombre:" + nombre + "\nColor: " + color + "\nMaterial: " + material;
    }
}