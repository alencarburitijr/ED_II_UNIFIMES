import java.util.ArrayList;

public class Grafo<TIPO> {
    ArrayList<Vertice<TIPO>> vertices;
    ArrayList<Aresta<TIPO>> arestas;

    public Grafo() {
        this.vertices = new ArrayList<Vertice<TIPO>>();
        this.arestas = new ArrayList<Aresta<TIPO>>();
    }

    public void adicionarVertice(TIPO dado) {
        Vertice<TIPO> novoVertice = new Vertice<TIPO>(dado);
        this.vertices.add(novoVertice);
    }

    public void adicionarAresta(Double peso, TIPO inicio, TIPO fim) {
        Vertice<TIPO> verticeInicio = this.getVertice(inicio);
        Vertice<TIPO> verticeFim = this.getVertice(fim);
        Aresta<TIPO> aresta = new Aresta<TIPO>(peso, verticeInicio, verticeFim);
        verticeInicio.adicionarArestaSaida(aresta);
        verticeFim.adicionarArestaEntrada(aresta);
        this.arestas.add(aresta);
    }

    public Vertice<TIPO> getVertice(TIPO dado) {
        Vertice<TIPO> vertice = null;
        for (int i=0; i < this.vertices.size(); i++) {
            if (this.vertices.get(i).getDado().equals(dado)) {
                vertice = this.vertices.get(i);
                break;
            }
            return vertice;
        }
        return null;
    }

    public void imprimirGrafo() {
        System.out.println("Vertices: " + this.vertices);
        System.out.println("Arestas: " + this.arestas);
    }
}
