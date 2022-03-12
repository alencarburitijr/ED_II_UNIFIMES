class BinarySearch {

    public static void main(String args[]) {
        System.out.println("Teste");
        try {
            File file = new File();
            file.lerArquivoTxt();
            String arrayNossoDeCadaDia[] = new String[file.itensArquivo.size()];
            try {
                for (int i = 0; i < file.itensArquivo.size() - 1; i++) {
                    System.out.println(i + " - " + file.itensArquivo.get(i));
                    arrayNossoDeCadaDia[i] = file.itensArquivo.get(i);
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro");
            }
            String valor = "754046475";
            int n = file.itensArquivo.size();
            boolean encontrou = false;
            int posicao =0;
            for(int i =0;i <file.itensArquivo.size(); i++){
                if( arrayNossoDeCadaDia[i].compareTo(valor) == 0){
                    encontrou = true;
                    posicao = i;
                }
            }
            if (encontrou){
                System.out.println("Busca Linear = Elemento presente é " + posicao + " na posição do array");
            }
            int resultado = buscaBinaria(arrayNossoDeCadaDia, 0, n - 1, valor);            
            
            System.out.println();
            System.out.println("Elemento está presente na busca é: " + valor);

            if (resultado == -1)
                System.out.println("Elemento não está presente no array");
            else
                System.out.println("Elemento presente é " + resultado + " na posição do array");

            
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    static int buscaBinaria(String arrayNossoDeCadaDia[], int inicio, int fim, String valor) {
        int meio;
        int result;
        if (fim >= inicio) {
            meio = (inicio + fim) / 2;
            result = arrayNossoDeCadaDia[meio].compareTo(valor);
            System.out.println("Resultado pesquisa: " + result);
            System.out.println("Procurado " + valor);
            System.out.println("Posicao " + arrayNossoDeCadaDia[meio]);
            if (result == 0) {
                return meio + 1;            
            }else if (result < 0) {
                return buscaBinaria(arrayNossoDeCadaDia, meio + 1, fim, valor);
            } else {
                return buscaBinaria(arrayNossoDeCadaDia, inicio, meio - 1, valor);
            }
        }
        return -1;
    }

}
