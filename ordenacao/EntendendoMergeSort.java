public class EntendendoMergeSort {
  public static void main(String[] args) {

  }


  public static void mergeSort(int inicio, int fim, int[] array) {
    if (inicio < fim) {
      int meio = (inicio + fim) / 2;
      mergeSort(inicio, meio, array);
      mergeSort(meio +1, fim, array);
      //merge(array, inicio, meio, fim);
    }
  
  }

  public static void merge(int inicio, int meio, int fim, int[] array) {
    int n1 = meio - inicio + 1;
    int n2 = fim - meio;

    int[] esquerda = new int[n1];
    int[] direita = new int[n2];

    for(int i = 0; i < n1; i++) {
      esquerda[i] = array[inicio + 1];
    }

    for(int j = 0; j < n2; j++) {
      direita[j] = array[meio + 1 + j];
    }

    //
  }
}
