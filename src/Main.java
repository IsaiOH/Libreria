public class Main {
    public static void main(String[] args) {

        ProductoLibro p1 = new ProductoLibro();
        ProductoLibro p2 = new ProductoLibro();
        ProductoRevista r1 =new ProductoRevista();
        Categoria cat1 = new Categoria();
        Inventario inv1 = new Inventario();
        Libreria lib1 = new Libreria();
        p1.producto("Guerra de los mundos",120.6f,5656,"Novela de OVNIS");
        p2.producto("Algebra 1", 300.70f,8899,"Abstraccion matematica");
        r1.producto("Excelsior",200.0f,9898,"Revista de noticies");
        cat1.setCategoria("Ciencia Ficcion");

        //AÑADIR PRODUCTO A INVENTARIO
        inv1.añadirLi(p1);
        inv1.añadirLi(p2);
        inv1.añadirRe(r1);

        //AÑADIR PRODUCTO A CATEGORIA
        cat1.producto(p1.getNombre());
        cat1.producto(p2.getNombre());

        cat1.getProductos();


        //MOSTRAR LOS REGISTROS DE LA CLASE INVENTARIOS DESDE CLASE LIBRERIA
        lib1.mostrarInventario(inv1);

        //AGREGAR CATEGORIA DESDE CLASE LIBRERIA A CLASE CATEGORIA
        lib1.agregarCategoria(cat1);

        //MOSTRAR LAS CATEGORIAS DESDE CLASE CATEGORIA
        lib1.mostrarCategoria();

    }
}