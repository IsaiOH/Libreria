import java.util.*;

public class Categoria {
    private String categoria;
    private int indice;
    private Set<String> lista =new HashSet<>();
    private Map<Integer,String> product = new HashMap<>();

    public Categoria(){

    }



    public void setCategoria(String list) {
        this.lista.add(list);
    }

    public void getCategoria(){
        Iterator<String> itr = this.lista.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public void producto(String nombre){
        this.indice +=1;
        product.put(this.indice,nombre);
    }

    public void getProductos(){
        for(Integer num: product.keySet()){
            System.out.println("CLASE CATEGORIA " + product.get(num));
        }
    }


}
