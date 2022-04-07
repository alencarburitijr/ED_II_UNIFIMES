

 


import java.util.ArrayList;
import java.util.Collections;

public class Arvore {


private String valor;
private Arvore esquerda;
private Arvore direita;
static ArrayList cc = new ArrayList < String> ();



Arvore (String valor, Arvore esquerda, Arvore direita) {
    this.valor = valor;
    this.esquerda = esquerda;
    this.direita = direita;
}

public void gerarArvore(String valor, Arvore esquerda, Arvore direita) {
    this.valor = valor;
    this.esquerda = esquerda;
    this.direita = direita;  
    
    
    
  
}



public static void main(String[] args){
	

Arvore nodo131 = new Arvore("131", null, null); 
Arvore nodo73 = new Arvore("73", null, null);


Arvore nodo74 = new Arvore("74", nodo73, null); 
Arvore nodo76 = new Arvore("76", null, null); 


Arvore nodo124 = new Arvore("124", null, null); 
Arvore nodo130 = new Arvore("130", nodo131, null); 

Arvore nodo75= new Arvore("75", nodo74, nodo76); 
Arvore nodo125 = new Arvore("125", nodo124, nodo130); 


Arvore nodo150 = new Arvore ("150", nodo125, null); 
Arvore nodo50 = new Arvore ("50", nodo75, null); 


Arvore nodo100= new Arvore ("100", nodo50, nodo150);  

System.out.println("Pre-Ordem");
nodo100.imprimirPreOrdem(nodo100);
System.out.println("");

System.out.println("Em-Ordem");
nodo100.imprimirEmOrdem(nodo100);
System.out.println("");

System.out.println("Pos-Ordem");
nodo100.imprimirPosOrdem(nodo100);
System.out.println("");

}


public void imprimirPreOrdem(Arvore n) {
System.out.print(n.valor + " ");
if (n.esquerda != null) {
    imprimirPreOrdem(n.esquerda);
}

if (n.direita != null) {
    imprimirPreOrdem(n.direita);
}

}

public void imprimirEmOrdem(Arvore n) {
    
   
if (n.esquerda != null) {
    imprimirEmOrdem(n.esquerda);
    no.add(n.esquerda);
}
System.out.print(n.valor + " ");
if (n.direita != null) {
    // imprimirEmOrdem(n.direita);
    no.add(n.direita);
    
}
 
}

public void imprimirPosOrdem (Arvore n) {

if (n.esquerda != null) {
    imprimirPosOrdem(n.esquerda);
}

if (n.direita != null) {
    imprimirPosOrdem(n.direita);
}
System.out.print(n.valor + " ");

Collections.sort(cc);
    System.out.println("Array ordenado" + "");

 
}
 
}
  