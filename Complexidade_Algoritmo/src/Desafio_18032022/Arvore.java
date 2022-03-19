import java.io.*;
import java.util.*;
public class Arvore {

    No raiz;//atributo do tipo Nó representando a raiz da arvore binaria
    
    public Arvore(){//construtor da classe arvore atribuindo valor inicial pra raiz = null
        this.raiz=null;
    }

    public synchronized void insereNo(Aluno inserido){//metodo para inserir nós na árvore
        if(this.raiz==null){//se a raiz é nula
            raiz=new No(inserido);//cria objeto do tipo Nó, com o parametro inserido e cria o primeiro nó da árvore
        }
        else{//se já possuir uma raiz na árvore
            raiz.inserir(raiz, inserido);//chama o método inserir passando a raiz e o valor a ser inserido no novo nó
        }
    }
    public No procuraNo(int matricula){//metodo para procurar um nó específico passando o numero de matricula do aluno
          No current = raiz;//cria uma variavel do tipo Nó representando o nó atual a ser buscado e atribui ao nó o valor do nó raiz
          while(current.valor.matricula != matricula){//enquanto a matricula a ser procurada é diferente da matricula do nó atual, repetir a operação
             if(matricula < current.valor.matricula) //se a matricula a ser procurada for menor do que a matricula do nó atual
                current = current.esquerda;//atribui ao nó atual o valor do nó do lado esquerdo, de modo a repetir a funcao
             else //se a matricula a ser procurada for maior do que a matricula do nó atual
                current = current.direita;//atribui ao nó atual o valor do nó do lado direito, de modo a repetir a funcao
             if(current == null)//se o nó atual é nulo
                return null;//retorna o nó como nulo, já que o mesmo nao foi encontrado.
          }
          return current;                   
    }

