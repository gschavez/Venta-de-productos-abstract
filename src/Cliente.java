import java.util.ArrayList;
import java.util.List;

public class Cliente {

    protected  String nombre;
    protected  String email;
    List<Producto> productosComprados = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String email, String nombre, List<Producto> productosComprados) {
        this.email = email;
        this.nombre = nombre;
        this.productosComprados = productosComprados;
    }
}
