public class Aresta {
    public void adicionarAresta(ArrayList<Vertice<TIPO>> verticeEntrada, ArrayList<Vertice> verticeSaida, Object valor){
        verticeSaida.add(verticeEntrada);
        verticeEntrada.add(verticeSaida);
    }

    }
    public void removerVertice(){

    }
}
