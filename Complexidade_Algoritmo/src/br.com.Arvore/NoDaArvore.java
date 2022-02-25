
public class NoDaArvore {
    private String valor;
    private NoDaArvore esquerda;
    private NoDaArvore direita;

    NoDaArvore(String valor, NoDaArvore esquerda, NoDaArvore direita) {
        this.valor = valor;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public void gerarArvore(String valor, NoDaArvore esquerada, NoDaArvore direita) {
        this.valor = valor;
        this.esquerda = esquerda;
        this.direita = direita;        
    }

    public static void main(String[] args){

        NoDaArvore nodoProfessor1 = new NoDaArvore("Maxilei", null, null);
        NoDaArvore nodoProfessor2 = new NoDaArvore("Estelamara", null, null);
        
        
        NoDaArvore nodoProfJoaoAmorim = new NoDaArvore("Joao Amorim", null, null);
        NoDaArvore nodoProfAlencar = new NoDaArvore("Alencar", null, null);
         
        NoDaArvore nodoCoordenadorAdm = new NoDaArvore("Pedro", nodoProfessor1, nodoProfessor2);        
        NoDaArvore nodoCoordenadorSI = new NoDaArvore("Reuber", nodoProfAlencar, nodoProfJoaoAmorim);
        
        NoDaArvore nodoReitora = new NoDaArvore("Reitora", nodoCoordenadorAdm, nodoCoordenadorSI);        
        NoDaArvore nodoViceReitora = new NoDaArvore("ViceReitora", null, null);        
         
        NoDaArvore nodoRaiz = new NoDaArvore("UNIFIMES", nodoReitora, nodoViceReitora);                

        System.out.println("Pre-Ordem");
        nodoRaiz.imprimirPreOrdem(nodoRaiz);
        System.out.println("");

        System.out.println("Em-Ordem");
        nodoRaiz.imprimirEmOrdem(nodoRaiz);
        System.out.println("");

        System.out.println("Pos-Ordem");
        nodoRaiz.imprimirPosOrdem(nodoRaiz);
        System.out.println("");

    }

    public static void imprimirPreOrdem(NoDaArvore n) {
        System.out.print(n.valor + " ");
        if (n.esquerda != null) {
            imprimirPreOrdem(n.esquerda);
        }

        if (n.direita != null) {
            imprimirPreOrdem(n.direita);
        }

    }

    public static void imprimirEmOrdem(NoDaArvore n) {
        if (n.esquerda != null) {
            imprimirEmOrdem(n.esquerda);
        }
        System.out.print(n.valor + " ");
        if (n.direita != null) {
            imprimirEmOrdem(n.direita);
        }

    }

    public static void imprimirPosOrdem(NoDaArvore n) {

        if (n.esquerda != null) {
            imprimirPosOrdem(n.esquerda);
        }

        if (n.direita != null) {
            imprimirPosOrdem(n.direita);
        }
        System.out.print(n.valor + " ");

    }

}
