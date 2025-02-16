import java.util.List;
import java.util.Scanner;

public class Libreria {
    private Categoria cat;
    private String nombre;
    private List<String> listaCa;
    private String opcion;
    Scanner scan = new Scanner(System.in);


    public void agregarCategoria(Categoria cat1){
        this.cat = cat1;

        System.out.println("Ingresa una categoria");
        opcion = scan.nextLine();
        cat.setCategoria(opcion);
    }

    public void mostrarInventario(Inventario in){
            in.getInventario();
    }

    public void mostrarCategoria(){
        cat.getCategoria();
    }


}
