



public class ArvoreFilho {

    public static void main(String[] args) {
        // TODO code application logic here
        Arvore<Integer> arvore = new Arvore<Integer>();
        arvore.adicionar(100);
        arvore.adicionar(50);
        arvore.adicionar(75);
        arvore.adicionar(74);
        arvore.adicionar(76);
        arvore.adicionar(73);
        arvore.adicionar(150);
        arvore.adicionar(125);
        arvore.adicionar(124);
        arvore.adicionar(130);
        arvore.adicionar(131);
        System.out.println("\n\nEm Ordem");
        arvore.emOrdem(arvore.getRaiz());
        
        System.out.println("\n\nPré Ordem");
        arvore.preOrdem(arvore.getRaiz());
        
        System.out.println("\n\nPós Ordem");
        arvore.posOrdem(arvore.getRaiz()); 
        
        
        
            
        }
    }
    

