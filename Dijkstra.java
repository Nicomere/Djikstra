import java.util.PriorityQueue;

public class Dijkstra {
    private PriorityQueue coda;
    public void shortestPath(Nodo suorce){
        suorce.setPeso(0, suorce);
        int i=0;
    }
    public void modify(Nodo nodo){
        nodo.visited=true;
        for (var n : nodo.linkList.entrySet()) {
            if (n.getKey().getPeso()>(nodo.getPeso()+n.getValue())){
                n.getKey().setPeso(nodo.getPeso()+n.getValue(), nodo);
                modify(n.getKey());
            }
        }
    }
}