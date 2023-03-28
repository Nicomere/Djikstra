import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Vector;

public class Nodo {
    public TreeMap<Nodo, Integer> linkList;
    private int peso;
    private Nodo lastModifier;
    public boolean visited;
    public void setPeso(int peso, Nodo modifier){
        this.peso=peso;
        lastModifier=modifier;
    }

    public int getPeso(){
        return peso;
    }
}
