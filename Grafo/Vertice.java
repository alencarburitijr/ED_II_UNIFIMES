import java.util.ArrayList;

public class Vertice<TIPO> {
    <TIPO> valor;
    ArrayList<Vertice<TIPO>> verticeEntrada;
    ArrayList<Vertice<TIPO>> verticeSaida;
    public void adicionarVertice(ArrayList<Vertice<TIPO>> verticeEntrada){   
        verticeSaida = new ArrayList<Vertice<TIPO>>();
        adicionarAresta(verticeEntrada, verticeSaida, valor);

    }
    public void removerVertice(){

    }
}