    public boolean removeNo(int matricula){//metodo para remover nós da árvore, passando o parametro de numero de matricula do aluno a ser removido
          No current = raiz;//cria uma variavel do tipo Nó representando o nó atual a ser buscado
          No parent = raiz;//cria uma variavel do tipo Nó representando o nó pai do nó a ser removido
          boolean isLeftChild = true;//variavel boolean (true=o nó é o filho da esquerda) (false=o nó não é o filho da esquerda)

          while(current.valor.matricula != matricula){//igual ao metodo de procura, enquanto o valor da matricula a ser encontrada for diferente do valor da matricula do nó atual a ser buscado, repete a operação
                parent = current;//Nó pai recebe o valor do Nó atual
                if(matricula < current.valor.matricula){//se a matricula a ser procurada for menor do que a matricula do nó atual
                    isLeftChild = true;//a variavel boolean recebe true para indicar que é um filho do lado esquerdo do nó
                    current = current.esquerda;//atribui ao nó atual o valor do nó do lado esquerdo, de modo a repetir a funcao
                }
                else{//se a matricula a ser procurada for maior do que a matricula do nó atual
                    isLeftChild = false;//a variavel boolean recebe false para indicar que não é um filho do lado esquerdo do nó
                    current = current.direita;//atribui ao nó atual o valor do nó do lado direito, de modo a repetir a funcao
                }
                if(current == null)//se o nó atual é nulo
                    return false;//retorna false ja que a matricula nao foi encontrada na árvore
          }
          if(current.esquerda==null && current.direita==null){//se o nó atual não possuir filhos de nenhum dos lados
              if(current == raiz)//se o nó atual é a raiz da árvore
                  raiz = null;//remove o nó raiz transformando a árvore em uma árvore vazia
              else if(isLeftChild)//se o nó for um filho do lado esquerdo
                  parent.esquerda = null;//atribui valor null para o nó do lado esquerdo
              else//se o nó for um filho do lado direito
                  parent.direita = null;//atribui valor null para o nó do lado direito
          }
          else if(current.direita==null)//se apenas o filho do lado direito é nulo
            if(current == raiz)//se o nó atual é igual a raiz
                raiz = current.esquerda;//passa o nó do filho da esquerda para o lugar da raiz
            else if(isLeftChild)//se o nó atual é um filho da esquerda
                parent.esquerda = current.esquerda;//o nó da esquerda do pai recebe o filho da esquerda do nó atual
            else//se o nó atual é um filho da direita
                parent.direita = current.esquerda;//o nó da direita do pai recebe o filho da direita do nó atual
        
          else if(current.esquerda==null)//se apenas o filho do lado esquerdo é nulo
            if(current == raiz)//se o nó atual é igual a raiz
                raiz = current.direita;//passa o nó do filho da direita para o lugar da raiz
            else if(isLeftChild)//se o nó atual é um filho da esquerda
                parent.esquerda = current.direita;//o nó da esquerda do pai recebe o filho da direita do nó atual
            else///se o nó atual é um filho da direita
                parent.direita = current.direita;////o nó da direita do pai recebe o filho da direita do nó atual

          else{//se o nó a ser removido possuir dois filhos, então o nó com o numero de matricula seguinte ao nó a ser removido toma seu lugar
                No successor = getSuccessor(current);//chama o metodo getSuccessor que passa o nó atual como parametro e retorna o nó com a matricula seguinte ao nó a ser removido.
                if(current == raiz)//se o nó a ser removido for a raiz
                    raiz = successor;//o nó com numero de matricula seguinte toma o lugar da raiz
                else if(isLeftChild)//se o nó a ser removido é um filho do lado esquerdo
                    parent.esquerda = successor;//o nó com o numero de matricula seguinte toma o lugar do nó filho do lado esquerdo
                else//se o nó a ser removido é um filho do lado direito
                    parent.direita = successor;//o nó com o numero de matricula seguinte toma o lugar do nó filho do lado direito

                successor.esquerda = current.esquerda;//o filho do lado esquerdo do nó que possui a matricula seguinte ao nó a ser removido recebe atribuicao ao nó atual do lado esquerdo
          }
          return true;
    }
    public No getSuccessor(No delNode){//metodo que ajuda o metodo de remover, ao achar o nó com o número de matricula posterior ao passado como parametro, esse nó é retornado
                No successorParent = delNode;//variavel do tipo nó representando o nó pai do nó sucessor ao nó a ser removido que recebe por atribuição o valor do nó passado como parametro
		No successor = delNode;//variavel do tipo nó representando o nó sucessor ao nó a ser removido que recebe por atribuição o valor do nó passado como parametro
		No current = delNode.direita;////variavel do tipo nó representando o nó atual que recebe por atribuição o filho do lado direito do nó passado como parametro

		while(current != null){//enquanto o nó atual for diferente de nulo, repetir a operação
                        successorParent = successor;//o nó pai do nó sucessor recebe o sucessor
			successor = current;//o nó sucessor recebe o atual
			current = current.esquerda;//e o nó atual recebe o filho do lado esquerdo do nó atual
		}
		if(successor != delNode.direita){//se o nó sucessor for diferente do nó filho do lado direito do nó passado como parametro
			successorParent.esquerda = successor.direita;//o filho do lado esquerdo do nó pai do nó sucessor recebe o filho do lado direito do nó sucessor
		 	successor.direita = delNode.direita;//o nó filho do lado direito do nó sucessor recebe o filho do lado direito do nó passado como parametro
		}
		return successor;//retorna o nó que contem o numero de matricula seguinte ao passado como parametro
    }

    public void Imprimeemordem(No nodo){//método para impressao em ordem crescente do numero de matricula
            if(nodo==null) return;//se não existir o nodo, para a execução do metodo

            Imprimeemordem(nodo.esquerda);//chama o metodo recursivamente pro lado esquerdo
            if(nodo.valor.aprovado==true){//se o aluno foi aprovado na disciplina exibir:
                System.out.println("Matricula: "+nodo.valor.matricula);
                System.out.println("Nome:"+nodo.valor.nome);
                System.out.println("Disciplina: "+nodo.valor.disciplina);
                System.out.println("Resultado: Aprovado");
                System.out.println("");
            }else{//se o aluno nao foi aprovado na disciplina exibir:
                System.out.println("Matricula: "+nodo.valor.matricula);
                System.out.println("Nome:"+nodo.valor.nome);
                System.out.println("Disciplina: "+nodo.valor.disciplina);
                System.out.println("Resultado: Reprovado");
                System.out.println("");
            }
            Imprimeemordem(nodo.direita);//chama o metodo recursivamente pro lado direito
    }
}