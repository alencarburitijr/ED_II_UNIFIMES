import java.util.ArrayList;

public class Grafo<TIPO> {
    ArrayList<TIPO> vertice;
    ArrayList<TIPO> aresta;
   
    Grafo(){
        this.vertice = new ArrayList<TIPO>();
        this.aresta = new ArrayList<TIPO>();                    
    }
    
    public void imprimirGrafo(){
        System.out.println("Vertices: " + this.vertice);
        System.out.println("Arestas: " + this.aresta);
    }
}
