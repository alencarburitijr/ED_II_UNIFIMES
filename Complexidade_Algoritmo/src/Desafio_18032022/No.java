import java.io.*;
import java.util.*;

// No esquerda;//filho da esquerda
// No direita;//filho da direita
// Aluno valor;//conteúdo do Nó
public class No {
    No esquerda;
    No direita;
    Aluno valor;

    public No(Aluno valor) {// construtor do Nó atribuindo valor e iniciando os filhos como null
        this.valor = valor;
        this.direita = this.esquerda = null;
    }

    public void inserir(No node, Aluno valor) {// método para inserir nós na árvore
        if (valor.matricula < node.valor.matricula) {// se a matricula do aluno a inserir é menor que a do nó atual
            if (node.esquerda != null) {// se já existir um nó do lado esquerdo do nó atual
                inserir(node.esquerda, valor);// chama a funcao recursiva inserir do lado esquerdo do nó atual
            } else {// se não existir nó do lado esquerdo
                System.out.println("Inserindo " + valor.matricula + " a esquerda da matricula " + node.valor.matricula);
                node.esquerda = new No(valor);// cria novo nó com o valor passado em parametro e insere-o na árvore do
                                              // lado esquerdo do nó atual
            }
        } else if (valor.matricula > node.valor.matricula) {// se a matricula do aluno a inserir é maior que a do nó
                                                            // atual
            if (node.direita != null) {// se já existir um nó do lado direito do nó atual
                inserir(node.direita, valor);// chama a funcao recursiva inserir do lado direito do nó atual
            } else {// se não existir nó do lado direito
                System.out.println("Inserindo " + valor.matricula + " a direita da matricula " + node.valor.matricula);
                node.direita = new No(valor);// cria novo nó com o valor passado em parametro e insere-o na árvore do
                                             // lado direito do nó atual
            }
        }
    }

}