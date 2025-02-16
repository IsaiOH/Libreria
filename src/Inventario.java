import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Inventario <T>{
private Map<Integer,String> listaIn = new HashMap<>();
private int indice;
private T obj;
public Inventario(){

}
public void añadirLi(ProductoLibro li){
    this.indice +=1;
    this.listaIn.put(this.indice,li.getNombre());
}
    public void añadirRe(ProductoRevista re){
        this.indice +=1;
        this.listaIn.put(this.indice,re.getNombre());
    }

public void getInventario(){
    for(Integer num: listaIn.keySet()){
        System.out.println(listaIn.get(num));
    }

}




}
