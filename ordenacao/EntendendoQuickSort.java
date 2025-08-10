public class EntendendoQuickSort {
  public static void main(String[] args) {
    int[] vetor = {25, 57, 48, 37, 12, 92 , 86, 33};
    for(int i = 0; i < vetor.length ; i++) {
      System.out.print(vetor[i] + " ");
    }
    System.out.println("");
    quicksort(0, vetor.length-1, vetor);
    for(int i = 0; i < vetor.length ; i++) {
      System.out.print(vetor[i] + " ");
    }

  }
  public  static void quicksort(int inicio, int fim, int[] array) {
    if (inicio < fim) {
      int pIndex = partition(inicio, fim, array);
      quicksort(inicio, pIndex - 1, array);
      quicksort(pIndex + 1, fim, array);
    }
  }

  public static int partition(int inicio, int fim, int[] array) {
    int pivot = array[fim];
    int i = inicio - 1;

    for(int j = inicio; j < fim ; j++) {
      if(array[j] <= pivot) {
        i++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }

    int temp = array[i + 1];
    array[i + 1] = array[fim];
    array[fim] = temp;

    return i+1;

  }
}
