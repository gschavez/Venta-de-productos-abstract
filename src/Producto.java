interface Vendible{
    void CalcularPrecio(int cantidad);
}


public abstract class Producto {
    protected String nombre;
    protected String marca;
    protected double precio;
    protected int cantidadEnStock;

    public Producto() {
    }

    public Producto(String marca, String nombre, double precio,int cantidadEnStock) {
        this.marca = marca;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock=cantidadEnStock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }
    public abstract void mostrarDeltalles();

}
