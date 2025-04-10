public class Laptop extends Producto implements Vendible{

    protected String procesador;
    protected String memRam;

    public Laptop() {
    }

    public Laptop(String marca, String nombre, double precio, int cantidadEnStock, String memRam, String procesador) {
        super(marca, nombre, precio, cantidadEnStock);
        this.memRam = memRam;
        this.procesador = procesador;
    }

    public String getMemRam() {
        return memRam;
    }

    public void setMemRam(String memRam) {
        this.memRam = memRam;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public void mostrarDeltalles() {
        System.out.println("El nombre del producto es: " + nombre);
        System.out.println("Marca del producto: " + marca);
        System.out.println("Precio del produtco: " + precio);
        System.out.println("cantidad en stock: " +cantidadEnStock);
        System.out.println("Procesador " + procesador);
        System.out.println("Memoria Ram " + memRam);
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
//System.out.println("El nombre del producto es: " + nombre);
//        System.out.println("Marca del producto: " + marca);
//        System.out.println("Precio del produtco: " + precio);
//        System.out.println("cantidad en stock: " +cantidadEnStock);