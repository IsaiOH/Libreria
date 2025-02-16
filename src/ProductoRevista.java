public class ProductoRevista extends ProductoAbstracto{
    private String nombre;
    private Float precio;
    private int codigo;
    private String descripcion;

    @Override
    public void producto(String nombre, Float precio, int codigo, String des) {
        this.nombre =nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.descripcion = des;
    }

    @Override
    public int getCodigo() {
        return codigo;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String mostrarProducto() {
        return nombre + precio + codigo + descripcion;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Float getPrecio() {
        return precio;
    }
}
