public class Aresta<TIPO> {
    private Double peso;
    private Vertice<TIPO> inicio;
    private Vertice<TIPO> fim;

    public Aresta(Double peso, Vertice<TIPO> inicio, Vertice<TIPO> fim) {
        this.peso = peso;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Double getPeso() {
        return peso;
    }

    public Vertice<TIPO> getInicio() {
        return inicio;
    }

    public Vertice<TIPO> getFim() {
        return fim;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setInicio(Vertice<TIPO> inicio) {
        this.inicio = inicio;
    }

    public void setFim(Vertice<TIPO> fim) {
        this.fim = fim;
    }

    public void adicionarAresta(ArrayList<Vertice<TIPO>> verticeEntrada, ArrayList<Vertice<TIPO>> verticeSaida,
            Object valor) {
        verticeSaida.add(verticeEntrada);
        verticeEntrada.add(verticeSaida);

    }

    // Implementar na próxima aula
    public void removerVertice() {

    }
}
