import java.io.*;
import java.util.*;

public class File {
    public ArrayList<String> itensArquivo;

    public ArrayList lerArquivoTxt() throws IOException {
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
            while (linha != null) {                
                output = new String[14];

                output = linha.split(",");
                order = output[6];
                itensArquivo.add(order);                
                linha = br.readLine();
            }        
            Collections.sort(itensArquivo);
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        return itensArquivo;
    }

}
