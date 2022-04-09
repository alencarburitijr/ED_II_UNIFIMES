import java.util.ArrayList;

public class Vertice<TIPO> {
    private TIPO dado;
    private ArrayList<Aresta<TIPO>> arestasEntrada;
    private ArrayList<Aresta<TIPO>> arestasSaida;

    public Vertice(TIPO valor) {
        this.dado = valor;
        this.arestasEntrada = new ArrayList<Aresta<TIPO>>();
        this.arestasSaida = new ArrayList<Aresta<TIPO>>();
    }

    public TIPO getDado() {
        return this.dado;
    }

    public void setDado(TIPO valor) {
        this.dado = valor;
    }

    public void adicionarArestaEntrada(Aresta<TIPO> aresta) {
        this.arestasEntrada.add(aresta);
    }

    public void adicionarArestaSaida(Aresta<TIPO> aresta) {
        this.arestasSaida.add(aresta);
    }

    ArrayList<Vertice<TIPO>> verticeEntrada;
    ArrayList<Vertice<TIPO>> verticeSaida;

    public void adicionarVertice(ArrayList<Vertice<TIPO>> verticeEntrada) {
        verticeSaida = new ArrayList<Vertice<TIPO>>();
        adicionarAresta(verticeEntrada, verticeSaida, valor);
    }

    // Implementar na próxima aula
    public void removerVertice() {

    }
}
