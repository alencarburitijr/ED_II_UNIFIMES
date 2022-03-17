import java.io.*;
import java.util.*;

public class ArvoreBinariaOrdenada {

    public static void main(String[] args) {
        
        double notas[] = new double[3];
        int matricula;
        String nome;
        String disciplina;
        String resposta;
        String respostaRepeticao;
        boolean continua=true;
        int RemoverMatricula;
        int funcao;
        boolean repeteOperacao=true;

        Arvore MaryJane = new Arvore();
        System.out.println("EXEMPLO DE ARVORE BINARIA");
        Scanner teclado = new Scanner(System.in);

        while(repeteOperacao==true){
            System.out.println("Digite:");
            System.out.println("1 para inserir nós na árvore");
            System.out.println("2 para remover nós da árvore");
            System.out.println("3 para exibir os nós da árvore em ordem crescente do número de matrícula");
            funcao = teclado.nextInt();
            if(funcao==1){
                continua=true;
                while(continua==true){
                    System.out.println("Digite a matricula do aluno que quer incluir na árvore");
                    matricula = teclado.nextInt();
                    System.out.println("Digite o nome do aluno que quer incluir na árvore");
                    nome=teclado.next();
                    System.out.println("Digite a disciplina do aluno que quer incluir na árvore");
                    disciplina=teclado.next();
                    for(int i=0;i<notas.length;i++){
                        System.out.println("Digite a "+(1+i)+"ª nota do aluno que quer incluir na árvore");
                        notas[i]=teclado.nextDouble();
                    }

                    Aluno UNIFIMES=new Aluno(matricula,nome,disciplina,notas);//cria objetos do tipo Aluno
                    MaryJane.insereNo(UNIFIMES);
                    resposta="";
                    System.out.println("Deseja incluir mais um aluno? (S/N)");
                    resposta=teclado.next();
                    if(resposta.equals("s")||resposta.equals("S")){
                        continua=true;
                    }
                    if(resposta.equals("n")||resposta.equals("N")){
                        continua=false;
                    }
                }
            }
            if(funcao==2){
                continua=true;
                while(continua==true){
                    System.out.println("Digite a matricula do aluno que deseja remover da árvore");
                    RemoverMatricula=teclado.nextInt();
                    MaryJane.removeNo(RemoverMatricula);
                    resposta="";
                    System.out.println("Deseja excluir mais um aluno? (S/N)");
                    resposta=teclado.next();
                    if(resposta.equals("s")||resposta.equals("S")){
                        continua=true;
                    }
                    if(resposta.equals("n")||resposta.equals("N")){
                        continua=false;
                    }
                }
            }
            if(funcao==3){
                continua=true;
                while(continua==true){
                    System.out.println("Impressão em ordem crescente de numero de matricula:");
                    System.out.println("");
                    MaryJane.Imprimeemordem(MaryJane.raiz);
                    System.out.println("");
                    resposta="";
                    System.out.println("Deseja exibir a arvore mais uma vez? (S/N)");
                    resposta=teclado.next();
                    if(resposta.equals("s")||resposta.equals("S")){
                        continua=true;
                    }
                    if(resposta.equals("n")||resposta.equals("N")){
                        continua=false;
                    }
                }
            }
            respostaRepeticao="";
            System.out.println("Deseja realizar outra operacao? (S/N)");
            respostaRepeticao=teclado.next();
            if(respostaRepeticao.equals("s")||respostaRepeticao.equals("S")){
                repeteOperacao=true;
            }
            if(respostaRepeticao.equals("n")||respostaRepeticao.equals("N")){
                repeteOperacao=false;
            }
        }
    }
}