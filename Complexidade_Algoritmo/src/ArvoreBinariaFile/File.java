import java.io.*;
import java.util.*;

public class File {
    public ArrayList<String> itensArquivo;
    
    public ArrayList lerArquivoTxt() throws IOException{
        itensArquivo = new ArrayList<String>();  
        System.currentTimeMillis();        
        String order;
        FileInputStream stream;
        String[] output;

        try {
            stream = new FileInputStream("c:\\temp\\aula_18_02_2022.txt");
            InputStreamReader reader = new InputStreamReader(stream);
            BufferedReader br = new BufferedReader(reader);
            String linha = br.readLine();
            while(linha != null) {
                // System.out.println(linha);                            

                output = new String[14];
                
                output = linha.split(",");
                order = output[6];
                itensArquivo.add(order);

                System.out.println(order);                            
                // System.out.println("Primeira forma de mostrar - Order Id: " + output[6]);
                // System.out.println("Segunda forma de mostrar Order Id: " + order);
                linha = br.readLine(); 
                
            }
            //Inserido após passar por todo o arquivo
            // itensArquivo.sort();
        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        }
       return itensArquivo;
    }

}
