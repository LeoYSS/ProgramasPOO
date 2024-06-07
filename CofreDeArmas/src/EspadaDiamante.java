public class EspadaDiamante extends Espada {
    private int danio;

    public EspadaDiamante(int danio, String nombre, String color, String material) {
        super(nombre, color, material);
        this.danio = danio;
    }

    @Override
    public String MostrarDatos() {
        return "\nDaño: " + danio + "\nNombre:" + nombre + "\nColor: " + color + "\nMaterial: " + material;
    }
}