import java.io.*;
import java.util.*;
//classe Aluno com cinco atributos representando os dados dos alunos 
public class Aluno {
    int matricula;
    String nome;
    String disciplina;
    double notas[];
    boolean aprovado;

    // construtor de Aluno para atribuir os valores iniciais aos atributos
    public Aluno(int matriculaAluno, String nomeAluno, String disciplinaAluno, double notasAluno[]) {
        matricula = matriculaAluno;
        nome = nomeAluno;
        disciplina = disciplinaAluno;
        notas = notasAluno;
        aprovado = Aprovacao();
    }

    // metodo aprovação para saber se o aluno foi aprovado ou não na disciplina
    // dependendo da soma das notas (true=aprovado) (false=reprovado)
    public boolean Aprovacao() {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        if (soma >= 70.0) {
            return true;
        } else {
            return false;
        }
    }
}