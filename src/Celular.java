public class Celular extends Producto implements Vendible{
    protected String capacidadBateria;
    protected String resolucionCamara;

    public Celular() {
    }

    public Celular(String marca, String nombre, double precio, int cantidadEnStock, String capacidadBateria, String resolucionCamara) {
        super(marca, nombre, precio, cantidadEnStock);
        this.capacidadBateria = capacidadBateria;
        this.resolucionCamara = resolucionCamara;
    }

    public String getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(String capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public String getResolucionCamara() {
        return resolucionCamara;
    }

    public void setResolucionCamara(String resolucionCamara) {
        this.resolucionCamara = resolucionCamara;
    }

    @Override
    public void mostrarDeltalles() {
        System.out.println("El nombre del producto es: " + nombre);
        System.out.println("Marca del producto: " + marca);
        System.out.println("Precio del produtco: " + precio);
        System.out.println("cantidad en stock: " +cantidadEnStock);
        System.out.println("La capacidad de la bateria es " + capacidadBateria);
        System.out.println("La resolucion de la camara es " + resolucionCamara);
    }

    @Override
    public void CalcularPrecio(int cantidad) {
        this.precio=precio*cantidad;

        if (cantidad>5){
            double descuento = (precio/100)*15;
            this.precio=precio - descuento;
            System.out.println("Felicidades, te ganaste un desciento del 15% por comprar nuestros productos!!!");
            System.out.println("El precio final de los productos es de " + precio);
        }
        else {
            System.out.println("el precio es de " + precio);

        }
    }
}
