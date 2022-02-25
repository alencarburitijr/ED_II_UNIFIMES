import java.io.*;
import java.util.*;

public class AnaliseCaso {
    private static ArrayList<SalesOrder> itensArquivo;

    public static void main(String[] args) throws IOException {
        itensArquivo = new ArrayList<SalesOrder>();
        String numeroProcurado = "892836844";
        int posicaoEncontrada = 0;
        Boolean lEncontrou = false;
        long inicio = 0;
        long fim = 0;

        // Iniciar pesquisa no arquivo        

        // Faz a leitura do arquivo
        lerArquivoTxt();
        // Desenvolver a função para mostrar se encontrou ou não
        // Dica: Criar um for para percorrer ao arraylist
        // Desenvolva a função para mostrar a posição encontrada
        // Dica: Criar uma variável para armazenas a posição quando a mesma for     
        System.out.println("Inicio da pesquisa - " + System.currentTimeMillis());          
        inicio = System.currentTimeMillis();
        for (int i = 0; i < itensArquivo.size(); i++) {            
            if (itensArquivo.get(i).OrderID.toString().equals(numeroProcurado.toString())) {
                lEncontrou = true;
                posicaoEncontrada = i;
                System.out.println("Encontrou o número na posição " + posicaoEncontrada);
            }            
        }
        if (lEncontrou){
            System.out.println("Encontrou o número na posição " + posicaoEncontrada);
        }
        fim = System.currentTimeMillis();
        System.out.println("Fim da pesquisa - " + System.currentTimeMillis());
        System.out.println("Tempo: " + (fim-inicio));


        // encontrada
        // Desenvolva a função para informar o tempo gasto até o pior caso
        // Dica: Imprir o CurrentTimeMillis
        // Desenvolva a função para encontrar o caso médio
        // Dica: Verificar o tamanho do array que recebeu as linhas e dividir por 2 é
        // uma opção

    }

    public static void lerArquivoTxt() throws IOException {

        System.currentTimeMillis();
        SalesOrder order;
        FileInputStream stream;
        String[] output;

        try {
            stream = new FileInputStream("c:\\temp\\aula_18_02_2022.txt");
            InputStreamReader reader = new InputStreamReader(stream);
            BufferedReader br = new BufferedReader(reader);
            String linha = br.readLine();
            while (linha != null) {
                order = new SalesOrder();            
                
                output = new String[14];

                output = linha.split(",");

                order.Region = output[0];
                order.Country = output[1];
                order.ItemType = output[2];
                order.SalesChannel = output[3];
                order.OrderPriority = output[4];
                order.OrderDate = output[5];
                order.OrderID = output[6];
                order.ShipDate = output[7];
                order.UnitsSold = output[8];
                order.UnitPrice = output[9];
                order.UnitCost = output[10];
                order.TotalRevenue = output[11];
                order.TotalCost = output[12];
                order.TotalProfit = output[13];

                itensArquivo.add(order);

                // System.out.println("Primeira forma de mostrar - Order Id: " + output[6]);
                // System.out.println("Segunda forma de mostrar Order Id: " + order.OrderID);
                linha = br.readLine();
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

    }

}
