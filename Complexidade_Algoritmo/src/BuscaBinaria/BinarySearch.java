public class BinarySearch {
   

    public static void main(String args[]) {
        int arrayNossoDeCadaDia[] = { 0,1, 2, 3, 4 , 5 , 6, 7 ,8 , 9 ,10, 11 , 12, 13,14 ,15};
        int valor = 14;
        int n = arrayNossoDeCadaDia.length;
        int resultado = binarySearch(arrayNossoDeCadaDia, 0, n - 1, valor);
        
        System.out.print("O(s) elemento do array é: ");

        for (int i = 0; i < n; i++) {
            System.out.print(arrayNossoDeCadaDia[i] + " ");
        }
        
        System.out.println();
        System.out.println("Elemento está presente na busca é: " + valor);
        
        if (resultado == -1)
            System.out.println("Elemento não está presente no array");
        else
            System.out.println("Elemento presente é " + resultado + " na posição do array");
    }

    static int binarySearch(int arrayNossoDeCadaDia[], int inicio, int fim, int valor) {
        int meio;
        if (fim >= inicio) {
            meio = (inicio + fim) / 2;
            if (arrayNossoDeCadaDia[meio] == valor) {
                return meio + 1; 
            }            
            else if (arrayNossoDeCadaDia[meio] < valor) {
                System.out.println("1 - Encontrou o meio" + meio);
                return binarySearch(arrayNossoDeCadaDia, meio + 1, fim, valor);
            }
            else {
                System.out.println("1 - Encontrou o meio" + meio);
                return binarySearch(arrayNossoDeCadaDia, inicio, meio - 1, valor);
            }
        }
        return -1;
    }
}