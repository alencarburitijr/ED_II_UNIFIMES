class BinarySearch {
    static String binarySearch(String arrayNossoDeCadaDia[], int inicio, int fim, int valor) {
        int meio;
        if (fim >= inicio) {
            meio = (inicio + fim) / 2;
            if (arrayNossoDeCadaDia[meio] == valor) {
                return (meio + 1).toString(); 
            }            
            else if (arrayNossoDeCadaDia[meio] < valor) {
                return binarySearch(arrayNossoDeCadaDia, meio + 1, fim, valor);            
            } else {
                return binarySearch(arrayNossoDeCadaDia, inicio, meio - 1, valor);
            }
        }
        return "-1";
    }

    public static void main(String args[]) {
        System.out.println("Teste");
        try{
        File file = new File();
        file.lerArquivoTxt();
        String arrayNossoDeCadaDia[] = new String[file.itensArquivo.size()];
        try{
        for(int i = 0; i < file.itensArquivo.size()-1; i++){
            // System.out.println(isNumeric(Integer.valueOf(file.itensArquivo.get(i))));
            String numero = file.itensArquivo.get(i);
            // int numero// arrayNossoDeCadaDia[i] = Integer.parseInt(file.itensArquivo.get(i));
        }
        }catch(NumberFormatException e){
            System.out.println("Erro");
        }
        String valor = "754046475";
        int n = file.itensArquivo.size();
        String resultado = binarySearch(arrayNossoDeCadaDia, 0, n - 1, valor);
        
        System.out.print("O(s) elemento do array é: ");

        // for (int i = 0; i < n; i++) {
        //     System.out.print(arrayNossoDeCadaDia[i] + " ");
        // }
        
        System.out.println();
        System.out.println("Elemento está presente na busca é: " + valor);
        
        if (resultado == "-1")
            System.out.println("Elemento não está presente no array");
        else
            System.out.println("Elemento presente é " + resultado + " na posição do array");
    } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}