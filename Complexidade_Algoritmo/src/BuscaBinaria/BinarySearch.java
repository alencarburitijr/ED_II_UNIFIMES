
class BinarySearch {
    static int binarySearch(int arrayNossoDeCadaDia[], int inicio, int fim, int valor) {
        int meio;
        if (fim >= inicio) {
            meio = (beg + fim) / 2;
            if (arrayNossoDeCadaDia[meio] == valor) {
                return meio + 1; 
            }            
            else if (arrayNossoDeCadaDia[meio] < valor) {
                return binarySearch(arrayNossoDeCadaDia, meio + 1, fim, valor);
            
            else {
                return binarySearch(arrayNossoDeCadaDia, inicio, meio - 1, valor);
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arrayNossoDeCadaDia[] = { 8, 10, 22, 27, 37, 44, 49, 55, 69 };
        int valor = 37;
        int n = arrayNossoDeCadaDia.length;
        int resultado = binarySearch(a, 0, n - 1, valor);
        
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
}