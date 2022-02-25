import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        int[] aValores;
        aValores = new int[10000];

        System.out.println("Play no jogo... bora ... bora -> UF - SI -> 2022/001");

        // Sorteio entre amigos - numero unico

        // Primeiro grupo cria o array para armazenar os números sorteados

        // Segundo grupo cria o array para armazenar os números escolhidos
        int numeroSorteado;
        int numeroBuscado = 5;
        boolean lAchou = false;

        // 1 - Melhor caso
        // 2 - Caso médio
        // 3 - Pior caso
        // Scanner teclado = new Scanner(System.in);
        // int teste = teclado.nextInt();
        
        System.out.println(LocalDateTime.now());
        for (int i = 0; i < 10000; i++) {
            numeroSorteado = (int) (Math.random() * 100);
            System.out.println(numeroSorteado);
            aValores[i] = numeroSorteado;        

            if (numeroSorteado == numeroBuscado) {
                if (i == 0){
                    System.out.println("Top - encontramos o melhor caso, ou seja, o caso que demora menos tempo para executar e o primeiro a ser encontrado");                    
                    System.out.println(LocalDateTime.now());
                }else if (i == 9){
                    System.out.println("Como nem tudo são flores, está ai o nosso pior caso. E se todos os casos tiverem que ir até a última posição para encontrar... as vezes pode não encontrar.");                    
                    System.out.println(LocalDateTime.now());
                }
                System.out.println("Numero encontrado: Sorte no jogo . ");
                lAchou = true;
            }

        }

        if (lAchou) {
            System.out.println(
                    "Numero encontrado -> Ganhador do prêmio do conhecimento em complexidade de algoritmo foi iniciado");
        } else {
            System.out.println("Lamentavelmente vamos continuar nosso algoritmo buscando o Big O de log, quadratica e cubica nas próximas aulas com busca e ordenação");
        }

    }
}
